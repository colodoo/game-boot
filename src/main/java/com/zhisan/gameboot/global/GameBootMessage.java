package com.zhisan.gameboot.global;

import lombok.Data;

import java.io.Serializable;

/**
 * 消息实体类
 * @author zhisan
 */
@Data
public class GameBootMessage implements Serializable {

    /**
     * 消息类型
     */
    private String msgType;

    /**
     * 内容
     */
    private Object data;

}
