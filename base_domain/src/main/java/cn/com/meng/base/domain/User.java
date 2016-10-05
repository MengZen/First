package cn.com.meng.base.domain;

import java.io.Serializable;

/**
 * Created by meng on 2016/10/5.
 */
public class User implements Serializable {
    private Integer id;
    private String useraccount;
    private String password;

    public User() {
    }

    public User(Integer id, String useraccount, String password) {
        this.id = id;
        this.useraccount = useraccount;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
