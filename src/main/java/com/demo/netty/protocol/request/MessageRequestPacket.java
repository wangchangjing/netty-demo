package com.demo.netty.protocol.request;

import com.demo.netty.protocol.Packet;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.demo.netty.protocol.command.Command.MESSAGE_REQUEST;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/4/8
 */
@Data
@NoArgsConstructor
public class MessageRequestPacket extends Packet {
    private String toUserId;
    private String message;

    public MessageRequestPacket(String toUserId, String message) {
        this.toUserId = toUserId;
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}