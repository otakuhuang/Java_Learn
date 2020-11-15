package chapter_20;

import java.sql.*;

import static utils.Utils.output;

public class SQLClass {

    private static Connection conn;
    private static PreparedStatement sql;
    private static ResultSet res;

    public static void connSQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            output("数据库驱动加载完成!");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?serverTimezone=GMT", "root", "password");
            output("数据库连接成功!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeSQL() {
        try {
            if (res != null) {
                res.close();
            }
            if (sql != null) {
                sql.close();
            }
            if (conn != null) {
                conn.close();
            }
            output("关闭数据库连接!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readEmp() {
        try {
            sql = conn.prepareStatement("select id, name, sex, birthday, dept from tb_emp");
            res = sql.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                String name = res.getString("name");
                String sex = res.getString("sex");
                Date birthday = res.getDate("birthday");
                String dept = res.getString("dept");
                output(id + " " + name + " " + sex + " " + birthday + " " + dept);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeSQL();
        }
    }

    public static void insertStu() {
        try {
            sql = conn.prepareStatement("insert into tb_stu value(?,?,?,?)");
            sql.setInt(1, 5);
            sql.setString(2, "李某");
            sql.setString(3, "女");
            sql.setString(4, "1999-10-20");
            int row = sql.executeUpdate();
            output("该操作更新了 " + row + " 行数据!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeSQL();
        }
    }

    public static void deleteData() {
        try {
            sql = conn.prepareStatement("delete from tb_stu where birthday < ?");
            sql.setString(1, "2010-01-01");
            int row = sql.executeUpdate();
            output("该操作更新了 " + row + " 行数据!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeSQL();
        }
    }

    public static void main(String[] args) {
        connSQL();
//        readEmp();
//        insertStu();
        deleteData();
    }
}
