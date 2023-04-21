package class9Arrays;

public class E3ArraysDoubleInt {
    public static void main(String[] args) {

            //1) declare an ARRAY
        double [] num={10.5, 5.5, 0.05, 100.5, 586};

            //2) initialize or create an ARRAY
        int i=0; //variable to print

            //3) assign ARRAY value
        System.out.println(num[i]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);

        double [] numbers={10.5,5.5,0.05,100.5,586,451,545,1,51,5};
        //numbers.length gives us the total count of elements in an array
        //  System.out.println(numbers.length);
        for(int j=0;j<numbers.length;j++){

            //4) access ARRAY element
            System.out.print(numbers[j]+" ");
        }
    }

}
