
package thicuoiki;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DangKy extends JDialog {

    private JTextField jTextFieldNewUsername;
    private JPasswordField jPasswordFieldNew;
    private JPasswordField jPasswordFieldConfirm;
    private boolean registered;
    private User registeredUser;

    public DangKy(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    private void initComponents() {
        setTitle("Đăng ký");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel jLabelNewUsername = new JLabel("Tên đăng nhập mới:");
        JLabel jLabelNewPassword = new JLabel("Mật khẩu mới:");
        JLabel jLabelConfirmPassword = new JLabel("Nhập lại mật khẩu mới:");
        jTextFieldNewUsername = new JTextField(15);
        jPasswordFieldNew = new JPasswordField(15);
        jPasswordFieldConfirm = new JPasswordField(15);
        JButton jButtonRegister = new JButton("Đăng ký");
        JButton jButtonCancel = new JButton("Thoát");

        jButtonRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerNewUser();
            }
        });

        jButtonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNewUsername)
                                        .addComponent(jLabelNewPassword)
                                        .addComponent(jLabelConfirmPassword))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldNewUsername)
                                        .addComponent(jPasswordFieldNew)
                                        .addComponent(jPasswordFieldConfirm, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)) // Tăng kích thước của trường nhập mật khẩu
                                .addContainerGap(50, Short.MAX_VALUE)) // Điều chỉnh khoảng cách giữa các thành phần
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCancel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonRegister)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNewUsername)
                                        .addComponent(jTextFieldNewUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNewPassword)
                                        .addComponent(jPasswordFieldNew, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelConfirmPassword)
                                        .addComponent(jPasswordFieldConfirm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonRegister)
                                        .addComponent(jButtonCancel))
                                .addContainerGap())
        );

        GroupLayout mainLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
                mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
                mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    private void registerNewUser() {
        String newPassword = new String(jPasswordFieldNew.getPassword());
        String confirmNewPassword = new String(jPasswordFieldConfirm.getPassword());

        if (!newPassword.equals(confirmNewPassword)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới không khớp. Vui lòng nhập lại.");
            return;
        }

        registeredUser = new User(jTextFieldNewUsername.getText(), newPassword);

        registered = true;
        JOptionPane.showMessageDialog(this, "Đăng ký thành công. Bạn có thể đăng nhập bây giờ.");
        dispose(); 
    }
    public User getRegisteredUser() {
        return registeredUser;
    }


    public boolean isRegistered() {
        return registered;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new DangKy(new JFrame(), true).setVisible(true));
    }
}
