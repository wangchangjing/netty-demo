package com.demo.netty.protocol.request;


import com.demo.netty.protocol.Packet;

import static com.demo.netty.protocol.command.Command.HEARTBEAT_REQUEST;

public class HeartBeatRequestPacket extends Packet {
    @Override
    public Byte getCommand() {
        return HEARTBEAT_REQUEST;
    }
}
