package jw_Stack;

public class Stack {
    private int[] stackArray;
    private int sp;

    public Stack()
    {   
        sp = 0;
        stackArray = null;
    }
    
    public Stack(int num)
    {   
        sp = 0;
        stackArray = new int[num];
    }

    public boolean isOver(int dataNum)
    {
        if(dataNum > stackArray.length)
        {
            return false;
        }

        else
        {
            return true;
        }
    }

    public boolean push(int num)
    {        
        if((sp + 1) > stackArray.length)
        {
            return false;
        }

        else
        {   
            stackArray[sp] = num;
            sp++;
            return true;
        }
        
        
    }

    public boolean pop(int dataNum)
    {
        if(sp < dataNum)
        {
            return false;
        }
        else
        {   for(int i = 0; i < dataNum; i++)
            {
                stackArray[sp -1] = 0;
                sp--;
            }
            
            return true;
        }      
    }

    public void printAll()
    {   
        for(int i = 0; i < stackArray.length; i++)
        {
        System.out.printf("%d\t", stackArray[i]);
        }

        System.out.println();
    }
}
