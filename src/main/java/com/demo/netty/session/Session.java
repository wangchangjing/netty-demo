package com.demo.netty.session;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WangChangJing
 * @description:
 * @date 2019-04-22
 */
@Data
@NoArgsConstructor
public class Session {
    // 用户唯一性标识
    private String userId;
    private String userName;

    public Session(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return userId + ":" + userName;
    }

}