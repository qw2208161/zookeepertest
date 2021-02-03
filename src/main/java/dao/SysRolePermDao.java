package .dao;

import .model.SysRolePerm;
import java.util.List;

/**
 * 数据接口
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:03:36
 * @copyright www.ucarinc.com All Rights Reserved.
 */
public interface SysRolePermDao {
    
    /**
     * 根据对象属性插入
     *
     * @param sysRolePerm 实例对象
     * @return {@link Integer}
     */
    Integer insertByProperty(SysRolePerm sysRolePerm);

    /**
     * 根据对象属性带主键更新
     *
     * @param sysRolePerm 实例对象
     * @return {@link Integer}
     */
    Integer updateByPrimaryKey(SysRolePerm sysRolePerm);

    /**
     * 根据主键删除
     *
     * @param roleId 主键
     * @return {@link Integer}
     */
    Integer deleteByPrimaryKey(String roleId);

    /**
     * 根据属性删除
     *
     * @param sysRolePerm 实例对象
     * @return {@link Integer}
     */
    Integer deleteByProperty(SysRolePerm sysRolePerm);

    /**
     * 根据主键进行查询
     *
     * @param roleId 主键
     * @return {@link SysRolePerm}
     */
    SysRolePerm selectByPrimaryKey(String roleId);
    
    /**
     * 根据属性进行查询
     *
     * @param sysRolePerm 实例对象
     * @return {@link List<SysRolePerm>}
     */
    List<SysRolePerm> selectByProperty(SysRolePerm sysRolePerm);

    /**
     * 根据属性进行查询统计
     *
     * @param sysRolePerm 实例对象
     * @return {@link Long}
     */
    Long countByProperty(SysRolePerm sysRolePerm);

}