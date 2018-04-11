package br.unb.cic.epl.spl.height;

// Java program for expression tree
public class Node {

    char value;
    Node left, right;

    public char getValue(){
        return value;
    }

    Node(char item) {
        value = item;
        left = right = null;
    }
}
