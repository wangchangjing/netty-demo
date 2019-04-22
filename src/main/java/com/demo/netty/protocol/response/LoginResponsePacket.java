package com.demo.netty.protocol.response;

import com.demo.netty.protocol.Packet;
import lombok.Data;

import static com.demo.netty.protocol.command.Command.LOGIN_RESPONSE;

/**
 * @author WangChangJing
 * @description:
 * @date 2019-03-28
 */
@Data
public class LoginResponsePacket extends Packet {
    private String userId;

    private String userName;

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}