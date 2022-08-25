package com.ae.liteflow.component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent("f")
public class FCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("执行F逻辑");
    }
}
