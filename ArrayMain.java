
import com.code.array.Array;
import java.util.*;
public class ArrayMain{

    public static void main(String...strings){

        Array array = new Array();

        /*
        int[][] input = {{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,0,0,1}};
        array.setMatrixZero(input);

        for(int i = 0; i < input.length; i++){

            for(int j = 0; j<input.length; j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
        List<List<Integer>> res = array.pascalTriangle(5);
        res.forEach((r)->System.out.println(r));
        */


        int[] input =  {1,3,5,4,2};
        int[] result = array.nextPermutation(input);
        System.out.println(java.util.Arrays.toString(result));

        System.out.println();
        System.out.println();

        int[] nums = {1,0,1,0,2,1,2};
         array.sortGivenArrayWithoutSortFun(nums);
         System.out.println(java.util.Arrays.toString(nums));
    }
}
