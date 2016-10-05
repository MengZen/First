package cn.com.meng.base.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by meng on 2016/10/5.
 */
public class Schedule implements Serializable {

    private Integer id;
    private String user;
    private Date createdate;
    private Date reminddate;
    private String info;

    public Schedule() {
    }

    public Schedule(Integer id, String user, Date createdate, Date reminddate, String info) {
        this.id = id;
        this.user = user;
        this.createdate = createdate;
        this.reminddate = reminddate;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getReminddate() {
        return reminddate;
    }

    public void setReminddate(Date reminddate) {
        this.reminddate = reminddate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
