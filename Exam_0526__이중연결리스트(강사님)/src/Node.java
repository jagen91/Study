public class Node {
    public static final int START_POS = Integer.MIN_VALUE;
    public static final int END_POS = Integer.MAX_VALUE;

    private int key;
    private String value;

    Node prev;  //이전 노드 포인터
    Node next;  //다음 노드 포인터

    public Node()
    {
        key = 0;
        value = "";
    }

    public Node(int key, String value)
    {
        this.key = key;
        this.value = value;
    }

    public int getKey()
    {
        return key;
    }

    public void setKey(int key)
    {
        this.key = key;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public Node getPrev()
    {
        return prev;
    }

    public void setPrev(Node prev)
    {
        this.prev = prev;
    }

    public Node getNext()
    {
        return next;
    }
    
    public void setNext(Node next)
    {
        this.next = next;
    }
}

