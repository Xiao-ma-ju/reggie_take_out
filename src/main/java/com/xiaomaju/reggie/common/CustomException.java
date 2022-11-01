package com.xiaomaju.reggie.common;

/**
 * @PROJECT_NAME: reggie_take_out
 * @DESCRIPTION: 自定义业务异常类
 * @USER: CodeDeer
 * @DATE: 2022/11/1 13:13
 */
public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}
