import java.util.*;
public class spiralmatrix {
    public  List<Integer>spiralOrder(int matrix[][]){
        if(matrix==null||matrix.length==0){
            return new ArrayList<>();
        }
        List<Integer>result=new ArrayList<>();
        int rows=matrix.length;
        int cols=matrix[0].length;
        int top=0;
        int bottom=rows-1;
        int left=0;
        int right=cols-1;
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[]args){
        spiralmatrix s=new spiralmatrix();
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer>result=s.spiralOrder(matrix);
        System.out.println(result);
    }
    
}
