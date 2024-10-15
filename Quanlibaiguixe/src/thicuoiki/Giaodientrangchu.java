
package thicuoiki;

import java.awt.event.WindowEvent;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
import java.util.HashMap;
import java.util.Map;

public class Giaodientrangchu extends javax.swing.JFrame {

    private static DefaultTableModel tableModel;
    private static TableRowSorter<DefaultTableModel> sorter;
    private static UserData userData;
    private final ParkingService parkingService;

    public Giaodientrangchu() {
        parkingService = new ParkingService();

        initComponents();
        initializeTableModel();
        setupTableSorter();
        setDataToTable(parkingService.getAllParkings());

//        userData = new UserData();
//        loadUserData();
    }

    private void initializeTableModel() {

        tableModel = new DefaultTableModel();
        jTable1.setModel(tableModel);

        tableModel.addColumn("Tên chủ xe");
        tableModel.addColumn("Biển số xe");
        tableModel.addColumn("Thời gian vào bãi");
        tableModel.addColumn("Thời gian rời bãi");
    }

    private void setDataToTable(List<Parking> parkings) {
        tableModel.setRowCount(0);
        for (Parking parking : parkings) {
            tableModel.addRow(new Object[]{parking.getName(), parking.getCarId(), parking.getTimeIn(), parking.getTimeOut()});
        }
    }

