/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sethp
 */
public class BTSTest {
    
   
    @Test
    public void testAdd1() {
        BTS bts = new BTS();
        bts.add(5);
        assertEquals(bts.getRoot().getValue(), 5);
    }
   
    @Test
    public void testAdd2() {
        BTS bts = new BTS();
        bts.add(5);
        bts.add(4);
        Node root = bts.getRoot();
        assertEquals(root.getValue(), 5);
        assertEquals(root.left.getValue(),4);
    }
    
    @Test
    public void testAdd3() {
        BTS bts = new BTS();
        bts.add(5);
        bts.add(9);
        bts.add(3);
        Node root = bts.getRoot();
        assertEquals(root.getValue(), 5);
        assertEquals(root.left.getValue(),3);
        assertEquals(root.right.getValue(),9);
    }
    
    @Test
    public void testSetNode() {
        BTS bts = new BTS();
        bts.add(4);
        Node root = bts.getRoot();
        root.setLeft(new Node(3));
        root.setRight(new Node(9));
        
        assertEquals(root.left.getValue(),3);
        assertEquals(root.right.getValue(),9);
    }
    
    @Test
    public void testGetNode() {
        BTS bts = new BTS();
        bts.add(4);
        Node root = bts.getRoot();
        root.setLeft(new Node(3));
        root.setRight(new Node(9));
        
        assertEquals(root.getLeft().getValue(),3);
        assertEquals(root.getRight().getValue(),9);
    }

    /**
     * Test of iterator method, of class BTS.
     */
    @Test
    public void testIterator1() {
        BTS bts = new BTS();
        bts.add(5);
        bts.add(3);
        bts.add(7);
        bts.add(9);
        bts.add(6);
        bts.add(4);
        bts.add(2);
        bts.add(1);
        bts.add(8);
        Iterator it = bts.iterator();
        String line = "";
        while(it.hasNext()){
            line = line + it.next();            
        }
        assertEquals(line,"123456789");
                
    }
    
    @Test
    public void testIterator2() {
        BTS bts = new BTS();
        bts.add(23);
        bts.add(25);
        bts.add(26);
        bts.add(27);
        bts.add(28);
        bts.add(29);
        bts.add(30);
        bts.add(31);
        bts.add(8);
        Iterator it = bts.iterator();
        String line = "";
        while(it.hasNext()){
            line = line + it.next();            
        }
        assertEquals(line,"82325262728293031");
                
    }
    
    @Test
    public void testIterator3() {
        BTS bts = new BTS();
        bts.add(5);
        bts.add(-3);
        bts.add(7);
        bts.add(-9);
        bts.add(6);
        bts.add(4);
        bts.add(2);
        bts.add(1);
        bts.add(8);
        Iterator it = bts.iterator();
        String line = "";
        while(it.hasNext()){
            line = line + it.next();            
        }
        assertEquals(line,"-9-31245678");
                
    }
    
}
