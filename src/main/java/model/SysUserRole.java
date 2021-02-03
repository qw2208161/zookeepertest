package model;

import lombok.Data;
import java.io.Serializable;

/**
 * 表实体类
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:03:37
 * @copyright www.ucarinc.com All Rights Reserved.
 */
@Data
public class SysUserRole implements Serializable {
    private static final long serialVersionUID = -31526287756557121L;

    private String userId;
    
    private String roleId;
        
}