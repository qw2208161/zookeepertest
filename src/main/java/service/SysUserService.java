package service;

import .entity.SysUser;
import java.util.List;

/**
 * 服务接口
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:05:31
 * @copyright www.ucarinc.com All Rights Reserved.
 */
public interface SysUserService {
    
    /**
     * 根据对象属性插入
     *
     * @param sysUser 实例对象
     * @return {@link Integer}
     */
    String insertByProperty(SysUser sysUser);

    /**
     * 根据对象属性列表批量插入
     *
     * @param list 实例列表
     * @return {@link Integer}
     */
    Integer insertBatchByProperty(List<SysUser> list);

    /**
     * 根据对象属性带主键更新
     *
     * @param sysUser 实例对象
     * @return {@link Integer}
     */
    Integer updateByPrimaryKey(SysUser sysUser);

    /**
     * 根据对象属性带主键列表批量更新
     *
     * @param list 实例对象列表
     * @return {@link Integer}
     */
    Integer updateBatchByPrimaryKey(List<SysUser> list);

    /**
     * 根据主键删除
     *
     * @param uid 主键
     * @return {@link Integer}
     */
    Integer deleteByPrimaryKey(String uid);

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