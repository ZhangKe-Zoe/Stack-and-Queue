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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack newStack = new Stack();

        String[] value = {"a", "b", "c", "d", "e", "f"};

        for (int i = 0; i < value.length; i++) {
            newStack.push(value[i]);
        }

       
        newStack.print();
        System.out.print(" " + newStack.pop()+ "\n");
        newStack.print();
        System.out.print(" " + newStack.pop() + "\n");
        newStack.print();
        System.out.print(" " + newStack.pop() + "\n");
        newStack.print();
        System.out.print(" " + newStack.pop() + "\n");
        newStack.print();
        System.out.print(" " + newStack.pop() + "\n");
        newStack.print();
        System.out.print(" " + newStack.pop() + "\n");
        

    }
}
