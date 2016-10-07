package cn.com.meng.base.orm.common;

import cn.com.meng.base.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by meng on 2016/10/5.
 */
@Repository
public class UserDao extends BaseDao<User> implements IUserDao {

    public boolean auth(Map<String, Object> queryParams) {
        User user = super.getSqlSession().selectOne(this.mapperNamespace + ".auth", queryParams);
        if (null != user) {
            return true;
        } else {
            return false;
        }
    }
}
