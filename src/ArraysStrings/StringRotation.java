package ArraysStrings;

public class StringRotation {
    public static void main(String[] args) {

//        String str1 = "kifcqeiqoh";
//        String str2 = "ayyrddojpq";
//
//        if (rotateString(str1, str2))
//            System.out.println("Strings are rotations of each other");
//        else
//            System.out.printf("Strings are not rotations of each other");


        String str = "A man, a plan, a canal: Panama";
       String result = str.replaceAll("^[a-z]","");
       System.out.println("result -> " + result);
    }

    public static boolean rotateString(String s, String goal) {
        String resultant = s + s;
        return (s.length() == goal.length() && resultant.indexOf(goal) != -1);
    }
}
