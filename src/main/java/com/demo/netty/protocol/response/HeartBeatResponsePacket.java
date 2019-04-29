package com.demo.netty.protocol.response;


import com.demo.netty.protocol.Packet;

import static com.demo.netty.protocol.command.Command.HEARTBEAT_RESPONSE;

public class HeartBeatResponsePacket extends Packet {
    @Override
    public Byte getCommand() {
        return HEARTBEAT_RESPONSE;
    }
}
