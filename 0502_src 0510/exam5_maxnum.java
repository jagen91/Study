public class exam5_maxnum {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 8, 2};

        // 최대값 초기값 세팅
        int max = array[0];

        // 최대값 구하기
        for (int num : array)
        {
            if(num > max)
            {
                max = num;
            }
        }
        
        System.out.println(max);

/////////////////////////////////////////////////////////////////////
        
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }

        System.out.println(max);
    }
}
