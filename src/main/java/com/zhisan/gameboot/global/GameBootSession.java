package com.zhisan.gameboot.global;

import lombok.Data;

import javax.websocket.Session;
import java.io.Closeable;
import java.io.Serializable;

/**
 * @author zhisan
 * 游戏包装Session
 */
@Data
public class GameBootSession implements Serializable {

    /**
     * 会话对象
     */
    private Closeable session;

    /**
     * 房间
     *
     * @param session
     */
    private GameBootRoom gameBootRoom;

    public GameBootSession(Closeable session) {
        this.session = session;
    }


}
