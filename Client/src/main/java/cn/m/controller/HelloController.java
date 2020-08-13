package cn.m.controller;

import cn.m.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Params params;

    /**
     * 返回配置文件中的值
     */
    @GetMapping("/from")
    @ResponseBody
    public String returnVersion(){
        return params.getApplication()+","+params.getVersion()+","+params.getSystemName();
    }
}
