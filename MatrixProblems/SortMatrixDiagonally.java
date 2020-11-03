import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortMatrixDiagonally {
    public static void main(String args[]) {
      int[][] array={{1,5,2,3},
                     {2,8,7,3},
                     {5,1,2,4},
                     {4,1,2,9}};
      for(int i=0;i<array.length;i++){
          for(int j=0;j<array[0].length;j++){
              System.out.print(array[i][j]+" ");
          }
          System.out.println();
      }
      
      sortArrayInDiagonal(array);
      
      for(int i=0;i<array.length;i++){
          for(int j=0;j<array[0].length;j++){
              System.out.print(array[i][j]+" ");
          }
          System.out.println();
      }
    }
    
    public static int[][] sortArrayInDiagonal(int[][] array){
        for(int i=0;i<array.length;i++){
            List<Integer> numbers=new ArrayList<Integer>();
            for(int j=i,k=0;j>=0&&k<=i;j--,k++){
                numbers.add(array[j][k]);
            }
            Collections.sort(numbers);
            for(int j=i,k=0;j>=0&&k<=i;j--,k++){
                array[j][k]=numbers.get(0);
                numbers.remove(0);
            }
            System.out.println();
        }
        return array;
    }
}
