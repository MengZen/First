package cn.com.meng.base.controller;

import cn.com.meng.base.datahelp.DataHelp;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Orion on 2016/10/1.
 */
public class RegistController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        DataHelp dh=new DataHelp();
        try {
            dh.conn();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String useraccount=request.getParameter("useraccount");
        String password=request.getParameter("password");
        String username=request.getParameter("username");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String addr=request.getParameter("addr");
        Date time = new Date();
        SimpleDateFormat insdate = new SimpleDateFormat(("yyyy-MM-dd HH:mm:ss"));
        String sql = "insert into t_sys_user(useraccount, password, username,phone, email, addr, status, insman, insdate) value('"+useraccount+"', '"+password+"', '"+username+"', '"+phone+"', '"+email+"', '"+addr+"','1','"+useraccount+"','"+insdate.format(time)+"' )";
        try {
            dh.insertdata(sql);
            dh.dbclose();
            response.sendRedirect("succeed.html");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
