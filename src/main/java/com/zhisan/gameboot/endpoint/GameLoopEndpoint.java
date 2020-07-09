package com.zhisan.gameboot.endpoint;

import com.zhisan.gameboot.service.GameLoopService;
import com.zhisan.gameboot.util.SpringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

/**
 * @author zhisan
 * 游戏循环
 */
@ServerEndpoint(value = "/gameloop")
@Component
@RestController
@Slf4j
public class GameLoopEndpoint {

    @OnOpen
    public void onOpen(Session session) {
        log.info(session.getId() + ": " + "onOpen");
        // 处理连接逻辑
        GameLoopService gameLoopService = SpringUtils.getBean(GameLoopService.BEANN_AME);
        gameLoopService.onOpen(session);
    }

    @OnClose
    public void onClose(Session session) {
        log.info(session.getId() + ": " + "onClose");
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        log.info(session.getId() + ": " + message);
        // 任务分发器
        // TODO
    }

    @OnError
    public void onError(Session session, Throwable error) {
        log.error(session.getId() + ": " + "onError", error);
    }

}
