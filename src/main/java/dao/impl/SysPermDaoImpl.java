package .dao.impl;

import .dao.SysPermDao;
import .model.SysPerm;
import com.ucarinc.framework.autoconfigure.ubatis.dao.BaseUbatisDaoImpl;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 权限数据接口实现
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:03:36
 * @copyright www.ucarinc.com All Rights Reserved.
 */
@Repository
public class SysPermDaoImpl extends BaseUbatisDaoImpl implements SysPermDao {
    private static final String NAMESPACE = ".dao.SysPermDao.";
    
    @Override
    public Integer insertByProperty(SysPerm sysPerm) {
        return (Integer) this.insert(NAMESPACE + "insertByProperty", sysPerm);
    }

    @Override
    public Integer updateByPrimaryKey(SysPerm sysPerm) {
        return this.update(NAMESPACE + "updateByPrimaryKey", sysPerm);
    }

    @Override
    public Integer deleteByPrimaryKey(String pval) {
        return this.deleteObject(NAMESPACE + "deleteByPrimaryKey", pval);
    }

    @Override
    public Integer deleteByProperty(SysPerm sysPerm) {
        return this.deleteObject(NAMESPACE + "deleteByProperty", sysPerm);
    }

    @Override
    public SysPerm selectByPrimaryKey(String pval) {
        return (SysPerm) this.queryForObject(NAMESPACE + "selectByPrimaryKey", pval);
    }
    
    @Override
    public List<SysPerm> selectByProperty(SysPerm sysPerm) {
        return this.queryForList(NAMESPACE + "selectByProperty", sysPerm);
    }

    @Override
    public Long countByProperty(SysPerm sysPerm) {
        return (Long) this.queryForObject(NAMESPACE + "countByProperty", sysPerm);
    }

}