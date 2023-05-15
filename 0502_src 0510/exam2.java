public class exam2 {
    public static void main(String[] args) {
        // int dice1 = (int)(Math.random()*6) +1;
        // int dice2 = (int)(Math.random()*6) +1;

        // System.out.println(dice1 + dice2);

        // while (dice1 + dice2 == 5) {

        //     System.out.println();

        // }

            int dice1 = 0;
            int dice2 = 0;
            while(true)
            {
                // 주사위 두개를 던진다.

                if(5 == (dice1 + dice2))
                {
                    break;
                }

                dice1 = ((int) (Math.random() * 6)) + 1;
                dice2 = ((int) (Math.random() * 6)) + 1;

                System.out.printf("(%d, %d)\n" , dice1, dice2);
            }
    }
}
