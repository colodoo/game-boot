package com.zhisan.gameboot.global;

import lombok.Data;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author zhisan
 * 房间对象
 */
@Data
public class GameBootRoom {

    /**
     * 房间ID
     */
    private String roomId;

    /**
     * 会话ID列表
     */
    private CopyOnWriteArrayList<String> sessionList;

}
