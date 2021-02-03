package service;

import .entity.SysRolePerm;
import java.util.List;

/**
 * 服务接口
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:05:31
 * @copyright www.ucarinc.com All Rights Reserved.
 */
public interface SysRolePermService {
    
    /**
     * 根据对象属性插入
     *
     * @param sysRolePerm 实例对象
     * @return {@link Integer}
     */
    String insertByProperty(SysRolePerm sysRolePerm);

    /**
     * 根据对象属性列表批量插入
     *
     * @param list 实例列表
     * @return {@link Integer}
     */
    Integer insertBatchByProperty(List<SysRolePerm> list);

    /**
     * 根据对象属性带主键更新
     *
     * @param sysRolePerm 实例对象
     * @return {@link Integer}
     */
    Integer updateByPrimaryKey(SysRolePerm sysRolePerm);

    /**
     * 根据对象属性带主键列表批量更新
     *
     * @param list 实例对象列表
     * @return {@link Integer}
     */
    Integer updateBatchByPrimaryKey(List<SysRolePerm> list);

    /**
     * 根据主键删除
     *
     * @param roleId 主键
     * @return {@link Integer}
     */
    Integer deleteByPrimaryKey(String roleId);

    /**
     * 根据主键列表批量删除
     *
     * @param list 主键列表
     * @return {@link Integer}
     */
    Integer deleteBatchByPrimaryKey(List<String> list);

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