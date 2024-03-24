class MyLinkedList {
    private class Node {
        int val;
        Node next;
        
        Node(int val) {
            this.val = val;
        }
    }
    
    Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;
        
        Node node = head;
        for (int i = 0; i < index; i++)
            node = node.next;
        return node.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        if (size == 0) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node tail = head;
        while (tail.next != null)
            tail = tail.next;
        tail.next = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size)
            return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node prev = head;
        for (int i = 0; i < index - 1; i++)
            prev = prev.next;
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        Node prev = head;
        for (int i = 0; i < index - 1; i++)
            prev = prev.next;
        prev.next = prev.next.next;
        size--;
    }
}
