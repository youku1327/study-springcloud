package com.zszxz.config.client.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author lsc
 * <p> 获取配置属性</p>
 */
@Component
@ConfigurationProperties(prefix = "zszxz.springcloud.config")
public class ZszxzConfigProperties {

    private String zszxz;

    public String getZszxz() {
        return zszxz;
    }

    public void setZszxz(String zszxz) {
        this.zszxz = zszxz;
    }
}
