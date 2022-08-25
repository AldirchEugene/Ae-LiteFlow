package com.ae.liteflow.controller;

import com.alibaba.fastjson.JSONObject;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import com.yomahub.liteflow.slot.DefaultContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LiteFlowController {

    //不能使用 @Autowired 注入
    @Resource
    private FlowExecutor flowExecutor;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        DefaultContext defaultContext = new DefaultContext();
        JSONObject params = new JSONObject();
        params.put("aa","123");
        params.put("bb","234");
        params.put("cc","345");
        defaultContext.setData("key",params);
        LiteflowResponse response = flowExecutor.execute2Resp("chain1", params,defaultContext);
        boolean success = response.isSuccess();
        if (success){
            return "success";
        }else {
            //java.lang.ArithmeticException: / by zero
            return response.getCause().toString();
        }
    }
}
