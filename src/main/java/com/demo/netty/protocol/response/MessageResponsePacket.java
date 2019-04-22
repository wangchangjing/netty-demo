package com.demo.netty.protocol.response;

import com.demo.netty.protocol.Packet;
import lombok.Data;

import static com.demo.netty.protocol.command.Command.MESSAGE_RESPONSE;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/4/8
 */
@Data
public class MessageResponsePacket extends Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}
