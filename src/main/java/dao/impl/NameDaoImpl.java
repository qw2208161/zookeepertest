package .dao.impl;

import .dao.NameDao;
import .model.Name;
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
public class NameDaoImpl extends BaseUbatisDaoImpl implements NameDao {
    private static final String NAMESPACE = ".dao.NameDao.";
    
    @Override
    public Integer insertByProperty(Name name) {
        return (Integer) this.insert(NAMESPACE + "insertByProperty", name);
    }

    @Override
    public Integer updateByPrimaryKey(Name name) {
        return this.update(NAMESPACE + "updateByPrimaryKey", name);
    }

    @Override
    public Integer deleteByPrimaryKey(Long id) {
        return this.deleteObject(NAMESPACE + "deleteByPrimaryKey", id);
    }

    @Override
    public Integer deleteByProperty(Name name) {
        return this.deleteObject(NAMESPACE + "deleteByProperty", name);
    }

    @Override
    public Name selectByPrimaryKey(Long id) {
        return (Name) this.queryForObject(NAMESPACE + "selectByPrimaryKey", id);
    }
    
    @Override
    public List<Name> selectByProperty(Name name) {
        return this.queryForList(NAMESPACE + "selectByProperty", name);
    }

    @Override
    public Long countByProperty(Name name) {
        return (Long) this.queryForObject(NAMESPACE + "countByProperty", name);
    }

}