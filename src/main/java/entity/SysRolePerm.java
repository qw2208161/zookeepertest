package entity;

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
public class SysRolePerm implements Serializable {
    private static final long serialVersionUID = -72293127651471551L;

    private String roleId;
    
    private String permVal;
    
    private Integer permType;
        
}