package com.sys.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {
    // 通用
        SUCCESS(200, "SUCCESS"),
        ERROR(500, "服务端异常"),
    // 登陆
        LOGIN_ERROR(500210, "用户名或者密码不正确"),
        MOBILE_ERROR(500211, "手机号码格式不正确"),
        BIND_ERROR(500212, "参数校验异常"),
    //注册
    REGISTRATION_ERROR(500213, "注册失败"),
    //校验
    VERIFICATION_ERROR(500214, "校验失败");

        private final Integer code;
        private final String message;

}
