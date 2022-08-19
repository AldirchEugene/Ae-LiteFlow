package com.ae.liteflow.controller;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LiteFlowController {

    @Resource
    private FlowExecutor flowExecutor;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        LiteflowResponse response = flowExecutor.execute2Resp("chain1", "arg");
        return "success";
    }
}
