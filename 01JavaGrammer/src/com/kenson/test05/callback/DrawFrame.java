package com.kenson.test05.callback;

/**
 * <p>Title: DrawFrame.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 10:01:00
 */
public class DrawFrame {
    public void drawDidfferentFrame(IMyFrame iMyFrame){
        System.out.println("第一步打开线程！");
        System.out.println("第二步添加圆圈！");
        System.out.println("第三步检查消息！");
        iMyFrame.paint();
        System.out.println("最后释放线程！画图完成！");
    }
}
