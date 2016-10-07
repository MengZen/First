package cn.com.meng.base.service.common;

import cn.com.meng.base.domain.User;
import cn.com.meng.base.orm.common.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by meng on 2016/10/7.
 */
@Service
public class UserService extends BaseService<User> implements IUserService {

    @Autowired
    private IUserDao dao;


    public boolean auth(Map<String, Object> queryParams) {
        return this.dao.auth(queryParams);
    }
}
