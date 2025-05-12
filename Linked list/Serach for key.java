
// User function Template for Java

/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node temp=head;
        int i=0;
        while(i<n){
            if(key==temp.data){
                return true;
            }
            temp=temp.next;
            i++;
        }
        return false;
        
    }
}