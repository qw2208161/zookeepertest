package .dao;

import .model.Name;
import java.util.List;

/**
 * 数据接口
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:03:37
 * @copyright www.ucarinc.com All Rights Reserved.
 */
public interface NameDao {
    
    /**
     * 根据对象属性插入
     *
     * @param name 实例对象
     * @return {@link Integer}
     */
    Integer insertByProperty(Name name);

    /**
     * 根据对象属性带主键更新
     *
     * @param name 实例对象
     * @return {@link Integer}
     */
    Integer updateByPrimaryKey(Name name);

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return {@link Integer}
     */
    Integer deleteByPrimaryKey(Long id);

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