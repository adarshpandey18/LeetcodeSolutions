class BrowserHistory {
    private class Node {
        String url;
        Node next;

        Node() {}

        Node(String url) {
            this.url = url;
        }
    }

    Node head;
    int size = 0;
    int position = 0;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        size++;
    }

    public void visit(String url) {
        Node node = head;
        for (int i = 0; i < position; i++) {
            node = node.next;
        }
        Node newNode = new Node(url);
        newNode.next = node.next;
        node.next = newNode;
        size = position + 2;
        position++;
    }

    public String back(int steps) {
        int targetPosition = Math.max(0, position - steps);
        Node node = head;
        for (int i = 0; i < targetPosition; i++) {
            node = node.next;
        }
        position = targetPosition;
        return node.url;
    }

    public String forward(int steps) {
        int targetPosition = Math.min(size - 1, position + steps);
        Node node = head;
        for (int i = 0; i < targetPosition; i++) {
            node = node.next;
        }
        position = targetPosition;
        return node.url;
    }
}
