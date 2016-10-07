package cn.com.meng.base.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by meng on 2016/10/5.
 */
public class User implements Serializable {
    private Integer id;
    private String useraccount;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String addr;
    private String status;
    private String insman;
    private Date insdate;

    public User() {
    }

    public User(Integer id, String useraccount, String username, String password, String phone, String email, String addr, String status, String insman, Date insdate) {
        this.id = id;
        this.useraccount = useraccount;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.addr = addr;
        this.status = status;
        this.insman = insman;
        this.insdate = insdate;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInsman() {
        return insman;
    }

    public void setInsman(String insman) {
        this.insman = insman;
    }

    public Date getInsdate() {
        return insdate;
    }

    public void setInsdate(Date insdate) {
        this.insdate = insdate;
    }
}
