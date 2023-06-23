public class TransposeMatrix {
    public static void transpose(int A[][]){
        for(int i =0;i<A.length;i++){
            for(int j =0;j<i;j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;

            }
        }
        System.out.println("this is transpose matrics");

        for(int i =0;i<A.length;i++){
            for(int j = 0;j<A[0].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }

}

