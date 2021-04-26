package library;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookManager {
    private static final MysqlDataSource mysqlDataSource;

    static {
        mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        // 这里改成你们的 MySQL 密码
        mysqlDataSource.setPassword("4399wdxl");
        // 这里改成你们需要的默认数据库
        mysqlDataSource.setDatabaseName("library");
        // 额外添加一些属性
        mysqlDataSource.setCharacterEncoding("utf8");
        mysqlDataSource.setServerTimezone("Asia/Shanghai");
        mysqlDataSource.setUseSSL(false);
    }

    public static Connection getConnection() throws SQLException {
        return mysqlDataSource.getConnection();
    }

    // 1. 老师：上架图书
    public static void insertBook(Connection c, int isbn, String name, int total, String publishedAt) throws SQLException {
        String sql = "INSERT INTO books (isbn, name, stock, total, published_at) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement s = c.prepareStatement(sql)) {
            s.setInt(1, isbn);
            s.setString(2, name);
            s.setInt(3, total);
            s.setInt(4, total);
            s.setString(5, publishedAt);

            s.executeUpdate();
        }
    }
    // 2. 老师：下架图书
    public static void deleteBookByBid(Connection c, int bid) throws SQLException {
         String sql = "DELETE FROM books WHERE isbn = ?";
         try(PreparedStatement s = c.prepareStatement(sql)){
         s.setInt(1,bid);
         s.executeUpdate();
         }
    }

    public static void deleteBookByISBN(Connection c, int isbn) {

    }
    // 3. 学生：借书
    // 4. 学生：还书
    // 5. 学生：根据书名模糊查询
    // 6. 学生：查看自己的借阅记录
    // 7. 老师：录入学生信息
    public static void insertStudent(Connection c, int sn, String name) throws SQLException {
        String sql = "INSERT INTO students (sn, name) VALUES (?, ?)";

//        PreparedStatement s = null;
//        try {
//            s = c.prepareStatement(sql);
//        } finally {
//            if (s != null) {
//                s.close();
//            }
//        }

        // try - with - resource
        // PreparedStatement 类型实现了 AutoClosable 接口才支持
        try (PreparedStatement s = c.prepareStatement(sql)) {
            s.setInt(1, sn);
            s.setString(2, name);

            s.executeUpdate();
        }   // 自动调用 s.close()
    }

    public static void main(String[] args) throws SQLException {
        try (Connection c = getConnection()) {
//            insertStudent(c, 20210410, "张三");
//            insertStudent(c, 20210411, "李四");
//            insertStudent(c, 20210412, "王五");
//            insertStudent(c, 20210413, "赵六");
//            insertStudent(c, 20210414, "吴七");

//            insertBook(c, 19930528, "MySQL的基本使用", 50, "1993-05-28");
//            insertBook(c, 19930527, "MySQL的哲学问题", 30, "1992-05-28");
//            insertBook(c, 19930526, "学Java的痛苦经历", 15, "1983-05-28");
//            insertBook(c, 19930525, "今日头条offer，你也行", 40, "1893-05-28");
//            insertBook(c, 19930524, "没有工作的日子很痛苦", 10, "2093-05-28");
        }
    }
}
