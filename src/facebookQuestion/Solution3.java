package facebookQuestion;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution3 {
  
  /*
  Function for converting Binary tree to LinkedList
  */

  public static void search(BTNode root, Node outList){
    if (root == null) { return; }

    outList.appendToTail(root.data); 
    //visit root
    root.visited = true;
  
    if (root.lchild != null && root.lchild.visited == false) {
      search(root.lchild, outList);
    }

    if (root.rchild != null && root.rchild.visited == false) {
      search(root.rchild, outList);
    }
  
  }
  
  public static void main(String[] args) {

    int[] input = {2,3,4,5,6,7,8,9};
    BTNode inTree = new BTNode(1);
    
    for (int data : input){
      inTree.addToTree(data);
    }
    
    inTree.printTree();
    Node outList = new Node();
    search(inTree, outList);
    
    outList.printList();
    
  }
}



