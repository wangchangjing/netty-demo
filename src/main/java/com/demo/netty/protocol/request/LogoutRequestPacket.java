package com.demo.netty.protocol.request;

import com.demo.netty.protocol.Packet;
import lombok.Data;

import static com.demo.netty.protocol.command.Command.LOGOUT_REQUEST;

/**
 * @author WangChangJing
 * @description:
 * @date 2019-04-22
 */
@Data
public class LogoutRequestPacket extends Packet {
    @Override
    public Byte getCommand() {
        return LOGOUT_REQUEST;
    }
}
