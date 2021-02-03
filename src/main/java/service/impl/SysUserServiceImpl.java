package service.impl;

import .mapper.SysUserMapper;
import .entity.SysUser;
import .service.SysUserService;
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
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    
    @Override
    public Integer insertByProperty(SysUser sysUser) {
        return this.sysUserMapper.insertByProperty(sysUser);
    }

    @Override
    public Integer insertBatchByProperty(List<SysUser> list) {
        return this.sysUserMapper.insertBatchByProperty(list);
    }

    @Override
    public Integer updateByPrimaryKey(SysUser sysUser) {
        return this.sysUserMapper.updateByPrimaryKey(sysUser);
    }

    @Override
    public Integer updateBatchByPrimaryKey(List<SysUser> list) {
        return this.sysUserMapper.updateBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByPrimaryKey(String uid) {
        return this.sysUserMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public Integer deleteBatchByPrimaryKey(List<String> list) {
        return this.sysUserMapper.deleteBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByProperty(SysUser sysUser) {
        return this.sysUserMapper.deleteByProperty(sysUser);
    }

    @Override
    public SysUser selectByPrimaryKey(String uid) {
        return this.sysUserMapper.selectByPrimaryKey(uid);
    }
    
    @Override
    public List<SysUser> selectByProperty(SysUser sysUser) {
        return this.sysUserMapper.selectByProperty(sysUser);
    }

    @Override
    public Long countByProperty(SysUser sysUser) {
        return this.sysUserMapper.countByProperty(sysUser);
    }
}