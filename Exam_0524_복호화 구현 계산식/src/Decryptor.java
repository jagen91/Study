public class Decryptor {
    
    public Decryptor()
    {
        
    }

    public String decrypt(String encData)
    {
        char encChar = 0;

        String decData = "";

        for (int i = 0; i < encData.length(); i++)
        {
            encChar = encData.charAt(i);

            if(encChar == 'A')
            {
                decData += 'Z';
            }
            else if(encChar == ' ')
            {
                decData += ' ';
            }
            else
            {
                decData = decData + (--encChar);  //  (char)(encChar - 1)
            }
        }
        return decData;
    }
}
