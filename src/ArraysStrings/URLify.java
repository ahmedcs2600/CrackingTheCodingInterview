package ArraysStrings;

public class URLify {
    public static void main(String[] args) {
        char[] str = "Mr John Smith ".toCharArray();
        System.out.println(solution(str));
    }

    private static String solution(char[] ch) {
        int spaceCount = 0;

        int i = 0;
        for( ; i < ch.length; i++) {
            if(ch[i] == ' ') {
                spaceCount+=2;
            }
        }

        i--;

        while(ch[i] == ' ') {
            spaceCount-=2;
            i--;
        }

        int newLength = i + spaceCount + 1;
        char[] old = ch;
        ch = new char[newLength];



        for(int j = newLength - 1; j >= 0; ) {
            if(old[i] == ' ') {
                ch[j] = '0';
                ch[j-1] = '2';
                ch[j-2] = '%';
                j-=3;
            } else {
                ch[j] = old[i];
                j--;
            }
            i--;
        }

        return new String(ch);
    }
}
