package ArraysStrings;

public class OneAway {
    public static void main(String[] args) {
        System.out.println(solution("peaks","geeks"));
    }

    private static boolean solution(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if(Math.abs(m - n) > 1) return false;


        int editCount = 0;

        int i1 = 0;
        int i2 = 0;

        while (i1 < m && i2 < n) {
            if(s1.charAt(i1) !=  s2.charAt(i2)) {
                if (editCount == 1) return false;
                editCount++;
                if (m > n) {
                    i1++;
                } else if(n > m) {
                    i2++;
                } else {
                    i1++;
                    i2++;
                }
            } else {
                i1++;
                i2++;
            }
        }

        if(editCount == 0 && Math.abs(m - n) == 0) return false;

        return true;
    }
}
