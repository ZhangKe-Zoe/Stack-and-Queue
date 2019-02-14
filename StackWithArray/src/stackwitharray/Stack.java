/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackwitharray;

/**
 *
 * @author myego
 */
public class Stack implements IStack {

    String[] stackArray = new String[5];
    // new List<>;

    public void push(String page) {

        if (stackArray[4] != null) {

            for (int i = 0; i < 4; i++) {
                stackArray[i] = stackArray[i + 1];
                
            }

        }
        stackArray[4] = page;

    }

    public String pop() {
        
       String x = stackArray[height() - 1];
        stackArray[height() - 1] = null;
        
        return x;

    }

    public int height() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (stackArray[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void print() {
        for (int i = 0; i < height(); i++) {
            System.out.print(" " + stackArray[i]);
        }
    }

}
