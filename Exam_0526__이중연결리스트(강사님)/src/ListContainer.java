public class ListContainer {

    private Node header;
    private Node tail;
    private int size;

    public ListContainer()
    {
    }

    public Node getHeader() 
    {
        return this.header;
    }

    public void setHeader(Node header)
    {
        this.header = header;
    }

    public Node getTail()
    {
        return this.tail;
    }

    public void setTail(Node tail)
    {
        this.tail = tail;
    }

    // 추가
    // 앞에 추가
    // return : 추가한 위치 인덱스, 추가가 실패한경우 -1
    public int addToFront(Node newNode)
    {
    if(header == null)
    {
        header = newNode;
        tail = newNode;
    }
    else
    {
        newNode.setNext(header);
        header.prev = newNode;
        header = newNode;
    }
    size++;

    return 0;
    }

    public int addToEnd(Node newNode)
    {
        if(tail == null)
        {
            tail = newNode;
            header = newNode;
        }
        else
        {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;

        return size - 1;
    }

    public int insertNode(Node newNode, int pos)
    {        
        if(pos <= 0 || header == null)
        {
            return addToFront(newNode);
        }
        else if(pos >= size)
        {
            return addToEnd(newNode);
        }
        else
        {
            Node currentNode = header;
            int currentPosition = 0;

            while (currentPosition < pos - 1)
            {
                currentNode = currentNode.getNext();
                currentPosition++;
            }

            newNode.setNext(currentNode.getNext());
            newNode.setPrev(currentNode);
            currentNode.getNext().setPrev(newNode);
            currentNode.setNext(newNode);
            size++;

            return pos;
        }

    }
    public int insertNode(int key, String value, int pos)
    {
        return insertNode(new Node(key, value), pos);
    }

    // 삭제
    // 위치 (pos)로 삭제
    public boolean deleteNode(int pos)
    {

        return false;
    }

    public boolean deleteNodebykey(int key)
    {
        return false;
    }

    // bLike : true =-> value를 포함한 노드까지 지운다.
    // bLike : false =-> 정확하게 같은것만 지운다.
    public boolean deleteNodebyvalue(String value, boolean bLike)
    {
        return false;
    }



    // 프린트 (옵션)
}
