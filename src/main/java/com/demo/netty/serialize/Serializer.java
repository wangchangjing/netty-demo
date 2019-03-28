package com.demo.netty.serialize;

import com.demo.netty.serialize.impl.JSONSerializer;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/3/28
 */
public interface Serializer {

    Serializer DEFAULT = new JSONSerializer();

    /**
     * 序列化算法
     */
    byte getSerializerAlogrithm();

    /**
     * java 对象转换成二进制
     */
    byte[] serialize(Object object);

    /**
     * 二进制转换成 java 对象
     */
    <T> T deserialize(Class<T> clazz, byte[] bytes);

}
