package cn.com.meng.base.service.common;

import cn.com.meng.base.domain.User;

import java.util.Map;

/**
 * Created by meng on 2016/10/7.
 */
public interface IUserService extends IBaseService<User> {

    boolean auth(Map<String, Object> queryParams);
}
