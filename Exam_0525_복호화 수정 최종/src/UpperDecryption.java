public class UpperDecryption {
    public static final int ALPHA = 26;

    private char[] encode;
    private char[] decode;


    public void MappingTable()
    {
        char c = 'A';
        encode  = new char[ALPHA];
        decode  = new char[ALPHA];

        // encode 배열 초기화 대문자
        for(int i = 0; i < ALPHA; ++i)
        {
            encode[i] = c;
            c++;
        }

        // decode 배열 초기화 대문자
        decode[0] = 'Z';
        c = 'A';

        for(int i = 1; i < ALPHA; ++i)
        {
            decode[i] = c;
            c++;
        }
    }

    public char decoding(char encChar)
    {       // 입력값이 테이블에 없으면 공백을 리턴
        char decChar = ' ';
        int index = -1;

        for(int i = 0; i < encode.length; ++i)
        {
            if(encode[i] == encChar)
            {
                index = i;
                break;
            }
        }

        if(index != -1)
        {
            decChar = decode[index];
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

            if( encChar == 'A' )
            {
                decData += 'Z';
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