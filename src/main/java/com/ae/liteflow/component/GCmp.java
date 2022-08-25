package com.ae.liteflow.component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent("g")
public class GCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("执行G逻辑");
    }
}
