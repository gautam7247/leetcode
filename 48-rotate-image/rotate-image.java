class Solution {
    static void transposeInPlace(int[][] matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;


            }
        }
    }
    static void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
    }
    public void rotate(int[][] matrix) {
        //trappose
        int r=matrix.length;
        int c=matrix[0].length;
        transposeInPlace(matrix,r,c);
        //reverse in eaqch row of transpose matrix
        for(int i=0;i<r;i++){
           reverse(matrix[i]);
        }
    }
}