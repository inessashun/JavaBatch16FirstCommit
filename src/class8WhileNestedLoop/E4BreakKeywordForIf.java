package class8WhileNestedLoop;

public class E4BreakKeywordForIf {
    public static void main(String[] args) {
        for(int i=0; i>30; i++){
            if(i>5){
                break; //will terminate loop after 5 operations
            }
            System.out.println(i);
        }
        //1+2+3+4+5+6+7+8+9+10...24=300
        int sum=0;
        for (int i=0; i<50; i++){
            sum=sum+i;
            if(sum>=300){
                System.out.println(i);
                break;
            }
        }
    }
}
