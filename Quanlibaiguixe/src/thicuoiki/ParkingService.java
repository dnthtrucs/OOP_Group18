package thicuoiki;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ParkingService {
    private final DbUtil dbUtil = DbUtil.getInstance();

    public List<Parking> getAllParkings() {
        List<Parking> result = new ArrayList<>();
        String sql = "SELECT * FROM ParkingLots";

        try (ResultSet rs = dbUtil.executeQuery(sql)) {
            while (rs.next()) {
                Parking parking = new Parking();
                parking.setName(rs.getString("name"));
                parking.setCarId(rs.getString("car_id"));
                parking.setTimeIn(rs.getDate("time_in").toLocalDate());
                parking.setTimeOut(rs.getDate("time_out").toLocalDate());

                result.add(parking);
            }

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addParking(Parking parking) {
        String sql = "INSERT INTO ParkingLots (name, car_id, time_in, time_out) VALUES (?, ?, ?, ?)";
        try {
            dbUtil.executeUpdate(sql, parking.getName(), parking.getCarId(), parking.getTimeIn(), parking.getTimeOut());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteParking(String carId) {
        String sql = "DELETE FROM ParkingLots WHERE car_id = ?";
        try {
            dbUtil.executeUpdate(sql, carId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateParking(String carId, String name, String carIdNew, String timeIn, String timeOut) {
        String sql = "UPDATE ParkingLots SET name = ?, car_id = ?, time_in = ?, time_out = ? WHERE car_id = ?";
        try {
            dbUtil.executeUpdate(sql, name, carIdNew, timeIn, timeOut, carId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
