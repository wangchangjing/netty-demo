package com.demo.netty.attribute;

import io.netty.util.AttributeKey;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/3/29
 */
public interface Attributes {
    AttributeKey<Boolean> LOGIN = AttributeKey.newInstance("login");
}
