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

	int inicio;
    int fin;

    public PiThread(int x, int y) {
        inicio = x;
        fin = y;
    }

    

    @Override
    public void run() {
        PiDigits.getDigits(inicio, fin, 1);
    }

}
