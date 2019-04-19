package com.demo.netty.protocol.request;

import com.demo.netty.protocol.Packet;
import com.demo.netty.protocol.command.Command;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/4/8
 */
@Data
@NoArgsConstructor
public class MessageRequestPacket extends Packet {

    private String message;

    public MessageRequestPacket(String message) {
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return Command.MESSAGE_REQUEST;
    }
}
