package cn.m;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope //开启更新功能
public class Params {


    @Value("${version}")
    private String version;
    @Value("${application}")
    private String application;
    @Value("${systemName}")
    private String systemName;


    public String getVersion() {
        return version;
    }

    public String getApplication() {
        return application;
    }

    public String getSystemName() {
        return systemName;
    }
}
