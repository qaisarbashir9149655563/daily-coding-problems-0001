package com.company;

import java.util.Scanner;

public class DCP11 {
    /**************************
     This problem was asked by Google.
     Given the root of a binary tree, return a deepest node. For example, in the following tree, return d.
     a
     / \
     b   c
     /
     d
     ***************************/
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            Node root = new Node('a');
            root.left = new Node('b');
            root.right = new Node('c');
            root.left.left = new Node('d');

            int height = findHeight(root);
            deepestNode(root,height);

        }
        static class Node{
            char data;
            Node right,left;
            Node(char key){
                this.data = key;
                left = null;
                right = null;
            }

        }
        public static int findHeight(Node root){
            if(root == null)
                return 0;
            int left_height = findHeight(root.left);
            int right_height = findHeight(root.right);

            return Math.max(left_height,right_height)+1;
        }

        public static void deepestNode(Node root,int levels){
            if (root == null) return;
            if(levels == 1)
                System.out.println("The deepest root of the given Binary Tree is : "+root.data);
            else if(levels > 1){
                deepestNode(root.right,levels-1);
                deepestNode(root.left,levels-1);
            }
        }


}
