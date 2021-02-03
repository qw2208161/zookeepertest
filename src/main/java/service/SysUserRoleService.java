package service;

import .entity.SysUserRole;
import java.util.List;

/**
 * 服务接口
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:05:31
 * @copyright www.ucarinc.com All Rights Reserved.
 */
public interface SysUserRoleService {
    
    /**
     * 根据对象属性插入
     *
     * @param sysUserRole 实例对象
     * @return {@link Integer}
     */
    String insertByProperty(SysUserRole sysUserRole);

    /**
     * 根据对象属性列表批量插入
     *
     * @param list 实例列表
     * @return {@link Integer}
     */
    Integer insertBatchByProperty(List<SysUserRole> list);

    /**
     * 根据对象属性带主键更新
     *
     * @param sysUserRole 实例对象
     * @return {@link Integer}
     */
    Integer updateByPrimaryKey(SysUserRole sysUserRole);

    /**
     * 根据对象属性带主键列表批量更新
     *
     * @param list 实例对象列表
     * @return {@link Integer}
     */
    Integer updateBatchByPrimaryKey(List<SysUserRole> list);

    /**
     * 根据主键删除
     *
     * @param userId 主键
     * @return {@link Integer}
     */
    Integer deleteByPrimaryKey(String userId);

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
     * @param sysUserRole 实例对象
     * @return {@link Integer}
     */
    Integer deleteByProperty(SysUserRole sysUserRole);

    /**
     * 根据主键进行查询
     *
     * @param userId 主键
     * @return {@link SysUserRole}
     */
    SysUserRole selectByPrimaryKey(String userId);
    
    /**
     * 根据属性进行查询
     *
     * @param sysUserRole 实例对象
     * @return {@link List<SysUserRole>}
     */
    List<SysUserRole> selectByProperty(SysUserRole sysUserRole);

    /**
     * 根据属性进行查询统计
     *
     * @param sysUserRole 实例对象
     * @return {@link Long}
     */
    Long countByProperty(SysUserRole sysUserRole);

}