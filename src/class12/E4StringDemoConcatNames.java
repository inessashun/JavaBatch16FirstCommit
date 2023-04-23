package class12;

public class E4StringDemo {
    public static void main(String[] args) {
        String firstName="Ana";
        String lastName="Tasevska";
        //String lastName=null; => it means safe Nothing/Empty Space, it failed with Concat Method

        String fullName=firstName+lastName; //most widely used approach
        System.out.println(fullName);
        //Other method is Concat
        System.out.println(firstName.concat(lastName));
    }
}
