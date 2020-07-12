package com.zhisan.gameboot.service;

/**
 * @author zhisan
 * 房间服务
 */
public interface GameRoomService {

    /**
     * 加入房間
     * @param roomId
     * @param sessionId
     */
    public void joinRoom(String roomId, String sessionId);

    /**
     * 离开房间
     * @param roomId
     * @param sessionId
     */
    public void exitRoom(String roomId, String sessionId);

}
