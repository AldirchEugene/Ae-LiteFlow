package com.ae.liteflow.component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent("c")
public class CCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("执行C逻辑");
    }
}
