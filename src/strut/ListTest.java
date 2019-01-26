package strut;

import sun.security.util.Length;

/**
 *
 * 链表的遍历
 * */
public class ListTest {


    int ListLength(ListNode headNode){
        int length=0;
        ListNode currentNode = headNode;
        while(currentNode != null){
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

}
