public class MyLinkedlist<E> {
    public class Node{
        private Node next ;
        private Object data ;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData(){
            return this.data ;
        }
    }
    // PT dau tien cua ds LK
    private Node head ;
    // SL PT trong ds
    private int numNodes = 0 ;
    public MyLinkedlist(){

    }
    public void addFist(E element){
        // khai bao 1 bien la temp tro den gt cua head
        Node temp = head ;
        // bien head se nhan gt la 1 Node moi
        head = new Node(element);
        // tro head den pt dau tien
        head.next = temp ;
        numNodes++;
    }
    public void addLast(E element){
        // khai bao 1 bien temp
        Node temp = head;
        // tro toi pt cuoi cung
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }
    public void add(int index ,E element){
        // khi ba bien temp tro den head
        Node temp = head ;
        // khai bao 1 node la hoder
        Node hoder ;
        // cho con tro chay den vi tri index-1
        for (int i= 0 ; i< index-1 && temp.next != null ; i++){

        }
    }
}
