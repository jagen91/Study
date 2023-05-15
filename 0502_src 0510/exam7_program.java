import java.util.Scanner;

public class exam7_program {
    public static void main(String[] args) {
        boolean run = true;
		int scores [] = null;
		int studentNo = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("--------------------------------------------------------\n"

				+ "1. 학생수 | 2. 점수입력 | 3. 점수 리스트 |4. 분석 | 5. 종료\n"

				+ "--------------------------------------------------------");

			while (run == true) {
				System.out.println("선택>");
                int selectNo = scanner.nextInt();
				if (selectNo == 1)
                {
					System.out.println("학생 수>");
					studentNo = scanner.nextInt();
				} 
                else if (selectNo == 2) 
                {
				scores = new int[studentNo]; 
					for ( int i=0; i<studentNo; i++) 
                    {
						System.out.println("scores["+i+"]");
						scores[i] = scanner.nextInt();
                    }
				} 
                else if (selectNo == 3) 
                {
					for ( int i=0; i<studentNo; i++) 
                    {
						System.out.println("scores["+i+"]= " + scores[i]);
                    }
				}
                 else if (selectNo == 4) 
                { 
					int max = scores[0];
					int sum = 0;
					for ( int i=0; i<studentNo; i++) 
                    {
						if (max <= scores[i]) 
                        {
							max = scores[i];
                        }
				    }
					for ( int i=0; i<studentNo; i++) 
                    {
						sum =+ scores[i];
                    }

					int avg = sum / studentNo;		

					System.out.println("최고점수: " + max);
					System.out.println("평균: " + avg);
                    } 
                    else if (selectNo == 5) 
                    { 
						run = false;
						System.out.println("프로그램 종료");
                    }
			}
		
		}
    }