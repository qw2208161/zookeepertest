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
public class Tor implements Serializable {
    private static final long serialVersionUID = 490052872718173628L;

    private Integer id;
    
    private String name;
    
    private String name2;
        
}