package com.demo.netty.attribute;

import io.netty.util.AttributeKey;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/4/8
 */
public interface Attributes {
    AttributeKey<Boolean> LOGIN = AttributeKey.newInstance("login");
}
