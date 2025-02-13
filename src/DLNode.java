public class DLNode {
    public Object data;
    public DLNode next;
    public DLNode previous;

    public DLNode(Object s){
        data = s;
        next = null;
        previous = null;
    }
}
