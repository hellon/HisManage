package com.ruoyi.framework.shiro.web.filter.stateless;

import java.util.Map;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @program: RuoYi
 * @description:
 * @author: Hailong.LIU
 * @create: 2019-09-23 22:04
 */
public class StatelessToken implements AuthenticationToken {

    private String username;
    private String digest;
    private Map<String, ?> params;

    public StatelessToken(String username, String digest, Map<String, ?> params) {
        this.username = username;
        this.digest = digest;
        this.params = params;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public Map<String, ?> getParams() {
        return params;
    }

    public void setParams(Map<String, ?> params) {
        this.params = params;
    }

    @Override
    public Object getPrincipal() {
        return this.username;
    }

    @Override
    public Object getCredentials() {
        return this.digest;
    }
}
