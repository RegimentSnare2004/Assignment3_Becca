public class DLNode<E> {
    public E data;
    public DLNode next;
    public DLNode previous;

    public DLNode(E s){
        data = s;
        next = null;
        previous = null;
    }
}
