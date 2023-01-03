
package com.code.array;
import java.util.*;

public class Array{


    public void setMatrixZero(int[][]input){

        int rows = input.length;
        int cols = input.length;

        int col = 1;

        for(int i = 0; i < rows; i++){

            if(input[i][0] == 0)col = 0;

            for(int j = 1; j < cols; j++){

                if(input[i][j] == 0){

                    input[i][0] = 0;//make cols as zero
                    input[0][j] = 0;//make rows zero
                }
            }
        }

        for(int i = rows-1; i>=0; i--){

            for(int j = cols-1; j>=1; j--){

                if(input[i][0] == 0 || input[j][0] == 0)
                    input[i][j] = 0;
            }
        }

    }


    public List<List<Integer>> pascalTriangle(int n){

        List<List<Integer>> res = new ArrayList<>();

        List<Integer> rows, prev = null;//null here bacause of will create object later
                                        
        for(int i = 0; i < n; i++){

            rows = new ArrayList<>();
            for(int j = 0; j <=i; ++j){

                if(j==0 || i==j)//j ==0 represent first col value and i==j represent last rows value
                    rows.add(1);
                else
                    rows.add(prev.get(j-1)+prev.get(j));
            }
            prev = rows;
            res.add(rows);
        }
                                       

        return res;
    }
}


