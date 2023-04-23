package hwClass12;

public class StringReverse {
    public static void main(String[] args) {
        /*
        Create a String and print it in reverse order (Sunday → yadnuS).
         */
        String name="Sunday";
        String rev="";
        for (int i=name.length()-1; i>=0; i--){
            rev=rev+name.charAt(i);

        }
        System.out.println(rev);
    }
}
