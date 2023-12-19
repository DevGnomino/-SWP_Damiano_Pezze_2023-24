public class MyNode<E> {
    private E value;
    private MyNode<E> next;
    private MyNode<E> prev;

    public MyNode(E value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public void setValue(E value) {
        this.value = value;
    }


    public void setNext(MyNode<E> next) {
        this.next = next;
    }

    public void setPrev(MyNode<E> prev) {
        this.prev = prev;
    }

    public E getValue() {
        return value;
    }

    public MyNode<E> getNext() {
        return next;
    }

    public MyNode<E> getPrev() {
        return prev;
    }
}
