public class App {
    public static void main(String[] args) throws Exception {
        String upperData = "J BN B CPZ j bn b cpz";
        String decodedData = "";
        String decodedData2 = "";

        // 디크립션(복호화) 객체를 생성한다.
        Decryptor decryptor = new Decryptor();
        Decryptor decryptor2 = new Decryptor();

        // 암호문을 복호화 한다.
        decodedData = decryptor.decrypt(upperData);
        decodedData2 = decryptor2.decrypt(upperData);

        // 결과를 출력한다.
        System.out.println(decodedData);
        System.out.println(decodedData2);


    }
}
