package service.impl;

import .mapper.SysRoleMapper;
import .entity.SysRole;
import .service.SysRoleService;
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
@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;
    
    @Override
    public Integer insertByProperty(SysRole sysRole) {
        return this.sysRoleMapper.insertByProperty(sysRole);
    }

    @Override
    public Integer insertBatchByProperty(List<SysRole> list) {
        return this.sysRoleMapper.insertBatchByProperty(list);
    }

    @Override
    public Integer updateByPrimaryKey(SysRole sysRole) {
        return this.sysRoleMapper.updateByPrimaryKey(sysRole);
    }

    @Override
    public Integer updateBatchByPrimaryKey(List<SysRole> list) {
        return this.sysRoleMapper.updateBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByPrimaryKey(String rid) {
        return this.sysRoleMapper.deleteByPrimaryKey(rid);
    }

    @Override
    public Integer deleteBatchByPrimaryKey(List<String> list) {
        return this.sysRoleMapper.deleteBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByProperty(SysRole sysRole) {
        return this.sysRoleMapper.deleteByProperty(sysRole);
    }

    @Override
    public SysRole selectByPrimaryKey(String rid) {
        return this.sysRoleMapper.selectByPrimaryKey(rid);
    }
    
    @Override
    public List<SysRole> selectByProperty(SysRole sysRole) {
        return this.sysRoleMapper.selectByProperty(sysRole);
    }

    @Override
    public Long countByProperty(SysRole sysRole) {
        return this.sysRoleMapper.countByProperty(sysRole);
    }
}