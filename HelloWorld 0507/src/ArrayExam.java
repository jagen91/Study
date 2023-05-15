public class ArrayExam {
    public static void main(String[] args) {

        // 배열은 int[] : 일반적으로 일차원배열.
        // 2차원배열, 3차원배열, 4차원배열, ...==> 다차원배열.




        // int[] ar1 = {11, 22, 33, 44, 55};
        // //  ↑  ↓  같은 코드
        // int[] ar2 = new int[]{11, 22, 33, 44, 55};
        // int[] ar3 = new int[5];


        // ar3[0] = 10;
        // ar3[1] = 20;
        // ar3[2] = 30;
        // ar3[3] = 40;
        // ar3[4] = 50;

        // for (int i = 0; i < ar3.length; i++)
        // {
        //     System.out.println(ar3[i]);
        // }


        // double[] ar = new double[]{1.0, 2.0, 3.0, 4.0};

        // double[] ar2 = new double[4];

        // ar2[0] = 1.0;
        // ar2[1] = 2.0;
        // ar2[2] = 3.0;
        // ar2[3] = 4.0;


        // double[] ar3 = {1.0, 2.0, 3.0, 4.0};




        // for (int i = 0; i < ar2.length; i++)
        // {
        //     System.out.println(ar2[i]);
        // }


        // for (int i = 0; i < ar.length; i++)
        // {
        //     System.out.println(ar[i]);
        // }

        // for (int i = 0; i < ar3.length; i++)
        // {
        //     System.out.println(ar3[i]);
        // }




        // int[][] arr = new int [2][3]   <== int 바로뒤에붙는게
        //  n   2번째가  t   ↑ int 3 개짜리가 2개 

        // int[][] arr = new int [2][3][4]   <== int 바로뒤에붙는게
        //  n   2번째가  t   ↑ int [3][4] 개짜리가 2개 

        // int [] ar1 = new int[6];
        // int [][] ar2 = new int[3][2];   // 사이즈는 같음 접근방식이 다름

        // System.out.println("------");





        // int [][] ar4 = new int[3][4];
        // int [][] ar5 = new int[][]{
        //     {11, 22, 33, 44},
        //     {111, 222, 333, 444},
        //     {1111, 2222, 3333, 4444},
        // };

        // int [][] ar6 = {
        //     {11, 22, 33, 44},
        //     {111, 222, 333, 444},
        //     {1111, 2222, 3333, 4444},
        // };


        // int[][][] ar7 = new int[3][2][2];
        // int[][][] ar8 = new int[][][]{
        //     {{11, 22},{2, 3}},
        //     {{123, 343},{3, 4}},
        //     {{1233, 2342,},{4, 5}},
        // };
        
        // 1. 로또 번호를 저장해야합니다.
        // 랜덤번호 6개 필요함.
        int [] lotto = new int[6];

        // 2. 중학교 국어, 영어, 수학 성적을 저장해야한다.
        int [][][] grade = new int[3][2][3];
        // System.out.println(grade.length);
        // System.out.println(grade[0].length);
        // System.out.println(grade[0][0].length);
        




        // 1학년 국영수 성적입력
        // 1-1학기
        grade[0][0][0] = 59;
        grade[0][0][1] = 51;
        grade[0][0][2] = 45;
        // 1-2학기
        grade[0][1][0] = 80;
        grade[0][1][1] = 82;
        grade[0][1][2] = 84;
        
        // 2학년 국영수 성적입력
        // 2-1 학기
        grade[1][0][0] = 52;
        grade[1][0][1] = 57;
        grade[1][0][2] = 45;
        // 2-2 학기
        grade[1][1][0] = 84;
        grade[1][1][1] = 88;
        grade[1][1][2] = 75;

        // 3학년 국영수 성적입력
        // 3-1 학기
        grade[2][0][0] = 100;
        grade[2][0][1] = 90;
        grade[2][0][2] = 86;
        // 3-2 학기
        grade[2][1][0] = 94;
        grade[2][1][1] = 93;
        grade[2][1][2] = 85;

        int cls = 1;
        for (int i = 0; i < grade.length; i++)    //  학년  3바퀴
        {
            System.out.println(cls + "학년");

            for (int j = 0; j < grade[i].length; j++)      //  학기  2바퀴
            {
                for (int k = 0; k < 3; k++)    // 국영수 3바퀴
                {
                    System.out.println(grade[i][j][k]);
                }

            }
            cls++;
        }



        // 3. 날씨 (맑음, 흐림, 비, 눈) 1년 날씨를 저장해야한다.
        String [] weather = new String[365];


    }
}