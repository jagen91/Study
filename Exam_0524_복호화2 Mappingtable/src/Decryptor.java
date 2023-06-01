public class Decryptor {

    MappingTable mtable;

    public Decryptor()
    {
        mtable = new MappingTable();
    }

    public String decrypt2(String encData)
    {
        char encChar = 0;
        String decData = "";

        for (int i = 0; i < encData.length(); i++)
        {
            encChar = encData.charAt(i);
            // 매핑테이블에서 찾는다.
            decData += mtable.decoding(encChar);
        }

        return decData;
    }

    public String decrypt1(String encData)
    {
        char encChar = 0;
        String decData = "";

        for (int i = 0; i < encData.length(); i++)
        {
            encChar = encData.charAt(i);

            if( encChar == 'A' )
            {
                decData += 'Z';
            }
            if( encChar == 'a' )
            {
                decData += 'z';
            }
            else if( encChar == ' ' )
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

