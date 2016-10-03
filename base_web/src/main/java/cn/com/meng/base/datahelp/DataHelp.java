package cn.com.meng.base.datahelp;

import java.sql.*;

public class DataHelp {

    Connection conn = null;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://192.168.2.107:3306/first?characterEncoding=utf8&useSSL=false";
    private String username = "root";
    private String password = "";

    public void conn() throws ClassNotFoundException, SQLException {

        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, password);
    }

    public ResultSet getRS(String sql) throws SQLException {
        Statement s = conn.createStatement();
        return s.executeQuery(sql);
    }

    public void insertdata(String sql) throws SQLException {
        Statement s = conn.createStatement();
        s.execute(sql);
    }

    public void dbclose() throws SQLException {
        conn.close();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
}
