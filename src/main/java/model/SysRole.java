package model;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 表实体类
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:03:36
 * @copyright www.ucarinc.com All Rights Reserved.
 */
@Data
public class SysRole implements Serializable {
    private static final long serialVersionUID = -55736847192045266L;
    /**
     * 角色id
     */
    private String rid;
    
    /**
     * 角色名，用于显示
     */
    private String rname;
    
    /**
     * 角色描述
     */
    private String rdesc;
    
    /**
     * 角色值，用于权限判断
     */
    private String rval;
    
    /**
     * 创建时间
     */
    private Date created;
    
    /**
     * 修改时间
     */
    private Date updated;
    
    
}