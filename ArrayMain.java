
import com.code.array.Array;
import java.util.*;
public class ArrayMain{

    public static void main(String...strings){

        Array array = new Array();

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
    }
}
