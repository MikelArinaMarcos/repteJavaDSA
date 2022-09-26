public class QueueImpl<T> implements Queue<T> {

    T[] objects;
    int p;

    public QueueImpl(T t) {
    }

    @Override
    public void push(T t) throws FullQueueException {
        if(isFull()) throw new FullQueueException();
        objects[p++] = t;
    }

    private boolean isFull() {
        return false;
    }

    @Override
    public T pop() {

        if(isEmpty()){
            T primer = objects[0];
        }

        return null;
    }

    private boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return this.p;
    }
}
