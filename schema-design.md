# Smart Clinic Management System Database Design

## Doctor

| Field      | Data Type    | Constraint |
| ---------- | ------------ | ---------- |
| doctor_id  | BIGINT       | PK         |
| name       | VARCHAR(100) | NOT NULL   |
| email      | VARCHAR(100) | UNIQUE     |
| speciality | VARCHAR(100) | NOT NULL   |

## Patient

| Field      | Data Type    | Constraint |
| ---------- | ------------ | ---------- |
| patient_id | BIGINT       | PK         |
| name       | VARCHAR(100) | NOT NULL   |
| email      | VARCHAR(100) | UNIQUE     |
| phone      | VARCHAR(20)  | UNIQUE     |

## Appointment

| Field            | Data Type   | Constraint |
| ---------------- | ----------- | ---------- |
| appointment_id   | BIGINT      | PK         |
| doctor_id        | BIGINT      | FK         |
| patient_id       | BIGINT      | FK         |
| appointment_time | DATETIME    | NOT NULL   |
| status           | VARCHAR(20) | NOT NULL   |

## Prescription

| Field           | Data Type | Constraint |
| --------------- | --------- | ---------- |
| prescription_id | BIGINT    | PK         |
| appointment_id  | BIGINT    | FK         |
| medication      | TEXT      | NOT NULL   |
| notes           | TEXT      |            |

## Relationships

* Appointment.doctor_id → Doctor.doctor_id
* Appointment.patient_id → Patient.patient_id
* Prescription.appointment_id → Appointment.appointment_id
