package service.impl;

import .mapper.NameMapper;
import .entity.Name;
import .service.NameService;
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
@Service("nameService")
public class NameServiceImpl implements NameService {
    @Autowired
    private NameMapper nameMapper;
    
    @Override
    public Integer insertByProperty(Name name) {
        return this.nameMapper.insertByProperty(name);
    }

    @Override
    public Integer insertBatchByProperty(List<Name> list) {
        return this.nameMapper.insertBatchByProperty(list);
    }

    @Override
    public Integer updateByPrimaryKey(Name name) {
        return this.nameMapper.updateByPrimaryKey(name);
    }

    @Override
    public Integer updateBatchByPrimaryKey(List<Name> list) {
        return this.nameMapper.updateBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByPrimaryKey(Long id) {
        return this.nameMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteBatchByPrimaryKey(List<Long> list) {
        return this.nameMapper.deleteBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByProperty(Name name) {
        return this.nameMapper.deleteByProperty(name);
    }

    @Override
    public Name selectByPrimaryKey(Long id) {
        return this.nameMapper.selectByPrimaryKey(id);
    }
    
    @Override
    public List<Name> selectByProperty(Name name) {
        return this.nameMapper.selectByProperty(name);
    }

    @Override
    public Long countByProperty(Name name) {
        return this.nameMapper.countByProperty(name);
    }
}