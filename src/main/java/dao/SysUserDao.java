package .dao;

import .model.SysUser;
import java.util.List;

/**
 * 数据接口
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:03:36
 * @copyright www.ucarinc.com All Rights Reserved.
 */
public interface SysUserDao {
    
    /**
     * 根据对象属性插入
     *
     * @param sysUser 实例对象
     * @return {@link Integer}
     */
    Integer insertByProperty(SysUser sysUser);

    /**
     * 根据对象属性带主键更新
     *
     * @param sysUser 实例对象
     * @return {@link Integer}
     */
    Integer updateByPrimaryKey(SysUser sysUser);

    /**
     * 根据主键删除
     *
     * @param uid 主键
     * @return {@link Integer}
     */
    Integer deleteByPrimaryKey(String uid);

    /**
     * 根据属性删除
     *
     * @param sysUser 实例对象
     * @return {@link Integer}
     */
    Integer deleteByProperty(SysUser sysUser);

    /**
     * 根据主键进行查询
     *
     * @param uid 主键
     * @return {@link SysUser}
     */
    SysUser selectByPrimaryKey(String uid);
    
    /**
     * 根据属性进行查询
     *
     * @param sysUser 实例对象
     * @return {@link List<SysUser>}
     */
    List<SysUser> selectByProperty(SysUser sysUser);

    /**
     * 根据属性进行查询统计
     *
     * @param sysUser 实例对象
     * @return {@link Long}
     */
    Long countByProperty(SysUser sysUser);

}