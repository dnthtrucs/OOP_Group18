package thicuoiki;

import java.sql.ResultSet;

public class AccountService {
    private final DbUtil dbUtil = DbUtil.getInstance();

    public boolean login(String username, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (ResultSet resultSet = dbUtil.executeQuery(sql, username, password)) {
            return resultSet.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    public boolean register(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }

        if (isUsernameExisted(username)) {
            throw new IllegalArgumentException("Username đã tồn tại.");
        }

        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
        return dbUtil.executeUpdate(sql, username, password) > 0;
    }

    private boolean isUsernameExisted(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        try (ResultSet resultSet = dbUtil.executeQuery(sql, username)) {
            return resultSet.next();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }
}
