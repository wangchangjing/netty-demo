package com.demo.netty.protocol.request;

import com.demo.netty.protocol.Packet;
import com.demo.netty.protocol.command.Command;
import lombok.Data;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/3/29
 */
@Data
public class MessageRequestPacket extends Packet {

    private String message;

    @Override
    public Byte getCommand() {
        return Command.MESSAGE_REQUEST;
    }
}
