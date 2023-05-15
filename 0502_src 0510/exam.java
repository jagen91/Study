public class exam {
    public static void main(String[] args) {
    //     int num = 0;
    //     for (int i = 0; i < 100; i++) 
    //     {
    //         if(i % 3 == 0)
    //         num += i;

    //         else continue;
    //         System.out.println("num =" + num);
    //     }
    // }

    int num = 1;
    int total = 0;
    for (int i = 0; i < 100; i++)
    {
        if (num % 3 ==0)
        {
        
            total = total +num;
        }

        num++;
    }

    System.out.println(total);
}
}
