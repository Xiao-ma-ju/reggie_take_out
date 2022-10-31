package com.xiaomaju.reggie.common;

/**
 * @PROJECT_NAME: reggie_take_out
 * @DESCRIPTION: 基于ThreadLocal封装的工具类，用于用户保存和获取当前登录用户的id
 * @USER: CodeDeer
 * @DATE: 2022/10/31 23:56
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     * @param id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 获取值
     * @return
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
