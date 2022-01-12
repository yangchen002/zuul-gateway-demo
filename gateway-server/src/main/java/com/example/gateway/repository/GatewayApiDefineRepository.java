package com.example.gateway.repository;

import com.example.gateway.entity.GatewayApiDefine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author admin
 */
@Repository
public interface GatewayApiDefineRepository extends JpaRepository<GatewayApiDefine, String>, JpaSpecificationExecutor<GatewayApiDefine> {

    /**
     * 查询路由url集合
     * @param enabled
     * @return
     */
    List<GatewayApiDefine> findAllByEnabled(boolean enabled);
}
