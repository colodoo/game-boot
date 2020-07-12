package com.zhisan.gameboot.global;

/**
 * @author zhisan
 * 消息解析器接口
 */
public interface MessageParser {

    /**
     * 解析
     * @param message
     * @return
     */
    Object parser(String message);

}
