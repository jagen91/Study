package jw_Stack;

import java.util.Scanner;

public class Stackqueque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;
        int menu;
        int number;
        int intNumber;
        // App에서 숫자를 넣으면 숫자만큼 배열 생성을해 Stack에서 싱글톤 ㄴㄴ
        Stack stack = new Stack();
        
        do{
            
            System.out.println("------------------------------------------------------");
            System.out.println("0.데이터배열 만들기 | 1.데이터넣기 | 2. 데이터빼기 | 3.데이터 보여줘 | 4.종료");
            System.out.println("------------------------------------------------------");
            System.out.printf("선택>");
            userInput = scan.nextLine();
            menu = Integer.parseInt(userInput);

            switch(menu)
            {   
                case 0 :
                System.out.printf("몇개짜리 배열만들래? >");
                userInput = scan.nextLine();
                number = Integer.parseInt(userInput);
                stack = new Stack(number);
                System.out.println(number + "개 짜리 배열 만듬");
                break;

                case 1 :
                // 데이터를 계속 넣어줘 언제까지? 넣고싶을때까지
                System.out.printf("몇개 넣고싶어? >");
                userInput = scan.nextLine();
                number = Integer.parseInt(userInput);
                if(false == stack.isOver(number))
                {
                    System.out.println("------------------------------------------------------");
                    System.out.println("다시 입력해주세요 초과함");
                }
                else
                {
                    for(int i = 0; i < number; i++)
                    {
                        System.out.printf("입력>");
                        userInput = scan.nextLine();
                        intNumber = Integer.parseInt(userInput);
                        if(false == stack.push(intNumber))
                        {   
                            System.out.println("------------------------------------------------------");
                            System.out.println("입력이 초과되었어요");
                            break;
                        }
                    }
                    
                }
                System.out.println("입력이 완료 되었습니다.");
                
                break;

                case 2 :
                System.out.printf("몇개 빼고싶어?");
                userInput = scan.nextLine();
                number = Integer.parseInt(userInput);

                if(false == stack.pop(number))
                {   
                    System.out.println("------------------------------------------------------");
                    System.out.println("너무 많이뺏어요 다시 입력");
                    
                }
                else
                {
                    System.out.println("잘 빠졌습니다.");
                }
                
                break;

                case 3 :
                stack.printAll();
                break;

                case 4 :
                break;
            }
        }while(menu != 4);
        


        // int[]data = new int[7];

        // int rear = 0;

        // while(true)
        // {
        //     rear = (rear + 1) % 7;
        //     System.out.println(rear);
        // }
    }
}
