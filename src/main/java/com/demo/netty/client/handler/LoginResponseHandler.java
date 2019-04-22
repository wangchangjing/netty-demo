package com.demo.netty.client.handler;

import com.demo.netty.protocol.response.LoginResponsePacket;
import com.demo.netty.session.Session;
import com.demo.netty.util.SessionUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author WangChangJing
 * @description:
 * @date 2019/4/8
 */
public class LoginResponseHandler extends SimpleChannelInboundHandler<LoginResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LoginResponsePacket loginResponsePacket) {
        String userId = loginResponsePacket.getUserId();
        String userName = loginResponsePacket.getUserName();

        if (loginResponsePacket.isSuccess()) {
            System.out.println("[" + userName + "]登录成功，userId 为: " + loginResponsePacket.getUserId());
            SessionUtil.bindSession(new Session(userId, userName), ctx.channel());
        } else {
            System.out.println("[" + userName + "]登录失败，原因：" + loginResponsePacket.getReason());
        }
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) {
        System.out.println("客户端连接被关闭!");
    }
}