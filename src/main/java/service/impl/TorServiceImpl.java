package service.impl;

import .mapper.TorMapper;
import .entity.Tor;
import .service.TorService;
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
@Service("torService")
public class TorServiceImpl implements TorService {
    @Autowired
    private TorMapper torMapper;
    
    @Override
    public Integer insertByProperty(Tor tor) {
        return this.torMapper.insertByProperty(tor);
    }

    @Override
    public Integer insertBatchByProperty(List<Tor> list) {
        return this.torMapper.insertBatchByProperty(list);
    }

    @Override
    public Integer updateByPrimaryKey(Tor tor) {
        return this.torMapper.updateByPrimaryKey(tor);
    }

    @Override
    public Integer updateBatchByPrimaryKey(List<Tor> list) {
        return this.torMapper.updateBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return this.torMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteBatchByPrimaryKey(List<Integer> list) {
        return this.torMapper.deleteBatchByPrimaryKey(list);
    }

    @Override
    public Integer deleteByProperty(Tor tor) {
        return this.torMapper.deleteByProperty(tor);
    }

    @Override
    public Tor selectByPrimaryKey(Integer id) {
        return this.torMapper.selectByPrimaryKey(id);
    }
    
    @Override
    public List<Tor> selectByProperty(Tor tor) {
        return this.torMapper.selectByProperty(tor);
    }

    @Override
    public Long countByProperty(Tor tor) {
        return this.torMapper.countByProperty(tor);
    }
}