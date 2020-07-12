package com.zhisan.gameboot.service;

import com.zhisan.gameboot.global.GameBootMessage;
import com.zhisan.gameboot.global.MessageParser;
import org.springframework.stereotype.Component;

/**
 * @author zhisan
 * 简易消息解析器(基于JSON)
 */
@Component
public class SimpleMessageParser implements MessageParser {
    @Override
    public GameBootMessage parser(String message) {

        // 基于JSON字符串解析对象
        // TODO
        GameBootMessage msg = new GameBootMessage();
        return msg;
    }
}
