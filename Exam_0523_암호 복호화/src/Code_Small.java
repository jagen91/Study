public class Code_Small {
    
    String output = "";
    String alphabet = "abcdefghijklmnopqrstuvwxyz ";
    

    public void small(String input)
    {

        for (int i = 0; i < input.length(); i++) 
        {
            if (input.charAt(i) == alphabet.charAt(0)) // a-1이면 에러니까 a랑 같으면 z를 리턴
            {
                output += alphabet.charAt(25);
            }
            else if (input.charAt(i) == alphabet.charAt(26)) // 띄어쓰기
            {
                output += alphabet.charAt(26);
            }
            for (int j = 1; j < alphabet.length()-1; j++)  // a는 포함안시키고 b부터
            {
                if (input.charAt(i) == alphabet.charAt(j))
                {
                    int k  = j - 1;
                    output += alphabet.charAt(k);
                }
            }
        }
        System.out.printf(output);
    }



}


