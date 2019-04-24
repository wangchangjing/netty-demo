package com.demo.netty.protocol.response;

import com.demo.netty.protocol.Packet;
import lombok.Data;

import static com.demo.netty.protocol.command.Command.JOIN_GROUP_RESPONSE;


@Data
public class JoinGroupResponsePacket extends Packet {
    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return JOIN_GROUP_RESPONSE;
    }
}
