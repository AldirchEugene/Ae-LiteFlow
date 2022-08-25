package com.ae.liteflow.component;

import com.alibaba.fastjson.JSONObject;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent("b")
public class BCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        int a = 10/0;
        System.out.println("执行B逻辑");
    }
}
