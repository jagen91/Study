public class ListContainer {
    public Node header;         // 노드의 시작점
    public int nodeCount;       // 노드의 개수

    private Node getLastNode()
    {
        Node target = header;

        if (nodeCount == 0)
            return null;
        
        for (int i = 0; i < nodeCount - 1; i++)
        {
            target = target.next;

        }

        return target;

    }


    public boolean insertNode(Node node)
    {
        Node lastNode = null;

        if (nodeCount == 0)
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

    public boolean deleteNode(int index)
    {
        Node target = header;
        Node before = null;

        if ((index < 0) || (index >= nodeCount))
            return false;
        
        if (index == 0)        
        {
            header = target.next;

        }
        else
        {
            for (int i = 0; i < index; i++) 
            {
                before = target;
                target = target.next;
                
            }

            before.next = target.next;

        }

        nodeCount--;
        return true;
        

    }


    public Node getNode(int index)
    {
        Node target = header;
        
        if ((index < 0) || (index >= nodeCount))
            return null;

        // target을 찾는다.
        for (int i = 0; i < index; i++)
        {
            target = target.next;
        }
        
        // 노드를 만들고 target의 내용을 복사한다.
        Node node = new Node(target.value);

        return node;

    }

    public void printAll()
    {
        Node target = header;
        for (int i = 0; i  < nodeCount; i++)
        {
            System.out.printf("%dth %d, %s\n", i, target.value, target.next);
            target = target.next;

        }

    }

}
