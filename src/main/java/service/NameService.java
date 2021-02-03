package service;

import .entity.Name;
import java.util.List;

/**
 * 服务接口
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:05:31
 * @copyright www.ucarinc.com All Rights Reserved.
 */
public interface NameService {
    
    /**
     * 根据对象属性插入
     *
     * @param name 实例对象
     * @return {@link Integer}
     */
    Long insertByProperty(Name name);

    /**
     * 根据对象属性列表批量插入
     *
     * @param list 实例列表
     * @return {@link Integer}
     */
    Integer insertBatchByProperty(List<Name> list);

    /**
     * 根据对象属性带主键更新
     *
     * @param name 实例对象
     * @return {@link Integer}
     */
    Integer updateByPrimaryKey(Name name);

    /**
     * 根据对象属性带主键列表批量更新
     *
     * @param list 实例对象列表
     * @return {@link Integer}
     */
    Integer updateBatchByPrimaryKey(List<Name> list);

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return {@link Integer}
     */
    Integer deleteByPrimaryKey(Long id);

    /**
     * 根据主键列表批量删除
     *
     * @param list 主键列表
     * @return {@link Integer}
     */
    Integer deleteBatchByPrimaryKey(List<Long> list);

    /**
     * 根据属性删除
     *
     * @param name 实例对象
     * @return {@link Integer}
     */
    Integer deleteByProperty(Name name);

    /**
     * 根据主键进行查询
     *
     * @param id 主键
     * @return {@link Name}
     */
    Name selectByPrimaryKey(Long id);
    
    /**
     * 根据属性进行查询
     *
     * @param name 实例对象
     * @return {@link List<Name>}
     */
    List<Name> selectByProperty(Name name);

    /**
     * 根据属性进行查询统计
     *
     * @param name 实例对象
     * @return {@link Long}
     */
    Long countByProperty(Name name);

}