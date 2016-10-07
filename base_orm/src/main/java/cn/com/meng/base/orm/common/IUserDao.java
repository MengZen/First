package cn.com.meng.base.orm.common;

import cn.com.meng.base.domain.User;

import java.util.Map;

/**
 * Created by meng on 2016/10/5.
 */
public interface IUserDao extends IBaseDao<User>{

    boolean auth(Map<String,Object> queryParams);
}
