public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = {14, 15, 2, 68, 1, 84, 51, 8};

        for (int i = 0; i < arr.length -1; i++)
        {
            for(int j = 0; j < arr.length -1 -i; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("배열");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
