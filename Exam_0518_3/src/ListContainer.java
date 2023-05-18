public class ListContainer {
    
    public Node header;       // 노드의 시작점.
    public int nodeCount;     // 노드의 개수

    private Node getLastNode()
    {
        Node target = header;

        if(nodeCount == 0)
            return null;

        for(int i = 0; i < nodeCount - 1; i++)
        {
            target = target.next;
        }
        return target;
    }

    public boolean insertNode(Node node)
    {
        // 노드의 개수가 0인경우는 head에 넣고
        // 그렇지 않은 경우는 제일 마지막에 넣어준다.

        Node lastNode = null;

        if(nodeCount == 0)
        {
            header = node;
        }
        else
        {
            lastNode = getLastNode();
            lastNode.next = node;
        }
        nodeCount++;
        return true;
    }

    //노드를 지운다.

    public boolean deleteNode(int index)
    {

    }

    //노드를 가지고온다.

    public Node getNode(int index)
    {

    }

    // 옵션 

    public void printAll()
    {

    }




}
