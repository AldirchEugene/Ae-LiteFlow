package com.ae.liteflow.customer;

import com.yomahub.liteflow.parser.el.ClassXmlFlowELParser;
import org.springframework.stereotype.Component;

@Component
public class TestCustomParser extends ClassXmlFlowELParser {
    @Override
    public String parseCustom() {
        System.out.println("进入自定义parser");
        String xmlContent = null;
        //这里需要自己扩展从自定义的地方获取配置
        StringBuffer sb = new StringBuffer();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
        sb.append("<flow>\r\n");
        sb.append("<chain name=\"chain1\">\r\n");
        sb.append("THEN(a, b, c);\r\n");
        sb.append("</chain>\r\n");
        sb.append("</flow>\r\n");
        return xmlContent;
    }
}
