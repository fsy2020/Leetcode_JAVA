package leetcode876;

public class middleNode {
    int size;
    ListNode head;

    public middleNode(){
        size = 0 ;
        head=  new ListNode(0);
    }


    public void println(){
        ListNode node = head;
        while(node.next!=null){
            System.out.print(node.val+"->");
            node = node.next;
        }
    }


    //头插法实现
    public void insert(int k){
        ListNode temp = new ListNode(k);
        temp.next = head;
        head = temp;
        size++;

    }

    //改错，while条件中错误，请改正。
    public void middle(){

        ListNode pre = head.next;
        ListNode cur = head.next;
        while(cur !=null && cur.next!=null){
            pre = pre.next;
            cur = cur.next.next;
        }
        head = pre;

    }


    public static void main(String[] args) {

    }

}
