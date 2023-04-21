package class10Arrays2D;

public class E3D2ArraysRowsColumns {
    public static void main(String[] args) {
        int[][]matrix={
                {10, 20, 30}, //first 1 D Arrays in 2 D Arrays Table
                {20, 50, 65}, //second 1 D Arrays in 2 D Arrays Table
                {102, 54, 60} //third 1 D Arrays
        };
        int [] arr1=matrix[0];//=> [0]-1st; [1]-2nd; [2]-3rd 1 D Arrays line
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
        arr1=matrix[1]; //we cannot create duplicate variable again, no int here

        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
        arr1=matrix[2];

        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }

    }
}
