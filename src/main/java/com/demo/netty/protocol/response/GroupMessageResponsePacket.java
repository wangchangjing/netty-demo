package com.demo.netty.protocol.response;

import com.demo.netty.protocol.Packet;
import com.demo.netty.session.Session;
import lombok.Data;

import static com.demo.netty.protocol.command.Command.GROUP_MESSAGE_RESPONSE;


@Data
public class GroupMessageResponsePacket extends Packet {

    private String fromGroupId;

    private Session fromUser;

    private String message;

    @Override
    public Byte getCommand() {
        return GROUP_MESSAGE_RESPONSE;
    }
}
