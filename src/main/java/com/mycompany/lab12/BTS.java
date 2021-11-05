/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab12;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author sethp
 */
public class BTS {
    private Node root;
    
   public void add(int value){
        if (root == null){
            root = new Node(value);
        } else {
            root.add(value);
        }
    }

    public Node getRoot() {
        return root;
    }
   
   
   
    public Iterator<Integer> iterator(){
        return new BTSIterator(root);
    }

    private static class BTSIterator implements Iterator<Integer> {

        Stack<Node> stack = new Stack<>();
        
        public BTSIterator(Node root) {
            while(root != null){
                stack.push(root);
                root = root.left;
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public Integer next() {
            Node node = stack.pop();
            int v = node.getValue();
            if(node.right != null){
                node = node.right;
                while(node != null){
                    stack.push(node);
                    node = node.left;
                }
            }
            return v;
        }
    }
   
   
}
