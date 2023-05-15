import java.util.Scanner;;

public class exam8_program {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String userInput = null;
    int stuNum = 0; //학생수
    int [] scores = null;  // 성적배열
    int highScore = 0; // 최고점수
    int menu = 0;
    int total = 0;

        do {
            System.out.println("-------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------------");
            System.out.printf("선택>");
            userInput = scan.nextLine();

            menu = Integer.parseInt(userInput); // String타입의 숫자를 int타입으로 변환해주는 녀석

            switch(menu)
            {
                case 1 : // 학생수
                    System.out.printf("학생수>");
                    userInput = scan.nextLine();
                    stuNum = Integer.parseInt(userInput);
                break;

                case 2 : // 점수입력
                    // 1. 배열을 만든다.
                    if (stuNum != 0)  // 학생수가 0이 아니라면
                        scores = new int[stuNum];

                        // 2. 점수를 입력받아 배열에 넣는다.
                    System.out.println("점수입력");
                    for(int i = 0; i < stuNum; i++)
                    {
                        System.out.printf("score[%d]>", i);
                        userInput = scan.nextLine();
                        scores[i] = Integer.parseInt(userInput);
                    }
                break;
                case 3 :
                    System.out.println("점수리스트");
                    for(int i = 0; i < stuNum; i++)
                    {
                        System.out.printf("score[%d] : %d\n", i, scores[i]);
                    }
                break;
                case 4 :
                    System.out.println("분석");
                    // 1. 최고점수
                    if (scores != null)
                    {
                        highScore = scores[0];
                        for (int i = 1; i < scores.length; i++)
                        {
                            if (highScore < scores[i])
                            {
                                highScore = scores[i];
                            }
                        }
                        System.out.println("최고 점수 : " + highScore);
                    }
                    // 2. 평균점수
                    for (int i = 0; i < stuNum; i++)
                    {
                        total += scores[i];
                    }
                    System.out.println("평균 점수 : " + (total/stuNum));
                break;

                default :
                break;
            }

            // 1 사용자에게 숫자를 하나 받는다.(메뉴)

        }while(menu != 5);

        System.out.println("Bye!");
    }
}
