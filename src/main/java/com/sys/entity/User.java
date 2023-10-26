package com.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author zhijian-wang
 * @since 2023-10-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID,手机号码
     */
    @TableId(value = "uid")
    private String uid;

    private String nickname;

    private String password;

    /**
     * 头像
     */
    private String head;

//    /**
//     * 注册时间
//     */
//    private LocalDateTime registerDate;
//
//    /**
//     * 最后一次登录事件
//     */
//    private LocalDateTime lastLoginDate;

//    /**
//     * 登录次数
//     */
//    private Integer loginCount;

    private String major;
    /**
     * 身份
     * admin/user
     */
    private String identity;

}
