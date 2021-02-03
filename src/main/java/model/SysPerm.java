package model;

import java.util.Date;
import lombok.Data;
import java.io.Serializable;

/**
 * 权限表实体类
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:03:36
 * @copyright www.ucarinc.com All Rights Reserved.
 */
@Data
public class SysPerm implements Serializable {
    private static final long serialVersionUID = -59652475186596614L;
    /**
     * 权限值，shiro的权限控制表达式
     */
    private String pval;
    
    /**
     * 父权限id
     */
    private String parent;
    
    /**
     * 权限名称
     */
    private String pname;
    
    /**
     * 权限类型：1.菜单 2.按钮 3.接口 4.特殊
     */
    private Integer ptype;
    
    /**
     * 是否叶子节点
     */
    private Integer leaf;
    
    /**
     * 创建时间
     */
    private Date created;
    
    /**
     * 修改时间
     */
    private Date updated;
    
    
}