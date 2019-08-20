package structural.proxy;

public interface SimpleQueue<E> extends Cloneable{

    boolean offer(E e);
    E poll();
    E peek();
}
