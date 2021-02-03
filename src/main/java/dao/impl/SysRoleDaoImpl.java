package .dao.impl;

import .dao.SysRoleDao;
import .model.SysRole;
import com.ucarinc.framework.autoconfigure.ubatis.dao.BaseUbatisDaoImpl;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据接口实现
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:03:36
 * @copyright www.ucarinc.com All Rights Reserved.
 */
@Repository
public class SysRoleDaoImpl extends BaseUbatisDaoImpl implements SysRoleDao {
    private static final String NAMESPACE = ".dao.SysRoleDao.";
    
    @Override
    public Integer insertByProperty(SysRole sysRole) {
        return (Integer) this.insert(NAMESPACE + "insertByProperty", sysRole);
    }

    @Override
    public Integer updateByPrimaryKey(SysRole sysRole) {
        return this.update(NAMESPACE + "updateByPrimaryKey", sysRole);
    }

    @Override
    public Integer deleteByPrimaryKey(String rid) {
        return this.deleteObject(NAMESPACE + "deleteByPrimaryKey", rid);
    }

    @Override
    public Integer deleteByProperty(SysRole sysRole) {
        return this.deleteObject(NAMESPACE + "deleteByProperty", sysRole);
    }

    @Override
    public SysRole selectByPrimaryKey(String rid) {
        return (SysRole) this.queryForObject(NAMESPACE + "selectByPrimaryKey", rid);
    }
    
    @Override
    public List<SysRole> selectByProperty(SysRole sysRole) {
        return this.queryForList(NAMESPACE + "selectByProperty", sysRole);
    }

    @Override
    public Long countByProperty(SysRole sysRole) {
        return (Long) this.queryForObject(NAMESPACE + "countByProperty", sysRole);
    }

}