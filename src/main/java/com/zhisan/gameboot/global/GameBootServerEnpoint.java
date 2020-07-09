package com.zhisan.gameboot.global;

import org.springframework.core.annotation.AliasFor;

import javax.websocket.server.ServerEndpoint;

/**
 * @author zhisan
 * 自定义端点注解
 */
public @interface GameBootServerEnpoint {
    @AliasFor(
            annotation = ServerEndpoint.class
    )
    String value() default "";
}
