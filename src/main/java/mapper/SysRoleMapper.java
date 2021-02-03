package mapper;
import .entity.SysRole;
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
public interface SysRoleMapper {
    
    /**
     * 根据对象属性插入
     *
     * @param sysRole 实例对象
     * @return {@link Integer}
     */
    Integer insertByProperty(SysRole sysRole);

    /**
     * 根据对象列表属性插入
     *
     * @param list 实例列表
     * @return {@link Integer}
     */
    Integer insertBatchByProperty(List<SysRole> list);

    /**
     * 根据对象属性带主键更新
     *
     * @param sysRole 实例对象
     * @return {@link Integer}
     */
    Integer updateByPrimaryKey(SysRole sysRole);

    /**
    * 根据对象属性带主键列表批量更新
    *
    * @param list 实例对象列表
    * @return {@link Integer}
    */
    Integer updateBatchByPrimaryKey(List<SysRole> list);

    /**
     * 根据主键删除
     *
     * @param rid 主键
     * @return {@link Integer}
     */
    Integer deleteByPrimaryKey(String rid);

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
     * @param sysRole 实例对象
     * @return {@link Integer}
     */
    Integer deleteByProperty(SysRole sysRole);

    /**
     * 根据主键进行查询
     *
     * @param rid 主键
     * @return {@link SysRole}
     */
    SysRole selectByPrimaryKey(String rid);
    
    /**
     * 根据属性进行查询
     *
     * @param sysRole 实例对象
     * @return {@link List<SysRole>}
     */
    List<SysRole> selectByProperty(SysRole sysRole);

    /**
     * 根据属性进行查询统计
     *
     * @param sysRole 实例对象
     * @return {@link Long}
     */
    Long countByProperty(SysRole sysRole);
}