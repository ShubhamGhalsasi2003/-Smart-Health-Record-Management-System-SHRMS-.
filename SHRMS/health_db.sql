CREATE DATABASE IF NOT EXISTS health_db;
USE health_db;

CREATE TABLE IF NOT EXISTS patients (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    diagnosis TEXT
);
