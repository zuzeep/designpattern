package structural.proxy;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 代理模式实现copyOnWrite的queue
 *
 * @param <E>
 */
public class SimpleQueueProxy<E> implements SimpleQueue<E>{

    private SimpleQueueImpl<E> queue;
    final ReentrantLock lock = new ReentrantLock();

    public SimpleQueueProxy(){
        queue = new SimpleQueueImpl<>();
    }

    @Override
    public boolean offer(E e) {
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            SimpleQueueImpl<E> newQueue = (SimpleQueueImpl<E>)queue.clone();
            newQueue.offer(e);
            setQueue(newQueue);
            return true;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public E poll() {
        return queue.poll();
    }

    @Override
    public E peek() {
        return queue.peek();
    }

    private void setQueue(SimpleQueueImpl newQueue){
        this.queue = newQueue;
    }
}
