package com.demo.netty.protocol.request;

import com.demo.netty.protocol.Packet;
import com.demo.netty.protocol.command.Command;
import lombok.Data;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/3/28
 */
@Data
public class LoginRequestPacket extends Packet {
    private String userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {
        return Command.LOGIN_REQUEST;
    }
}
