/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author myego
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] text = new String[]{"It", "was", "the", "best", "of", "times", "it", "was", "the", "worst", "of", "times"};

        LinkedList list = new LinkedList();

        for (int i = 0; i < 12; i++) {
            list.add(text[i]);
        }

        list.print();

    }
}
