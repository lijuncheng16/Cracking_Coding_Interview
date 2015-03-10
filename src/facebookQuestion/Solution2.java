package facebookQuestion;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution2 {
  public static void main(String[] args) {

    int in_matrix[][]={{50,60,55,67,1},{62,65,70,0,81},{72,66,77,80,69}};

    
    for(int i = 0; i < in_matrix.length; i++)
    {
        for(int j = 0; j < in_matrix[0].length; j++)
        { 
            System.out.print(in_matrix[i][j]+" ");    
        }  
        System.out.println();  
    }
  
  
  int[][] result = ZeroOut(in_matrix); 

  for(int i = 0; i < result.length; i++)
    {
        for(int j = 0; j < result[0].length; j++)
        { 
            System.out.print(result[i][j]+" ");    
        }  
        System.out.println();  
    }
  
  }

  public static int[][] ZeroOut(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[] rowmask = new int[rows];
    int[] colmask = new int[cols];
        
    for (int i = 0; i < rows; i++) {
      for(int j = 0; j < cols; j++) {
        if(matrix[i][j] == 0) {
          rowmask[i] = 1;
          colmask[j] = 1; 
        }
      }
    }
    // set the row and column bit masks 
    for (int row_ind = 0; row_ind < rows; row_ind++){
      if (rowmask[row_ind] == 1){
        for (int ind = 0; ind < cols; ind++){
          matrix[row_ind][ind] = 0;
        }
      }
    }
    
    for (int col_ind = 0; col_ind < cols; col_ind++){
      if (colmask[col_ind] == 1){
        for (int ind = 0; ind < rows; ind++){
          matrix[ind][col_ind] = 0;
        }
      }
    }
    
    return matrix;
  }
}

