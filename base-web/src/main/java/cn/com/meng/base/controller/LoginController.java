package cn.com.meng.base.controller;

import cn.com.meng.base.datahelp.DataHelp;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Orion on 2016/10/1.
 */
public class LoginController extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        String name=request.getParameter("username");
        String password = request.getParameter("password");
        ResultSet rs =null;
        DataHelp dh = new DataHelp();
        try {
            dh.conn();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql="select * from t_sys_user where useraccount='"+name+"' and password='"+password+"'";
        try {
            rs=dh.getRS(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if(rs.next()) {
                System.out.println("登录成功");
            }else{
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
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

    }
}
