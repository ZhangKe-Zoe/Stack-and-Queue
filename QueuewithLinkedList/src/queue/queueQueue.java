/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author myego
 */
public class queueQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Q newQueue = new Q();

        int[] value = {3,4,6,4,3,8};

        for (int i = 0; i < value.length; i++) {
            newQueue.enqueue(value[i]);
        }
        
        System.out.print("\nMean " + newQueue.mean());
        System.out.print("\nThe remaining size of the queue " + newQueue.size());
        

    }
}
