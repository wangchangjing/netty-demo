package com.demo.netty.protocol.response;

import com.demo.netty.protocol.Packet;
import lombok.Data;

import static com.demo.netty.protocol.command.Command.LOGOUT_RESPONSE;

/**
 * @author WangChangJing
 * @description:
 * @date 2019-04-22
 */
@Data
public class LogoutResponsePacket extends Packet {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return LOGOUT_RESPONSE;
    }
}