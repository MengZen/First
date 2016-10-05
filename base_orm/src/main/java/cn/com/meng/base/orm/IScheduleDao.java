package cn.com.meng.base.orm;

import cn.com.meng.base.domain.Schedule;

/**
 * Created by meng on 2016/10/5.
 */
public interface IScheduleDao {

    Schedule load(Integer id);

    Integer count();
}
