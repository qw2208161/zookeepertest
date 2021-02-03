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
public class Name implements Serializable {
    private static final long serialVersionUID = -15913785298906043L;

    private Long id;
    
    private String name;
        
}