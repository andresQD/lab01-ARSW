/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.math;

/**
 *
 * @author andres.quintero-d
 */
public class PiThread extends Thread {

    int A;
    int B;

    public PiThread(int x, int y) {
        A = x;
        B = y;
    }

    

    @Override
    public void run() {
        for (int i = A; i <= B; i++) {
            System.out.println(i);
        }
    }

}
