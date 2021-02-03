package service.impl;

import .mapper.SysPermMapper;
import .entity.SysPerm;
import .service.SysPermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 权限服务接口实现
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:05:31
 * @copyright www.ucarinc.com All Rights Reserved.
 */
@Service("sysPermService")
public class SysPermServiceImpl implements SysPermService {
    @Autowired
    private SysPermMapper sysPermMapper;
    
    @Override
    public Integer insertByProperty(SysPerm sysPerm) {
        return this.sysPermMapper.insertByProperty(sysPerm);
    }

    @Override
    public Integer insertBatchByProperty(List<SysPerm> list) {
        return this.sysPermMapper.insertBatchByProperty(list);
    }

    @Override
    public Integer updateByPrimaryKey(SysPerm sysPerm) {
        return this.sysPermMapper.updateByPrimaryKey(sysPerm);
    }

    @Override
    public Integer updateBatchByPrimaryKey(List<SysPerm> list) {
        return this.sysPermMapper.updateBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByPrimaryKey(String pval) {
        return this.sysPermMapper.deleteByPrimaryKey(pval);
    }

    @Override
    public Integer deleteBatchByPrimaryKey(List<String> list) {
        return this.sysPermMapper.deleteBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByProperty(SysPerm sysPerm) {
        return this.sysPermMapper.deleteByProperty(sysPerm);
    }

    @Override
    public SysPerm selectByPrimaryKey(String pval) {
        return this.sysPermMapper.selectByPrimaryKey(pval);
    }
    
    @Override
    public List<SysPerm> selectByProperty(SysPerm sysPerm) {
        return this.sysPermMapper.selectByProperty(sysPerm);
    }

    @Override
    public Long countByProperty(SysPerm sysPerm) {
        return this.sysPermMapper.countByProperty(sysPerm);
    }
}