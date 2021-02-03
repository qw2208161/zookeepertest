package .dao.impl;

import .dao.SysUserRoleDao;
import .model.SysUserRole;
import com.ucarinc.framework.autoconfigure.ubatis.dao.BaseUbatisDaoImpl;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据接口实现
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:03:37
 * @copyright www.ucarinc.com All Rights Reserved.
 */
@Repository
public class SysUserRoleDaoImpl extends BaseUbatisDaoImpl implements SysUserRoleDao {
    private static final String NAMESPACE = ".dao.SysUserRoleDao.";
    
    @Override
    public Integer insertByProperty(SysUserRole sysUserRole) {
        return (Integer) this.insert(NAMESPACE + "insertByProperty", sysUserRole);
    }

    @Override
    public Integer updateByPrimaryKey(SysUserRole sysUserRole) {
        return this.update(NAMESPACE + "updateByPrimaryKey", sysUserRole);
    }

    @Override
    public Integer deleteByPrimaryKey(String userId) {
        return this.deleteObject(NAMESPACE + "deleteByPrimaryKey", userId);
    }

    @Override
    public Integer deleteByProperty(SysUserRole sysUserRole) {
        return this.deleteObject(NAMESPACE + "deleteByProperty", sysUserRole);
    }

    @Override
    public SysUserRole selectByPrimaryKey(String userId) {
        return (SysUserRole) this.queryForObject(NAMESPACE + "selectByPrimaryKey", userId);
    }
    
    @Override
    public List<SysUserRole> selectByProperty(SysUserRole sysUserRole) {
        return this.queryForList(NAMESPACE + "selectByProperty", sysUserRole);
    }

    @Override
    public Long countByProperty(SysUserRole sysUserRole) {
        return (Long) this.queryForObject(NAMESPACE + "countByProperty", sysUserRole);
    }

}