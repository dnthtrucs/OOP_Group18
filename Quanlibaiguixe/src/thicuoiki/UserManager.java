/*
package thicuoiki;
import java.util.HashMap;

public class UserManager {
    private static final HashMap<String, String> userDatabase = new HashMap<>();

    // Hàm khởi tạo dữ liệu mẫu
    static {
        userDatabase.put("admin", "admin123");
        // Thêm các tài khoản khác nếu cần
    }

    public static boolean isValidUser(String username, String password) {
        System.out.println("Checking user: " + username + ", Password: " + password);
        // Kiểm tra xem thông tin đăng nhập có khớp với dữ liệu trong cơ sở dữ liệu không
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }
}
*/