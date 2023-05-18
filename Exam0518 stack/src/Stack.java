public class Stack {
    
    public int Maxsize;
    public int Sp;
    public int[] StackArray;


    public Stack()
    {

    }

    public Stack(int size) 
    {
        Maxsize = size;
        Sp = 0;
        StackArray = new int[Maxsize];
    }


    public boolean isFull()
    {
        return (Sp == Maxsize);
    }


    public boolean push(int value)
    {
        if (isFull() == false)
        {
            StackArray[Sp] = value;
            Sp = Sp + 1;
            return true;
        }
        else
        {
            System.out.println("스택이 꽉 찼습니다.");
            return false;
        }
    }
    


    public boolean isEmpty()
    {
        return (Sp == 0);
    }


    public boolean pop()
    {
        if (isEmpty() == false)
        {
            Sp = Sp - 1;
            return true;
        }
        else
        {
            System.out.println("스택이 비었습니다.");
            return false;
        }
    }

    public int peek()
    {
        if (isEmpty() == false)
        {
            return StackArray[Sp - 1];
        }
        else
        {
            System.out.println("스택이 비었습니다.");
            return 0;
        }
    }



}
