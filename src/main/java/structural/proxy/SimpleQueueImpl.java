package structural.proxy;

import java.util.Arrays;

class SimpleQueueImpl<E> implements SimpleQueue<E> {

    private Object[] queue = {};

    @Override
    public boolean offer(E e) {
        if(e == null)
            throw new NullPointerException();

        queue = Arrays.copyOf(queue, queue.length+1);
        queue[queue.length-1] = e;
        return true;
    }

    @Override
    public E poll() {
        if(isEmpty())
            return null;
        E e = (E)queue[queue.length-1];
        queue = Arrays.copyOf(queue, queue.length-1);
        return e;
    }

    @Override
    public E peek() {
        if(isEmpty())
            return null;
        return (E)queue[0];
    }

    public boolean isEmpty(){
        return queue == null || queue.length == 0;
    }

    public Object clone(){
        try{
            SimpleQueueImpl<E> clone = (SimpleQueueImpl<E>)super.clone();
            return clone;
        }catch (CloneNotSupportedException e){
            throw new InternalError();
        }
    }
}
