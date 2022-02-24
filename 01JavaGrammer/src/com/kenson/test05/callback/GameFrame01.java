package com.kenson.test05.callback;

/**
 * <p>Title: GameFrame01.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2021年12月12日 10:03:00
 */
public class GameFrame01 implements IMyFrame{
    @Override
    public void paint() {
        System.out.println("画一个游戏需要的Frame!");
    }
}
