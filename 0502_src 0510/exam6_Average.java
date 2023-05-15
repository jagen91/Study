public class exam6_Average {
    public static void main(String[] args) {
        
        int[][] array = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
        };

        int sum = 0;
        double avg = 0.0;
        
        int avg_su = 0;
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                sum += array[i][j];
                avg_su += 1;
            }
        }

        avg = sum / avg_su;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);

    }
}
