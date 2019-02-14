/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author myego
 */
public class Q implements IQueue {

    LinkedList list = new LinkedList();
    
    @Override
    public void enqueue(int measurement) {

        list.add(measurement);

    }

    @Override
    public void dequeue(){
        try {
            list.remove();
        } catch (Exception ex) {
            Logger.getLogger(Q.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int size() {

        return list.size();
    }

    public double mean() throws Exception {

        int sum = 0;
        double mean;    
        for (int i = 0; i < 5; i++) {
            sum = sum + list.remove();
        }
        mean =sum / 5;
        return mean;

    }

}
