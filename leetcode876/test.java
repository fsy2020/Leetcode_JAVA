package leetcode876;

public class test {
    public static void main(String[] args) {
        middleNode middleNode = new middleNode();
        ListNode head = new ListNode(0);
        middleNode.insert(5);
        middleNode.insert(4);
        middleNode.insert(3);
        middleNode.insert(2);
        middleNode.insert(1);
        middleNode.middle();
        middleNode.println();
    }
}
