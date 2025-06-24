import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame {

    public Dashboard() {
        setTitle("Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton addBtn = new JButton("Add Patient Record");
        addBtn.addActionListener(e -> new PatientForm());

        JButton viewBtn = new JButton("View Records");
        viewBtn.addActionListener(e -> new RecordViewer());

        JPanel panel = new JPanel();
        panel.add(addBtn);
        panel.add(viewBtn);

        add(panel);
        setVisible(true);
    }
}
