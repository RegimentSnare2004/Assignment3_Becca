public class DLlist<E> {
    private DLNode head;
    private DLNode tail;

    public DLlist(){
        head = null;
        tail = null;
    }

    public void addy(E s){
        DLNode newNode = new DLNode(s);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;

        }
    }

    public void removy(int pos){
        DLNode current = head;
        DLNode previous = null;

        if(pos == 1){
            head = current.next;
            current.previous = null;
        }
        for(int i = 1; current != null && i < pos; i++){
            previous = current;
            current = current.next;
        }
        if(current != null && previous != null){
            previous.next = current.next;
            current.next.previous = previous;
        }



    }

    public String toString(){
        String elements = "";
        DLNode current = head;
        while(current != null){
            elements += current.data.toString();
            current = current.next;
        }
        return elements;
    }

}
