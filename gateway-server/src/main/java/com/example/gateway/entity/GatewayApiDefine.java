package com.example.gateway.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 */
@Data
@Entity
@Table(name = "gateway_api_define")
public class GatewayApiDefine {
    /**
     *
     */
    @Id
    @Column(name = "id")
    private String id;
    /**
     *
     */
    @Column(name = "path")
    private String path;
    /**
     *
     */
    @Column(name = "service_id")
    private String serviceId;
    /**
     *
     */
    @Column(name = "url")
    private String url;
    /**
     *
     */
    @Column(name = "retryable")
    private Integer retryable;
    /**
     *
     */
    @Column(name = "enabled")
    private boolean enabled;
    /**
     *
     */
    @Column(name = "strip_prefix")
    private boolean stripPrefix;
    /**
     *
     */
    @Column(name = "api_name")
    private String apiName;
}