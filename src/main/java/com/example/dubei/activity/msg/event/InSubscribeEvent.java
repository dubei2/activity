package com.example.dubei.activity.msg.event;

import com.example.dubei.activity.msg.in.InMsg;

import java.util.Map;

public class InSubscribeEvent extends InMsg {

    /*
     * 关注/取消事件
     */
    public InSubscribeEvent(Map<String, String> map) {
        super(map);
    }

}
