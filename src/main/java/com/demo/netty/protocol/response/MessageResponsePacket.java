package com.demo.netty.protocol.response;

import com.demo.netty.protocol.Packet;
import com.demo.netty.protocol.command.Command;
import lombok.Data;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/4/8
 */
@Data
public class MessageResponsePacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return Command.MESSAGE_RESPONSE;
    }
}
