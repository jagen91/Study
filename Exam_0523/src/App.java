public class App {
    public static void main(String[] args) throws Exception {

        Friend[] Friends = new Friend[10];


        Friends[0] = new UnivFriend("홍길동", "컴퓨터공학", "1111-2121");
        Friends[1] = new UnivFriend("김길동", "경영학", "1111-3121");
        Friends[2] = new UnivFriend("장길동", "국문학", "1111-2421");
        Friends[3] = new UnivFriend("임길동", "영문학", "1111-2151");
        Friends[4] = new UnivFriend("윤길동", "조리학", "1111-2421");
        Friends[5] = new CompFriend("홍길동", "컴퓨터공학", "1111-21221");
        Friends[6] = new CompFriend("김길동", "경영학", "11311-3121");
        Friends[7] = new CompFriend("장길동", "국문학", "1111-2421");
        Friends[8] = new CompFriend("임길동", "영문학", "1111-2151");
        Friends[9] = new CompFriend("윤길동", "조리학", "1111-2421");
        for (int i = 0; i < Friends.length; i++) 
        {
            Friends[i].show();
            System.out.println("========================");
        }




    }
}
