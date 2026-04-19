# Schema Design

## 🟢 MySQL Database Design

### Table: Patients
| Column Name | Data Type | Constraints |
|------------|----------|-------------|
| id         | INT      | PRIMARY KEY, AUTO_INCREMENT |
| name       | VARCHAR(100) | NOT NULL |
| email      | VARCHAR(100) | UNIQUE |
| phone      | VARCHAR(15)  | NOT NULL |

---

### Table: Doctors
| Column Name | Data Type | Constraints |
|------------|----------|-------------|
| id         | INT      | PRIMARY KEY, AUTO_INCREMENT |
| name       | VARCHAR(100) | NOT NULL |
| specialty  | VARCHAR(100) | NOT NULL |
| availability | VARCHAR(50) | |

---

### Table: Appointments
| Column Name | Data Type | Constraints |
|------------|----------|-------------|
| id         | INT      | PRIMARY KEY, AUTO_INCREMENT |
| patient_id | INT      | FOREIGN KEY REFERENCES Patients(id) |
| doctor_id  | INT      | FOREIGN KEY REFERENCES Doctors(id) |
| appointment_time | DATETIME | NOT NULL |

---

### Table: Admin
| Column Name | Data Type | Constraints |
|------------|----------|-------------|
| id         | INT      | PRIMARY KEY |
| username   | VARCHAR(50) | NOT NULL |
| password   | VARCHAR(100) | NOT NULL |

---

## 🟢 MongoDB Collection Design

### Collection: prescriptions

```json
{
  "patientId": 1,
  "doctorId": 2,
  "date": "2026-04-20",
  "medications": [
    {
      "name": "Paracetamol",
      "dosage": "500mg",
      "frequency": "Twice a day"
    },
    {
      "name": "Ibuprofen",
      "dosage": "200mg",
      "frequency": "Once a day"
    }
  ],
  "notes": "Take after meals"
}
