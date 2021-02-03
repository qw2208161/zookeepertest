package .dao.impl;

import .dao.SysRolePermDao;
import .model.SysRolePerm;
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
public class SysRolePermDaoImpl extends BaseUbatisDaoImpl implements SysRolePermDao {
    private static final String NAMESPACE = ".dao.SysRolePermDao.";
    
    @Override
    public Integer insertByProperty(SysRolePerm sysRolePerm) {
        return (Integer) this.insert(NAMESPACE + "insertByProperty", sysRolePerm);
    }

    @Override
    public Integer updateByPrimaryKey(SysRolePerm sysRolePerm) {
        return this.update(NAMESPACE + "updateByPrimaryKey", sysRolePerm);
    }

    @Override
    public Integer deleteByPrimaryKey(String roleId) {
        return this.deleteObject(NAMESPACE + "deleteByPrimaryKey", roleId);
    }

    @Override
    public Integer deleteByProperty(SysRolePerm sysRolePerm) {
        return this.deleteObject(NAMESPACE + "deleteByProperty", sysRolePerm);
    }

    @Override
    public SysRolePerm selectByPrimaryKey(String roleId) {
        return (SysRolePerm) this.queryForObject(NAMESPACE + "selectByPrimaryKey", roleId);
    }
    
    @Override
    public List<SysRolePerm> selectByProperty(SysRolePerm sysRolePerm) {
        return this.queryForList(NAMESPACE + "selectByProperty", sysRolePerm);
    }

    @Override
    public Long countByProperty(SysRolePerm sysRolePerm) {
        return (Long) this.queryForObject(NAMESPACE + "countByProperty", sysRolePerm);
    }

}