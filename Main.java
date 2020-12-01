package com.sunjieyouxi.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther: sj
 * @Date: 2020/11/30 - 11 - 30 - 11:13
 * @Description: com.sunjieyouxi.tank
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();

        while (true){
            Thread.sleep(50);
            tf.repaint();
        }

    }
}
