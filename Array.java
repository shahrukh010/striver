
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



    public int[] nextPermutation(int[]input){

        if(input==null || input.length<=1)return input;

        int i = input.length-2;//because of i want to check first index from last which is greater then i+1

        while(i>=0 && input[i]>=input[i+1])i--;

        if(i>=0){

            int j = input.length-1;//find second index from last which is greater then first index(i)

            while(input[j]<=input[i])j--;
            swap(input,i,j);
        }
        reverse(input,i+1,input.length-1);
        return input;
    }

    private void swap(int[]input,int i ,int j){

        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

    private void reverse(int[] input,int i, int j){

        while(i<j){
            swap(input,i++,j--);
        }
    }

    public void sortGivenArrayWithoutSortFun(int[]input){

        int left = 0;
        int right = input.length-1;
        int mid = 0;

        while(mid<=right){

            switch(input[mid]){

                case 0:
                    if(input[left]!=input[mid]){
                        
                        swap(input,left,mid);
                    }
                    left++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    if(input[mid] !=input[right]){
                        
                        swap(input,mid,right);
                    }
                    right--;
                    break;
            }
        }
    }

}



