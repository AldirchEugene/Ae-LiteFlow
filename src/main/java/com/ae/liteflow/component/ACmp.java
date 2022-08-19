package com.ae.liteflow.component;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component("a")
public class ACmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("执行A逻辑");
    }
}
