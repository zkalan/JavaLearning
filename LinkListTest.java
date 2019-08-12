class LinkListNode{
    public Object data;
    public LinkListNode next;

    LinkListNode(Object o, LinkListNode n){
        this.data = o;
        this.next = n;
    }
}

class LinkList{
    private LinkListNode head;

    LinkList(){
        this.head = null;
    }

    LinkList(LinkListNode n){
        this.head = n;
    }

    public void insert(LinkListNode n){
        LinkListNode l = new LinkListNode(null, null);
        l = this.head;
        if(l == null){
            this.head = n;
        } else {
            while(l.next != null){
                LinkListNode t = l.next;
                l.next = l.next.next;
                l = t;
            }
            l.next = n;
            this.head = l;
        }
    }

    public int length(){
        LinkListNode l = new LinkListNode(null, null);
        l = this.head;
        int i = 0;
        while(l != null){
            l = l.next;
            i++;
        }
        return i;
    }
}

public class LinkListTest{

    public static void main(String[] args){
        LinkList l = new LinkList();
        LinkListNode n1 = new LinkListNode(null, null);
        LinkListNode n2 = new LinkListNode(null, null);
        LinkListNode n3 = new LinkListNode(null, null);
        LinkListNode n4 = new LinkListNode(null, null);
        LinkListNode n5 = new LinkListNode(null, null);
        l.insert(n1);
        l.insert(n2);
        l.insert(n3);
        l.insert(n4);
        l.insert(n5);
        System.out.println(l.length());
    }

}



