package entity;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 实体
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:05:31
 * @copyright www.ucarinc.com All Rights Reserved.
 */
@Data
public class SysUser implements Serializable {
    private static final long serialVersionUID = -68020945503149684L;
    /**
     * 用户id
     */
    private String uid;
    
    /**
     * 登录名，不可改
     */
    private String uname;
    
    /**
     * 用户昵称，可改
     */
    private String nick;
    
    /**
     * 已加密的登录密码
     */
    private String pwd;
    
    /**
     * 加密盐值
     */
    private String salt;
    
    /**
     * 是否锁定
     */
    private Integer lock;
    
    /**
     * 创建时间
     */
    private Date created;
    
    /**
     * 修改时间
     */
    private Date updated;
    
    
}