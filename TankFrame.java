package com.sunjieyouxi.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther: sj
 * @Date: 2020/11/30 - 11 - 30 - 11:34
 * @Description: com.sunjieyouxi.tank
 * @version: 1.0
 */
public class TankFrame extends Frame {

    int x = 200,y = 200;

    public TankFrame(){
        setSize(800,600);
        setResizable(false);
        setTitle("坦克大战");
        setVisible(true);
//设置窗口的一个监听，关闭按键

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    //窗口重新绘制的时候会用到paint方法
    @Override
    public void  paint(Graphics g){
        g.fillRect(200,200,50,50);

       // System.out.println("hello");文字的响应
    }
}
