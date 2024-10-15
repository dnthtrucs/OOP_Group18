package thicuoiki;

import java.sql.*;

public class DbUtil {
    private static DbUtil instance;

    private static final  String jdbcUrl = "jdbc:mysql://localhost:3306/parking_lot";
    private static final  String username = "root";
    private static final  String password = "csdl2024";

    private Connection connection;

    private DbUtil() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbUtil getInstance() {
        if (instance == null) {
            instance = new DbUtil();
        }
        return instance;
    }

    public ResultSet executeQuery(String sql, Object... parameters) {
        try {
            PreparedStatement preparedStatement = createPreparedStatement(sql, parameters);
            return preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int executeUpdate(String sql, Object... parameters) {
        try {
            PreparedStatement preparedStatement = createPreparedStatement(sql, parameters);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private PreparedStatement createPreparedStatement(String sql, Object... parameters) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < parameters.length; i++) {
            preparedStatement.setObject(i + 1, parameters[i]);
        }

        return preparedStatement;
    }
}
