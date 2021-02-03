package service;

import .entity.SysPerm;
import java.util.List;

/**
 * 权限服务接口
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:05:31
 * @copyright www.ucarinc.com All Rights Reserved.
 */
public interface SysPermService {
    
    /**
     * 根据对象属性插入
     *
     * @param sysPerm 实例对象
     * @return {@link Integer}
     */
    String insertByProperty(SysPerm sysPerm);

    /**
     * 根据对象属性列表批量插入
     *
     * @param list 实例列表
     * @return {@link Integer}
     */
    Integer insertBatchByProperty(List<SysPerm> list);

    /**
     * 根据对象属性带主键更新
     *
     * @param sysPerm 实例对象
     * @return {@link Integer}
     */
    Integer updateByPrimaryKey(SysPerm sysPerm);

    /**
     * 根据对象属性带主键列表批量更新
     *
     * @param list 实例对象列表
     * @return {@link Integer}
     */
    Integer updateBatchByPrimaryKey(List<SysPerm> list);

    /**
     * 根据主键删除
     *
     * @param pval 主键
     * @return {@link Integer}
     */
    Integer deleteByPrimaryKey(String pval);

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
     * @param sysPerm 实例对象
     * @return {@link Integer}
     */
    Integer deleteByProperty(SysPerm sysPerm);

    /**
     * 根据主键进行查询
     *
     * @param pval 主键
     * @return {@link SysPerm}
     */
    SysPerm selectByPrimaryKey(String pval);
    
    /**
     * 根据属性进行查询
     *
     * @param sysPerm 实例对象
     * @return {@link List<SysPerm>}
     */
    List<SysPerm> selectByProperty(SysPerm sysPerm);

    /**
     * 根据属性进行查询统计
     *
     * @param sysPerm 实例对象
     * @return {@link Long}
     */
    Long countByProperty(SysPerm sysPerm);

}