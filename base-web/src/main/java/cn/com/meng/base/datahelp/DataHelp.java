package cn.com.meng.base.datahelp;

import java.sql.*;

public class DataHelp {
	Connection conn = null;
	public void conn() throws ClassNotFoundException,SQLException{
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://127.0.0.1:3306/first?characterEncoding=utf8&useSSL=false";
		String username = "root";
		String password = "";
		Class.forName(driver);
		conn = DriverManager.getConnection(url, username, password);
	}

	public ResultSet getRS(String sql) throws SQLException{
		Statement s=conn.createStatement();
		return s.executeQuery(sql);
	}
	public void insertdata(String sql) throws SQLException {
        Statement s =conn.createStatement();
        s.execute(sql);
    }
    public void dbclose() throws SQLException {
        conn.close();
    }
}
