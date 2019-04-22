package com.demo.netty.attribute;

import com.demo.netty.session.Session;
import io.netty.util.AttributeKey;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/4/8
 */
public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
