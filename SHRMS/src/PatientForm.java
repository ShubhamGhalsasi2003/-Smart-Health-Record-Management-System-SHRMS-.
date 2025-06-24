import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class PatientForm extends JFrame {
    JTextField nameField, ageField, diagnosisField;

    public PatientForm() {
        setTitle("Add Patient Record");
        setSize(300, 250);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Age:"));
        ageField = new JTextField();
        panel.add(ageField);

        panel.add(new JLabel("Diagnosis:"));
        diagnosisField = new JTextField();
        panel.add(diagnosisField);

        JButton submitBtn = new JButton("Submit");
        submitBtn.addActionListener(e -> insertRecord());
        panel.add(submitBtn);

        add(panel);
        setVisible(true);
    }

    private void insertRecord() {
        try {
            Connection conn = DBConnection.getConnection();
            String query = "INSERT INTO patients (name, age, diagnosis) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, nameField.getText());
            pst.setInt(2, Integer.parseInt(ageField.getText()));
            pst.setString(3, diagnosisField.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
