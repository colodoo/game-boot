package com.zhisan.gameboot.global;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhisan
 * 全局对象池
 */
public class GlobalPool {

    /**
     * 全局用户池
     */
    public static ConcurrentHashMap<String, GameBootSession> sessionPool = new ConcurrentHashMap<String, GameBootSession>();

    /**
     * 全局房间池
     */
    public static ConcurrentHashMap<String, GameBootRoom> roomPool = new ConcurrentHashMap<String, GameBootRoom>();
}
