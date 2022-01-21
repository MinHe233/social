package com.social.model.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor  //满参构造方法
@NoArgsConstructor   //无参构造方法
public class User extends BasePojo {

    private Long id;
    private String mobile;
    private String password;

    //环信用户信息
    @TableField(exist = false)
    private String hxUser;
    @TableField(exist = false)
    private String hxPassword;
}
