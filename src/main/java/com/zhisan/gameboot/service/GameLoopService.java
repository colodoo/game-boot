package com.zhisan.gameboot.service;

import com.zhisan.gameboot.global.GlobalPool;
import com.zhisan.gameboot.global.GameBootSession;
import org.springframework.stereotype.Service;

import javax.websocket.Session;

/**
 * @author zhisan
 * 游戏循环服务
 */
@Service
public class GameLoopService {

    public static String BEANN_AME = "gameLoopService";

    public void onOpen(Session session) {
        GameBootSession gameBootSession = new GameBootSession(session);
        // 会话加入全局对象集合
        GlobalPool.sessionPool.put(session.getId(), gameBootSession);

    }
}
