package com.xiaomaju.reggie.config;

/**
 * @PROJECT_NAME: reggie_take_out
 * @DESCRIPTION:
 * @USER: Lu
 * @DATE: 2022/10/23 20:34
 */

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;

/**
 * 配置MP的分页插件
 */
@Configuration
public class MyBatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor myBatisPlusInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return mybatisPlusInterceptor;
    }
}
