package com.demo.netty.protocol.request;

import com.demo.netty.protocol.Packet;
import lombok.Data;

import java.util.List;

import static com.demo.netty.protocol.command.Command.CREATE_GROUP_REQUEST;

/**
 * @author WangChangJing
 * @description:
 * @date 2019-04-22
 */
@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {
        return CREATE_GROUP_REQUEST;
    }
}
