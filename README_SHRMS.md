# 🏥 Smart Health Record Management System (SHRMS)

SHRMS is a real-time desktop-based Java application designed to digitize and manage health records of patients in clinics and hospitals. It simplifies the workflow of patient registration, record maintenance, and appointment tracking using a Java Swing interface connected to a MySQL database.

---

## 📌 Features

- 👤 Patient Registration and Record Entry
- 📋 Medical History Management
- 📅 Appointment Scheduling
- 🔐 Secure Login System for Admin/Doctors
- 📊 Dashboard to View and Search Patient Records
- 💾 MySQL Database Integration

---

## 🧰 Technologies Used

| Component      | Technology |
|----------------|------------|
| UI             | Java Swing |
| Backend Logic  | Java       |
| Database       | MySQL      |
| SQL Script     | `health_db.sql` |
| IDE            | Eclipse / IntelliJ / NetBeans |

---

## 📂 Folder Structure

```
SHRMS/
├── database/
│   └── health_db.sql           # SQL script for database schema
├── src/                        # Java source code
│   ├── DBConnection.java       # DB connection utility
│   ├── Dashboard.java          # Admin/Doctor dashboard
│   ├── LoginPage.java          # Login form
│   ├── Main.java               # Application entry point
│   ├── PatientForm.java        # Patient registration UI
│   └── RecordViewer.java       # Record viewing and search
└── README.md
```

---

## 🔧 How to Run

1. **Set Up the Database**
   - Open MySQL and run the script from `database/health_db.sql`.
   - This will create the required tables and seed initial data.

2. **Configure DB Connection**
   - Update the `DBConnection.java` file with your MySQL credentials (username, password, database name).

3. **Run the Application**
   - Compile and run `Main.java`.
   - Log in with valid credentials to access the system.

---

## 🧪 Sample Code Snippet

```java
Connection conn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/health_db", "root", "password");
```

---

## 👨‍💻 Author

**Shubham Ghalsasi**  
Final Year B.Tech – Cloud Computing  
MIT ADT University  
📫 ghalsasishubham@gmail.com

---

> 📝 This project was built for academic demonstration purposes and can be extended with features like report export, patient notifications, and multi-role authentication.
