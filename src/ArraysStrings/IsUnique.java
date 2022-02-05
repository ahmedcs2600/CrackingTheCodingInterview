package ArraysStrings;

public class IsUnique {
    //https://www.geeksforgeeks.org/determine-string-unique-characters/
    public static void main(String[] args) {
        //System.out.println("test -> " + (0 ^ 98));
//        int bitAtIndex = 2;
//        System.out.println(1 << bitAtIndex);
        uniqueCharacters("geekforgeeks");
    }

    static boolean uniqueCharacters(String str) {
        // Assuming string can have characters a-z
        // this has 32 bits set to 0
        int checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int bitAtIndex = str.charAt(i) - 'a';

            // if that bit is already set in checker,
            // return false

            System.out.println("Checker test -> " + checker);
            System.out.println("bitAtIndex -> " + bitAtIndex);
            System.out.println("Checker -> " + ((checker & (1 << bitAtIndex))));
            System.out.println("(1 << bitAtIndex) -> " + (1 << bitAtIndex));

            if ((checker & (1 << bitAtIndex)) > 0) return false;

            // otherwise update and continue by
            // setting that bit in the checker
            checker = checker | (1 << bitAtIndex);
        }

        // no duplicates encountered, return true
        return true;
    }
}
