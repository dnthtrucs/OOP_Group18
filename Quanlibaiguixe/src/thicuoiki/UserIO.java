
package thicuoiki;
import java.io.*;

public class UserIO {
    public static void saveUser(User user, String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static User loadUser(String filename) {
        User user = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            user = (User) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }
}
