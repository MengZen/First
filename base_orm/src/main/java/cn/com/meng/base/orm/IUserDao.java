package cn.com.meng.base.orm;

import cn.com.meng.base.domain.User;

import java.util.Map;

/**
 * Created by meng on 2016/10/5.
 */
public interface IUserDao {

    User load(Map<String, Object> queryParama);
}
