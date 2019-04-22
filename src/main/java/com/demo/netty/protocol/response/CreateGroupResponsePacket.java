package com.demo.netty.protocol.response;

import com.demo.netty.protocol.Packet;
import lombok.Data;

import java.util.List;

import static com.demo.netty.protocol.command.Command.CREATE_GROUP_RESPONSE;

/**
 * @author WangChangJing
 * @description:
 * @date 2019-04-22
 */
@Data
public class CreateGroupResponsePacket extends Packet {
    private boolean success;

    private String groupId;

    private List<String> userNameList;

    @Override
    public Byte getCommand() {
        return CREATE_GROUP_RESPONSE;
    }
}