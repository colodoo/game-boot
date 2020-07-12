package com.zhisan.gameboot.endpoint;

import com.zhisan.gameboot.global.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import javax.annotation.Resource;

/**
 * 游戏循环
 *
 * @author zhisan
 */
@Component
@Slf4j
public class SpringGameLoopEndpoint extends TextWebSocketHandler {

    @Resource(name = "simpleMessageParser")
    MessageParser messageParser;

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {

        log.info(session.getId() + ": " + "onOpen");

        GameBootSession gameBootSession = new GameBootSession(session);
        // 会话加入全局对象集合
        GlobalPool.sessionPool.put(session.getId(), gameBootSession);

    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {

        log.info(session.getId() + ": " + message);

        // 消息解析器
        GameBootMessage msg = (GameBootMessage) messageParser.parser(message.getPayload());
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

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {

        log.info(session.getId() + ": " + "onClose");

    }
}
