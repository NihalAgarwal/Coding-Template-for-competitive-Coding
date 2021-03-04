package Helper;

public class MyLinkedList{
    ListNode head;
    MyLinkedList(String string){
        ListNode temp = new ListNode(0);
        this.head = temp;
        for(String val : string.replaceAll("[\\[{\\]}]", "").split(",")){
            temp.next = new ListNode(Integer.parseInt(val));
            temp = temp.next;
        }
        this.head = head.next;
    }
    public void addLast(int val){
        ListNode temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = new ListNode(val);
        temp = temp.next;
    }
    public String toString(){
        StringBuilder str = new StringBuilder();
        ListNode temp = head;
        while(temp != null) {
            str.append(temp.val).append(", ");
            temp = temp.next;
        }
        str.deleteCharAt(str.length()-1);
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }
}

