package thicuoiki;

import java.util.List;
import javax.swing.JOptionPane;

public class LoginHandler {
    private List<User> registeredUsers;

    public LoginHandler(List<User> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    public void handleLogin(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên đăng nhập và mật khẩu.", "Invalidation", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean isValidUser = false;
        User loggedInUser = null;

        for (User user : registeredUsers) {
            if (user.getUsername().equals(username) && user.checkPassword(password)) {
                isValidUser = true;
                loggedInUser = user;
                break;
            }
        }

        if (isValidUser) {

            // Lưu thông tin đăng nhập vào file
//            loggedInUser.saveUserInfoToFile();

            // Mở giao diện chính
            
        } else {
            JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không chính xác.", "Invalidation", JOptionPane.ERROR_MESSAGE);
        }
    }
}
