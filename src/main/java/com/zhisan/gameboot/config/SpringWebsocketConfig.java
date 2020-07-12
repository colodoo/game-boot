package com.zhisan.gameboot.config;

import com.zhisan.gameboot.endpoint.SpringGameLoopEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @author zhisan
 * spring配置websocket
 */
@Configuration
@EnableWebSocket
public class SpringWebsocketConfig implements WebSocketConfigurer {

    @Autowired
    SpringGameLoopEndpoint gameLoopEndpointSpring;

    @Autowired
    WebsocketInterceptor websocketInterceptor;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(gameLoopEndpointSpring, "gameloop").addInterceptors(websocketInterceptor).setAllowedOrigins("*");

    }
}
