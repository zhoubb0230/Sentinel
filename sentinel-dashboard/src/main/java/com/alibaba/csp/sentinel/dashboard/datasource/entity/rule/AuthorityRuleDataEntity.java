package com.alibaba.csp.sentinel.dashboard.datasource.entity.rule;

import com.alibaba.csp.sentinel.slots.block.Rule;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityRule;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * @ClassName AuthorityRuleDataEntity
 * Author: zbb
 * Date: 2021-05-07 15:44
 * Description:
 **/
public class AuthorityRuleDataEntity implements RuleEntity {

    private Long id;
    private String app;
    private String ip;
    private Integer port;
    private String limitApp;
    private String resource;
    private int strategy;
    private Date gmtCreate;
    private Date gmtModified;

    public AuthorityRuleDataEntity(){};

    public AuthorityRuleDataEntity(AuthorityRuleEntity entity){
        this.id = entity.getId();
        this.app = entity.getApp();
        this.ip = entity.getIp();
        this.port = entity.getPort();
        this.limitApp = entity.getLimitApp();
        this.resource = entity.getResource();
        this.strategy = entity.getStrategy();
        this.gmtCreate = entity.getGmtCreate();
        this.gmtModified = entity.getGmtModified();
    }

    @JsonIgnore
    public AuthorityRuleEntity toAuthorityRuleEntity(){
        AuthorityRuleEntity entity = new AuthorityRuleEntity();
        entity.setId(this.id);
        entity.setApp(this.app);
        entity.setIp(this.ip);
        entity.setPort(this.port);
        entity.setGmtCreate(this.gmtCreate);
        entity.setGmtModified(this.gmtModified);
        AuthorityRule rule = new AuthorityRule();
        rule.setStrategy(this.strategy);
        rule.setLimitApp(this.limitApp);
        rule.setResource(this.resource);
        entity.setRule(rule);
        return entity;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    @Override
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getLimitApp() {
        return limitApp;
    }

    public void setLimitApp(String limitApp) {
        this.limitApp = limitApp;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public int getStrategy() {
        return strategy;
    }

    public void setStrategy(int strategy) {
        this.strategy = strategy;
    }

    @Override
    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public Rule toRule() {
        return null;
    }
}
