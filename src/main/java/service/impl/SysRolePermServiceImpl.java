package service.impl;

import .mapper.SysRolePermMapper;
import .entity.SysRolePerm;
import .service.SysRolePermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务接口实现
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:05:31
 * @copyright www.ucarinc.com All Rights Reserved.
 */
@Service("sysRolePermService")
public class SysRolePermServiceImpl implements SysRolePermService {
    @Autowired
    private SysRolePermMapper sysRolePermMapper;
    
    @Override
    public Integer insertByProperty(SysRolePerm sysRolePerm) {
        return this.sysRolePermMapper.insertByProperty(sysRolePerm);
    }

    @Override
    public Integer insertBatchByProperty(List<SysRolePerm> list) {
        return this.sysRolePermMapper.insertBatchByProperty(list);
    }

    @Override
    public Integer updateByPrimaryKey(SysRolePerm sysRolePerm) {
        return this.sysRolePermMapper.updateByPrimaryKey(sysRolePerm);
    }

    @Override
    public Integer updateBatchByPrimaryKey(List<SysRolePerm> list) {
        return this.sysRolePermMapper.updateBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByPrimaryKey(String roleId) {
        return this.sysRolePermMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public Integer deleteBatchByPrimaryKey(List<String> list) {
        return this.sysRolePermMapper.deleteBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByProperty(SysRolePerm sysRolePerm) {
        return this.sysRolePermMapper.deleteByProperty(sysRolePerm);
    }

    @Override
    public SysRolePerm selectByPrimaryKey(String roleId) {
        return this.sysRolePermMapper.selectByPrimaryKey(roleId);
    }
    
    @Override
    public List<SysRolePerm> selectByProperty(SysRolePerm sysRolePerm) {
        return this.sysRolePermMapper.selectByProperty(sysRolePerm);
    }

    @Override
    public Long countByProperty(SysRolePerm sysRolePerm) {
        return this.sysRolePermMapper.countByProperty(sysRolePerm);
    }
}