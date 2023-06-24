public class ReverseMatrix {
   public static void reverse(int A[][]){
       for(int i =0;i<A.length;i++){
            int end =A.length -1 ;
            int start = 0;
               while(start<end){
                   int temp = A[i][start];
                   A[i][start] = A[i][end];
                   A[i][end] = temp;
                   start++;
                   end--;
               }

       }


       for(int i =0;i<A.length;i++){
           for(int j = 0;j<A[0].length;j++){
               System.out.print(A[i][j]+" ");
           }
           System.out.println();
       }
   }
}
