public class LowerDecryption {
    public static final int ALPHA = 26;

    private char[] encode1;
    private char[] decode1;
    

    public void MappingTable()
    {
        char b = 'a';
        encode1 = new char[ALPHA];
        decode1 = new char[ALPHA];

        // encode 배열 초기화 대문자
        for(int i = 0; i < ALPHA; ++i)
        {
            encode1[i] = b;
            b++;
        }

        // decode 배열 초기화 대문자
        decode1[0] = 'z';
        b = 'a';

        for(int i = 1; i < ALPHA; ++i)
        {
            decode1[i] = b;
            b++;
        }

    }

    public char decoding(char encChar)
    {       // 입력값이 테이블에 없으면 공백을 리턴
        char decChar = ' ';
        int index1 = -1;

        for(int i = 0; i < encode1.length; ++i)
        {
            if(encode1[i] == encChar)
            {
                index1 = i;
                break;
            }
        }

        if(index1 != -1)
        {
            decChar = decode1[index1];
        }

        return decChar;
    }

    MappingTable mtable;

    public void Decryptor()
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
            decData += decoding(encChar);
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
