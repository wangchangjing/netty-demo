package com.demo.netty.protocol.response;

import com.demo.netty.protocol.Packet;
import com.demo.netty.protocol.command.Command;
import lombok.Data;

/**
 * @author WangChangJing
 * @description:
 * @date 2019-03-28
 */
@Data
public class LoginResponsePacket extends Packet {
    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return Command.LOGIN_RESPONSE;
    }
}