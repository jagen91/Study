public class App {
    public static void main(String[] args) throws Exception {
        String upperData = "bn b cpz j";
        String upperData2 = "BN B CPZ J";
        String decodeData = "";

        LowerDecryption decryption = new LowerDecryption();
        decodeData = decryption.decrypt2(upperData);

        UpperDecryption decryption2 = new UpperDecryption();
        decodeData = decryption2.decrypt2(upperData2);

        System.out.println(decodeData);
    }
}
