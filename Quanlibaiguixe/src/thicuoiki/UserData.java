
package thicuoiki;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserData implements Serializable {
    private static final String DATA_FILE_PATH = "userdata.dat";
    private List<String[]> userDataList = new ArrayList<>();

    public void addUserData(String tenChuXe, String bienSoXe, String thoiGianVao, String thoiGianRoi) {
        String[] userData = {tenChuXe, bienSoXe, thoiGianVao, thoiGianRoi};
        userDataList.add(userData);
    }

    public List<String[]> getUserDataList() {
        return userDataList;
    }

    public void saveUserDataToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_FILE_PATH))) {
            for (String[] userData : userDataList) {
                writer.write(String.join(",", userData));
                writer.newLine();
            }
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error saving data: " + e.getMessage());
        }
    }

    public void clearUserData() {
        userDataList.clear();
    }

    public void loadUserDataFromFile() {
        createDataFileIfNotExists();
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE_PATH))) {
            userDataList.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    userDataList.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createDataFileIfNotExists() {
        File file = new File(DATA_FILE_PATH);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
