package com.zhisan.gameboot.service;

import com.zhisan.gameboot.global.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.websocket.Session;

/**
 * @author zhisan
 * 游戏循环服务
 */
@Service
public class GameLoopService {

    public static String BEANN_AME = "gameLoopService";

    @Resource(name = "simpleMessageParser")
    MessageParser messageParser;

    public void onOpen(Session session) {
        GameBootSession gameBootSession = new GameBootSession(session);
        // 会话加入全局对象集合
        GlobalPool.sessionPool.put(session.getId(), gameBootSession);

    }

    public void onMessage(String message, Session session) {

        // 消息解析器
        GameBootMessage msg = (GameBootMessage) messageParser.parser(message);
        // 会话预处理
        GameBootSession gameBootSession = GlobalPool.sessionPool.get(session.getId());
        // TODO

        // 消息类型分发
        String msgType = msg.getMsgType();
        // TODO

        // 逻辑分发
        // TODO

        // 作用域判断
        GameBootRoom gameBootRoom = gameBootSession.getGameBootRoom();
        // TODO

        // 消息广播
        // TODO

    }
}
