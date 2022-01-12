package com.example.gateway.config;

import com.example.gateway.repository.GatewayApiDefineRepository;
import com.example.gateway.zuul.CustomRouteLocator;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangchen
 * @version 1.0
 * @date 2022-01-12 10:46
 */
@Configuration
@AllArgsConstructor
public class CustomZuulConfig {

    private final ZuulProperties zuulProperties;
    private final ServerProperties serverProperties;
    private final GatewayApiDefineRepository gatewayApiDefineRepository;

    @Bean
    public CustomRouteLocator routeLocator() {
        CustomRouteLocator routeLocator = new CustomRouteLocator(this.serverProperties.getServletPrefix(), this.zuulProperties);
        routeLocator.setGatewayApiDefineRepository(gatewayApiDefineRepository);
        return routeLocator;
    }
}
