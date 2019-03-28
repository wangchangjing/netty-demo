package com.demo.netty.protocol.command;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/3/28
 */
@Data
public abstract class Packet {
    @JSONField(deserialize = false, serialize = false)
    private Byte version = 1;

    @JSONField(serialize = false)
    public abstract Byte getCommand();
}
