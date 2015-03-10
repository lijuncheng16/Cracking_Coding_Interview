package facebookQuestion;


/* 
Your previous Java content is preserved below:
*/
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java 8.");
    strings.add("Hey,");
    int[] test1 = new int[10];
    int[] test2 = new int[2 * 10];
    for(int i = 0; i < 10; i++){
      test1[i] = i;
      test2[i] = i-20;
    }
//     for (int integer : test1) {
//       System.out.println(integer);
//     }
    
//     for (int integer : test2) {
//       System.out.println(integer);
//     }
    
    int[] result = Merge(test1, test2);
    
    for (int integer : result) {
      System.out.println(integer);
    }
//     for (String string : strings) {
//       System.out.println(string);
//     }
  }
  
  
  public static int[] Merge(int[] arg1, int[] arg2){
    int N = arg1.length;
    int i = N - 1;
    int j = N - 1;
    int k = 2 * N - 1;
    
    while (i >= 0 && j >= 0) {
      if (arg1[i] > arg2[j]) {
        arg2[k] = arg1[i];
        i--;
      } else {
        arg2[k] = arg2[j];
        j--;
      }
      
      k--;
    }
     
    while (k >= 0) {
      if (i >= 0) {
        arg2[k] = arg1[i];
        i--;
      }

      k--;
       
    }
    
    return arg2;
  }
}

