package myLinkedList_707;

class MyLinkedList {

    class Node {
        int val;
        Node next;
        public Node (int val){
            this.val = val;
        }
    }

    int size;
    Node head;

    public MyLinkedList() {
        size = 0;
        head = new Node(0);
    }

    public int get(int index) {

        return 0;
    }

    public void addAtHead(int val) {

    }

    public void addAtTail(int val) {

    }

    public void addAtIndex(int index, int val) {

    }

    public void deleteAtIndex(int index) {

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */