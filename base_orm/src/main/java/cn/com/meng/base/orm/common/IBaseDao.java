package cn.com.meng.base.orm.common;

import java.util.List;
import java.util.Map;

/**
 * Created by meng on 2016/10/5.
 */
public interface IBaseDao<T> {

    /**
     * 根据标记获取记录
     *
     * @param id 标记
     * @return 记录
     */
    T load(int id);

    /**
     * 获取符合查询条件的记录（精确查询）
     * <p>
     * queryParams中的每一个参数都是key/value对。
     * 如果key后面带有下横线“_”，则表示该参数是一个List<Object>。
     * 如果queryParams含有key为sort（和order）的参数，则sort（和order）用以排序。
     * 例如，queryParams值为
     * {sex:1,birthday_:[2012-01-01,2012-01-31],status_:[1,2,3],category:["cat","bird"],sort:"name",order:"asc"}，“2012-01-01”的jdbcType为DATE
     * 则构成的查询条件为：
     * where 1=1 and SEX=1 and BIRTHDAY>=2012-01-01 and BIRTHDAY<=2012-01-31 and STATUS in (1,2,3) and upper(CATEGORY) in (upper('cat'),upper('bird')) order by name asc
     * </p>
     *
     * @param queryParams 查询参数
     * @return 记录列表
     */
    List<T> find(Map<String, Object> queryParams);

    /**
     * 插入记录
     *
     * @param domain 需要插入的记录
     * @return 被插入记录的标记
     */
    int insert(T domain);

    /**
     * 更新记录
     *
     * @param domain 需要更新的记录
     * @return 被更新的记录数
     */
    int upload(T domain);

    /**
     * 删除记录
     *
     * @param id 标记
     * @return 被删除的记录数
     */
    int delete(int id);
}
