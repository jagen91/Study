public class App {

    public static boolean bubbleSort2(int [] data)
    {
        int temp = 0;
        for (int i = 0; i < data.length-1; i++)
        {
            for (int k = 0; k < data.length - 1 - i; k++)
            {
                if (data[k]  > data[k + 1])
                {
                    temp = data[k];
                    data[k] = data[k + 1];
                    data[k + 1] = temp;                  
                
                }
            }
        }

        return true;
    }
    

    
    public static boolean bubbleSort(int [] data)
    {
        int temp;
        int count = data.length - 1;

        boolean bSwaped = false;

        // 배열 순회
        for(int i = 0; i < data.length - 1; i++)
        {
            // 비교
            for(int j = 0; j < count; j++)
            {
                // 현재 요소의 값과 다음 요소의 값을 비교
                if(data[j] > data[j + 1])
                {
                    bSwaped = true;
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }

            }

            if (bSwaped == false)
            {
                return true;

            }
            else
            {
                // 스왑변수 초기화.
                bSwaped = false;

            }
            
            count--;
        }

        return true;
    }

    
    public static void printData(int [] data)
    {
        for(int i = 0; i < data.length; i++)
        {
            System.out.printf("%d\t", data[i]);
        }
    }



    public static void main(String[] args) throws Exception {

        int [] data = new int[]{2,1,3,4,5};
    
        bubbleSort(data);

        printData(data);
    }
}
