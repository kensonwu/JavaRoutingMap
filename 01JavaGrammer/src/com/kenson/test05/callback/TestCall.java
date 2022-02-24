package com.kenson.test05.callback;

import com.sun.org.glassfish.gmbal.ManagedAttribute;

/**
 * <p>Title: TestCall.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 10:04:00
 */
public class TestCall {
    public static void main(String[] args) {
        GameFrame01 gameFrame01 = new GameFrame01();
        DrawFrame drawFrame = new DrawFrame();
        // 画游戏需要的Frame
        drawFrame.drawDidfferentFrame(gameFrame01);
        System.out.println("=================================");
        // 画一个数学的Frame
        MathFrame mathFrame = new MathFrame();
        drawFrame.drawDidfferentFrame(mathFrame);
    }
}
