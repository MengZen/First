package cn.com.meng.base.service.common;

import cn.com.meng.base.orm.common.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * Created by meng on 2016/10/7.
 */
public class BaseService<T> implements IBaseService<T> {

    private BaseDao<T> dao;

    public T load(int id) {
        return this.dao.load(id);
    }

    public List<T> find(Map<String, Object> queryParams) {
        return this.dao.find(queryParams);
    }

    public int insert(T domain) {
        return this.dao.insert(domain);
    }

    public int upload(T domain) {
        return this.dao.upload(domain);
    }

    public int delete(int id) {
        return this.dao.delete(id);
    }
}
