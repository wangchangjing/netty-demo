package com.demo.netty.util;

import java.util.UUID;

/**
 * @author WangChangJing
 * @description:
 * @date 2019-04-22
 */
public class IDUtil {
    public static String randomId() {
        return UUID.randomUUID().toString().split("-")[0];
    }
}
