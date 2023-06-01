import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. M4A1 | 2. Tac_50 | 3. AK_47 | 4. DesertEagle" );
        System.out.println("총을 입력하세요");

        int type = scan.nextInt();
        Gun gun = null;

        switch (type)
        {
            case 1:
                gun = new M4A1();
            break;

            case 2:
                gun = new Tac_50();
            break;

            case 3:
                gun = new AK_47();
            break;

            case 4:
                gun = new DesertEagle();
            break;
        }
        gun.caliber();
        gun.type();
    }
}
