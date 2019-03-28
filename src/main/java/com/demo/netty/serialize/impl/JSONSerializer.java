package com.demo.netty.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.demo.netty.serialize.Serializer;
import com.demo.netty.serialize.SerializerAlogrithm;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/3/28
 */
public class JSONSerializer implements Serializer {

    @Override
    public byte getSerializerAlogrithm() {
        return SerializerAlogrithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}
