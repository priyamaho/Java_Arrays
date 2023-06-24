public class Main {
    public static void main(String[] args) {
        int[][] myarr = { {1, 2, 3, 4}, {5, 6, 7,8},{9,10,12,13},{14,15,16,18} };
        System.out.println("this is Reverse Matrics");
        ReverseMatrix object3 =new ReverseMatrix();
        object3.reverse(myarr);
        TransposeMatrix object = new TransposeMatrix();
        object.transpose(myarr);
        System.out.println("this is 90 degree rotate Matrics");
        ReverseMatrix object2 =new ReverseMatrix();
        object2.reverse(myarr);
    }
}