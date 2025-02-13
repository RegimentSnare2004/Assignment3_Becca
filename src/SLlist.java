public class SLlist {
    private SNode head;
    private SNode tail;

    public SLlist(){
        head = null;
        tail = null;
    }

    public void addy(Object s){
        SNode newNode = new SNode(s);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removey(int pos){
        SNode current = head;
        SNode previous = null;

        if(pos == 1){
            head = current.next;
        }
        for(int i = 1; current != null && i < pos; i++){
            previous = current;
            current = current.next;
        }
        if(current != null && previous != null){
            previous.next = current.next;
        }

    }

    public String toString(){
        String elements = "";
        SNode current = head;
        while(current != null){
            elements += "Song Name: " + current.data.title + ", Artist: " +
                    current.data.author + ", Price: " + current.data.price + "\n";
            current = current.next;
        }
        return elements;
    }
}
