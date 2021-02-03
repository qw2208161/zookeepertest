package mapper;
import .entity.Tor;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据接口
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:05:31
 * @copyright www.ucarinc.com All Rights Reserved.
 */
@Mapper
public interface TorMapper {
    
    /**
     * 根据对象属性插入
     *
     * @param tor 实例对象
     * @return {@link Integer}
     */
    Integer insertByProperty(Tor tor);

    /**
     * 根据对象列表属性插入
     *
     * @param list 实例列表
     * @return {@link Integer}
     */
    Integer insertBatchByProperty(List<Tor> list);

    /**
     * 根据对象属性带主键更新
     *
     * @param tor 实例对象
     * @return {@link Integer}
     */
    Integer updateByPrimaryKey(Tor tor);

    /**
    * 根据对象属性带主键列表批量更新
    *
    * @param list 实例对象列表
    * @return {@link Integer}
    */
    Integer updateBatchByPrimaryKey(List<Tor> list);

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return {@link Integer}
     */
    Integer deleteByPrimaryKey(Integer id);

    /**
     * 根据主键列表批量删除
     *
     * @param list 主键列表
     * @return {@link Integer}
     */
    Integer deleteBatchByPrimaryKey(List<Integer> list);

    /**
     * 根据属性删除
     *
     * @param tor 实例对象
     * @return {@link Integer}
     */
    Integer deleteByProperty(Tor tor);

    /**
     * 根据主键进行查询
     *
     * @param id 主键
     * @return {@link Tor}
     */
    Tor selectByPrimaryKey(Integer id);
    
    /**
     * 根据属性进行查询
     *
     * @param tor 实例对象
     * @return {@link List<Tor>}
     */
    List<Tor> selectByProperty(Tor tor);

    /**
     * 根据属性进行查询统计
     *
     * @param tor 实例对象
     * @return {@link Long}
     */
    Long countByProperty(Tor tor);
}