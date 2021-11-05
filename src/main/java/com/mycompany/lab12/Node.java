/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab12;

/**
 *
 * @author sethp
 */
public class Node {
    private final int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
    
    void add(int val){
        if (val < value){
            if (left == null){
                left = new Node(val);
            } else {
                left.add(val);
            }
        }else if (val > value) {
            if (right == null){
                right = new Node(val);
            } else {
                right.add(val);
            }
        }
    }

    public int getValue() {
        return value;
    }
    
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    
    
            
}
