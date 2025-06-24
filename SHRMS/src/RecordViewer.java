import javax.swing.*;
import java.sql.*;

public class RecordViewer extends JFrame {
    JTextArea area;

    public RecordViewer() {
        setTitle("Patient Records");
        setSize(400, 300);
        setLocationRelativeTo(null);

        area = new JTextArea();
        loadRecords();
        add(new JScrollPane(area));

        setVisible(true);
    }

    private void loadRecords() {
        try {
            Connection conn = DBConnection.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM patients");
            while (rs.next()) {
                area.append("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") +
                            ", Age: " + rs.getInt("age") + ", Diagnosis: " + rs.getString("diagnosis") + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
