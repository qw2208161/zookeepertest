package model;

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
public class SysRolePerm implements Serializable {
    private static final long serialVersionUID = 673785817973727700L;

    private String roleId;
    
    private String permVal;
    
    private Integer permType;
        
}