    private void setupTableSorter() {
        sorter = new TableRowSorter<>(tableModel);
        jTable1.setRowSorter(sorter);

        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        int columnIndexToSort = 0;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));

        sorter.setComparator(columnIndexToSort, new Sapxep());
        sorter.setSortKeys(sortKeys);
    }

    public static void updateTable(String tenChuXe, String bienSoXe, String thoiGianVao, String thoiGianRoi) {
        tableModel.addRow(new Object[]{tenChuXe, bienSoXe, thoiGianVao, thoiGianRoi});
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton4.setText("Thống kê");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24));
        jLabel1.setText("Quản lí bãi gửi xe");

        jLabel2.setText("Tìm kiếm:");

        jButton5.setText("Xác nhận");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(195, 195, 195))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap(22, Short.MAX_VALUE)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(71, 71, 71)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                        )
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(66, 66, 66)
                                .addComponent(jButton4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        GiaodienThem giaodienThem = new GiaodienThem();
        giaodienThem.setVisible(true);
//        saveUserData();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        setDataToTable(parkingService.getAllParkings());
        String bienSoXeCanSua = JOptionPane.showInputDialog("Nhập biển số bạn muốn sửa:");

        if (bienSoXeCanSua != null && !bienSoXeCanSua.isEmpty()) {
            boolean xeDaTimThay = false;

            for (int i = 0; i < tableModel.getRowCount(); i++) {
                String bienSoXeTrongBang = (String) tableModel.getValueAt(i, 1);

                if (bienSoXeCanSua.equals(bienSoXeTrongBang)) {

                    String tenChuXe = (String) tableModel.getValueAt(i, 0);
                    LocalDate thoiGianVao = (LocalDate) tableModel.getValueAt(i, 2);
                    LocalDate thoiGianRoi = (LocalDate) tableModel.getValueAt(i, 3);

                    String newTenChuXe = JOptionPane.showInputDialog("Tên chủ xe:", tenChuXe);
                    String newThoiGianVao = JOptionPane.showInputDialog("Thời gian vào bãi:", thoiGianVao);
                    String newThoiGianRoi = JOptionPane.showInputDialog("Thời gian rời bãi:", thoiGianRoi);

                    tableModel.setValueAt(newTenChuXe, i, 0);
                    tableModel.setValueAt(newThoiGianVao, i, 2);
                    tableModel.setValueAt(newThoiGianRoi, i, 3);

                    xeDaTimThay = true;
//                    saveUserData();
                    parkingService.updateParking(bienSoXeCanSua, newTenChuXe, bienSoXeCanSua, newThoiGianVao, newThoiGianRoi);

                    JOptionPane.showMessageDialog(this, "Đã cập nhật thông tin của xe có biển số: " + bienSoXeCanSua);
                    break;
                }
            }

            if (!xeDaTimThay) {
                JOptionPane.showMessageDialog(this, "Không tồn tại xe có biển số: " + bienSoXeCanSua);
            }
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        String bienSoXeCanXoa = JOptionPane.showInputDialog("Nhập biển số xe:");
        if (bienSoXeCanXoa != null && !bienSoXeCanXoa.isEmpty()) {
            boolean xeDaXoa = false;
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                String bienSoXeTrongBang = (String) tableModel.getValueAt(i, 1);
                if (bienSoXeCanXoa.equals(bienSoXeTrongBang)) {
                    tableModel.removeRow(i);
                    xeDaXoa = true;

                    parkingService.deleteParking(bienSoXeCanXoa);
//                    saveUserData();
                    break;
                }
            }

            if (xeDaXoa) {
                JOptionPane.showMessageDialog(this, "Đã xóa dữ liệu của xe có biển số: " + bienSoXeCanXoa);
            } else {
                JOptionPane.showMessageDialog(this, "Biển số xe không tồn tại: " + bienSoXeCanXoa);
            }
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        int soLuongXeTrongBai = tableModel.getRowCount();
        int tongThuNhap = soLuongXeTrongBai * 5;

        JOptionPane.showMessageDialog(this, "Số lượng xe đã ở trong bãi: " + soLuongXeTrongBai
                + "\nTổng thu nhập: " + tongThuNhap + ".000" + " VND");

    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

        String bienSoXeCanTimKiem = jFormattedTextField1.getText();
        boolean xeDaTimThay = false;

        if (bienSoXeCanTimKiem != null && !bienSoXeCanTimKiem.isEmpty()) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                String bienSoXeTrongBang = (String) tableModel.getValueAt(i, 1);
                if (bienSoXeCanTimKiem.equals(bienSoXeTrongBang)) {

                    String tenChuXe = (String) tableModel.getValueAt(i, 0);
                    LocalDate thoiGianVao = (LocalDate) tableModel.getValueAt(i, 2);
                    LocalDate thoiGianRoi = (LocalDate) tableModel.getValueAt(i, 3);

                    JOptionPane.showMessageDialog(this, "Thông tin của xe có biển số: " + bienSoXeCanTimKiem
                            + "\nTên chủ xe: " + tenChuXe
                            + "\nThời gian vào bãi: " + thoiGianVao
                            + "\nThời gian rời bãi: " + thoiGianRoi);

                    xeDaTimThay = true;
                    break;
                }
            }

            if (!xeDaTimThay) {
                JOptionPane.showMessageDialog(this, "Không tồn tại xe có biển số: " + bienSoXeCanTimKiem);
            }
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
//        saveUserData();
        this.dispose();
        Giaodienchinh giaodienchinh = new Giaodienchinh();
        giaodienchinh.setVisible(true);
    }

    private void saveUserData() {

        userData.clearUserData();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            String tenChuXe = (String) tableModel.getValueAt(i, 0);
            String bienSoXe = (String) tableModel.getValueAt(i, 1);
            String thoiGianVao = (String) tableModel.getValueAt(i, 2);
            String thoiGianRoi = (String) tableModel.getValueAt(i, 3);
            userData.addUserData(tenChuXe, bienSoXe, thoiGianVao, thoiGianRoi);
        }

        userData.saveUserDataToFile();
        System.out.println("Du lieu da luu thanh cong.");
    }

    private void loadUserData() {

        userData.loadUserDataFromFile();

        tableModel.setRowCount(0);

        List<String[]> userDataList = userData.getUserDataList();
        for (String[] userData : userDataList) {
            updateTable(userData[0], userData[1], userData[2], userData[3]);
        }
        System.out.println("Du lieu duoc tai thanh cong.");
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Giaodientrangchu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giaodientrangchu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giaodientrangchu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giaodientrangchu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Giaodientrangchu giaodientrangchu = new Giaodientrangchu();
                giaodientrangchu.setVisible(true);
                giaodientrangchu.setLocationRelativeTo(null);
                giaodientrangchu.loadUserData();
            }
        });
    }

    public void windowClosing(WindowEvent e) {
        saveUserData();
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}
