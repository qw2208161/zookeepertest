package service.impl;

import .mapper.SysUserRoleMapper;
import .entity.SysUserRole;
import .service.SysUserRoleService;
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
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    
    @Override
    public Integer insertByProperty(SysUserRole sysUserRole) {
        return this.sysUserRoleMapper.insertByProperty(sysUserRole);
    }

    @Override
    public Integer insertBatchByProperty(List<SysUserRole> list) {
        return this.sysUserRoleMapper.insertBatchByProperty(list);
    }

    @Override
    public Integer updateByPrimaryKey(SysUserRole sysUserRole) {
        return this.sysUserRoleMapper.updateByPrimaryKey(sysUserRole);
    }

    @Override
    public Integer updateBatchByPrimaryKey(List<SysUserRole> list) {
        return this.sysUserRoleMapper.updateBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByPrimaryKey(String userId) {
        return this.sysUserRoleMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public Integer deleteBatchByPrimaryKey(List<String> list) {
        return this.sysUserRoleMapper.deleteBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByProperty(SysUserRole sysUserRole) {
        return this.sysUserRoleMapper.deleteByProperty(sysUserRole);
    }

    @Override
    public SysUserRole selectByPrimaryKey(String userId) {
        return this.sysUserRoleMapper.selectByPrimaryKey(userId);
    }
    
    @Override
    public List<SysUserRole> selectByProperty(SysUserRole sysUserRole) {
        return this.sysUserRoleMapper.selectByProperty(sysUserRole);
    }

    @Override
    public Long countByProperty(SysUserRole sysUserRole) {
        return this.sysUserRoleMapper.countByProperty(sysUserRole);
    }
}