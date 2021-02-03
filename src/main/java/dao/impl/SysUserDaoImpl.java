package .dao.impl;

import .dao.SysUserDao;
import .model.SysUser;
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
public class SysUserDaoImpl extends BaseUbatisDaoImpl implements SysUserDao {
    private static final String NAMESPACE = ".dao.SysUserDao.";
    
    @Override
    public Integer insertByProperty(SysUser sysUser) {
        return (Integer) this.insert(NAMESPACE + "insertByProperty", sysUser);
    }

    @Override
    public Integer updateByPrimaryKey(SysUser sysUser) {
        return this.update(NAMESPACE + "updateByPrimaryKey", sysUser);
    }

    @Override
    public Integer deleteByPrimaryKey(String uid) {
        return this.deleteObject(NAMESPACE + "deleteByPrimaryKey", uid);
    }

    @Override
    public Integer deleteByProperty(SysUser sysUser) {
        return this.deleteObject(NAMESPACE + "deleteByProperty", sysUser);
    }

    @Override
    public SysUser selectByPrimaryKey(String uid) {
        return (SysUser) this.queryForObject(NAMESPACE + "selectByPrimaryKey", uid);
    }
    
    @Override
    public List<SysUser> selectByProperty(SysUser sysUser) {
        return this.queryForList(NAMESPACE + "selectByProperty", sysUser);
    }

    @Override
    public Long countByProperty(SysUser sysUser) {
        return (Long) this.queryForObject(NAMESPACE + "countByProperty", sysUser);
    }

}