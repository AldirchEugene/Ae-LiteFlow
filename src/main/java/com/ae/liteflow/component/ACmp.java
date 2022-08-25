package com.ae.liteflow.component;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;
import com.yomahub.liteflow.slot.DefaultContext;

@LiteflowComponent("a")
public class ACmp extends NodeSwitchComponent {

    @Override
    public String processSwitch() throws Exception {
        System.out.println("执行A逻辑");
        DefaultContext contextBean = this.getContextBean(DefaultContext.class);
        System.out.println("请求参数"+ contextBean.getData("key"));
        return "b";
    }
}
