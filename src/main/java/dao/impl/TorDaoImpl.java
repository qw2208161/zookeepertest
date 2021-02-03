package .dao.impl;

import .dao.TorDao;
import .model.Tor;
import com.ucarinc.framework.autoconfigure.ubatis.dao.BaseUbatisDaoImpl;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据接口实现
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:03:37
 * @copyright www.ucarinc.com All Rights Reserved.
 */
@Repository
public class TorDaoImpl extends BaseUbatisDaoImpl implements TorDao {
    private static final String NAMESPACE = ".dao.TorDao.";
    
    @Override
    public Integer insertByProperty(Tor tor) {
        return (Integer) this.insert(NAMESPACE + "insertByProperty", tor);
    }

    @Override
    public Integer updateByPrimaryKey(Tor tor) {
        return this.update(NAMESPACE + "updateByPrimaryKey", tor);
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        return this.deleteObject(NAMESPACE + "deleteByPrimaryKey", id);
    }

    @Override
    public Integer deleteByProperty(Tor tor) {
        return this.deleteObject(NAMESPACE + "deleteByProperty", tor);
    }

    @Override
    public Tor selectByPrimaryKey(Integer id) {
        return (Tor) this.queryForObject(NAMESPACE + "selectByPrimaryKey", id);
    }
    
    @Override
    public List<Tor> selectByProperty(Tor tor) {
        return this.queryForList(NAMESPACE + "selectByProperty", tor);
    }

    @Override
    public Long countByProperty(Tor tor) {
        return (Long) this.queryForObject(NAMESPACE + "countByProperty", tor);
    }

}