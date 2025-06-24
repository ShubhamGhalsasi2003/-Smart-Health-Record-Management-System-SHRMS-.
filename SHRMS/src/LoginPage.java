import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;

    public LoginPage() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        panel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        panel.add(usernameField);

        panel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        JButton loginBtn = new JButton("Login");
        loginBtn.addActionListener(e -> {
            String user = usernameField.getText();
            String pass = new String(passwordField.getPassword());
            if ("admin".equals(user) && "admin".equals(pass)) {
                dispose();
                new Dashboard();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials");
            }
        });
        panel.add(loginBtn);

        add(panel);
        setVisible(true);
    }
}
