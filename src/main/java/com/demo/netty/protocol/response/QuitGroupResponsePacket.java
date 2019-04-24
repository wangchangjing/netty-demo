package com.demo.netty.protocol.response;

import com.demo.netty.protocol.Packet;
import lombok.Data;

import static com.demo.netty.protocol.command.Command.QUIT_GROUP_RESPONSE;

@Data
public class QuitGroupResponsePacket extends Packet {

    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return QUIT_GROUP_RESPONSE;
    }
}
