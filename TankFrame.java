package com.sunjieyouxi.tank;


import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther: sj
 * @Date: 2020/11/30 - 11 - 30 - 11:34
 * @Description: com.sunjieyouxi.tank
 * @version: 1.0
 */
public class TankFrame extends Frame {

    Tank myTank = new Tank(200,200,Dir.DOWN);

    public TankFrame() {
        setSize(800, 600);
        setResizable(false);
        setTitle("坦克大战");
        setVisible(true);

        this.addKeyListener(new MyKeyListener());
//设置窗口的一个监听，关闭按键
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {

        myTank.paint(g);


        System.out.println("hello");
    }


    class MyKeyListener extends KeyAdapter {
        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;


        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;

                default:
                    break;
            }

            setMainTankDir();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;

                default:
                    break;
            }
            setMainTankDir();
        }

        private void setMainTankDir() {
            if (bL)  myTank.setDir(Dir.LEFT);
            if (bU)  myTank.setDir(Dir.UP);
            if (bR)  myTank.setDir(Dir.RIGHT);
            if (bD)  myTank.setDir(Dir.DOWN);

        }

    }
}






