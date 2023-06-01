public class MappingTable {

    public static final int ALPHA = 26;

    private char[] encode;
    private char[] encode1;
    private char[] decode;
    private char[] decode1;


    public MappingTable()
    {
        char c = 'A';
        char b = 'a';
        encode  = new char[ALPHA];
        encode1 = new char[ALPHA];
        decode  = new char[ALPHA];
        decode1 = new char[ALPHA];

        // encode 배열 초기화 대문자
        for(int i = 0; i < ALPHA; ++i)
        {
            encode[i] = c;
            encode1[i] = b;
            c++;
            b++;
        }

        // decode 배열 초기화 대문자
        decode[0] = 'Z';
        decode1[0] = 'z';
        c = 'A';
        b = 'a';

        for(int i = 1; i < ALPHA; ++i)
        {
            decode[i] = c;
            decode1[i] = b;
            c++;
            b++;
        }

    }

    public char decoding(char encChar)
    {       // 입력값이 테이블에 없으면 공백을 리턴
        char decChar = ' ';
        int index = -1;
        int index1 = -1;

        for(int i = 0; i < encode.length; ++i)
        {
            if(encode[i] == encChar)
            {
                index = i;
                break;
            }
            else if(encode1[i] == encChar)
            {
                index1 = i;
                break;
            }
        }

        if(index != -1)
        {
            decChar = decode[index];
        }
        else if(index1 != -1)
        {
            decChar = decode1[index1];
        }

        return decChar;
    }
}
