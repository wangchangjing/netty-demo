package com.demo.netty.protocol.command;

import lombok.Data;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/3/28
 */
@Data
public class LoginRequestPacket extends Packet {
    private Integer userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {
        return Command.LOGIN_REQUEST;
    }
}
