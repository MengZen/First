package cn.com.meng.base.controller;

import cn.com.meng.base.datahelp.DataHelp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Orion on 2016/10/1.
 */
@Controller("management.loginController")
@RequestMapping("/account")
public class LoginController {

    @RequestMapping(value = "")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    protected String login(@RequestParam("username") String username, @RequestParam("password") String password) throws javax.servlet.ServletException, java.io.IOException {
//        String name = request.getParameter("username");
//        String password = request.getParameter("password");
        ResultSet rs = null;
        DataHelp dh = new DataHelp();
        try {
            dh.conn();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql = "select * from t_sys_user where useraccount='" + username + "' and password='" + password + "'";
        try {
            rs = dh.getRS(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (rs.next()) {
                System.out.println("登录成功");
            } else {
                System.out.println("请输入正确的帐号密码");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            dh.dbclose();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "/succeed";
    }

}
