package cn.com.meng.base.orm.common;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by meng on 2016/10/5.
 */
public class BaseDao<T> extends SqlSessionDaoSupport implements IBaseDao<T> {

    public String mapperNamespace = this.getMapperName();


    public T load(int id) {
        return super.getSqlSession().selectOne(this.mapperNamespace + ".load", id);
    }

    public List<T> find(Map<String, Object> queryParams) {
        return super.getSqlSession().selectList(this.mapperNamespace + ".find", queryParams);
    }

    public int insert(T domain) {
        return super.getSqlSession().insert(this.mapperNamespace + ".insert", domain);
    }

    public int upload(T domain) {
        return super.getSqlSession().insert(this.mapperNamespace + ".update", domain);
    }

    public int delete(int id) {
        return super.getSqlSession().insert(this.mapperNamespace + ".delete", id);
    }

    /**
     * 利用反射获取当前类型（SqlMapper）
     *
     * @return 当前类名
     */
    private String getMapperName() {
        Class[] types = this.getClass().getInterfaces();
        for (Class type : types) {
            Class[] interfaces = type.getInterfaces();
            for (Class inf : interfaces) {
                if (inf.equals(IBaseDao.class)) {
                    return type.getName();
                }
            }
        }
        throw new IllegalStateException(this.getClass().getName() + "does not implement the interface of IDao");
    }

    @Override
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
