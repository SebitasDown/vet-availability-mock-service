# Vet Availability Mock Service

[![Leer en Español](https://img.shields.io/badge/Lang-Español-blue)](README.es.md)

A mock microservice for checking veterinarian availability. This service is part of the VetTrack system.

## 🛠 Tech Stack

- **Java**: 21
- **Framework**: Spring Boot 4.0.0
- **Build Tool**: Maven
- **Dependencies**: Lombok, Spring Web

## 🚀 Getting Started

### Prerequisites

- Java 21 installed.
- Maven (optional, wrapper included).

### Running the Application

You can run the application using the Maven wrapper:

```bash
./mvnw spring-boot:run
```

The application will start on port `8080` (default).

## 🔌 API Usage

### Check Availability

Checks if a veterinarian is available at a specific date and time.

- **URL**: `/availability`
- **Method**: `POST`
- **Content-Type**: `application/json`

#### Request Body

```json
{
  "veterinarianId": 123,
  "date": "2023-10-27",
  "hour": "10:00"
}
```

| Field | Type | Description |
| :--- | :--- | :--- |
| `veterinarianId` | `number` | The ID of the veterinarian. |
| `date` | `string` | The date to check (e.g., "YYYY-MM-DD"). |
| `hour` | `string` | The time to check (e.g., "HH:MM"). |

#### Response

**Available:**

```json
{
  "veterinarianId": 123,
  "available": true,
  "reason": "Disponible"
}
```

**Not Available:**

```json
{
  "veterinarianId": 123,
  "available": false,
  "reason": "Agenda ocupada"
}
```

## ℹ️ Logic

This is a **mock service**. The availability is determined deterministically based on the hash of the input parameters (`veterinarianId`, `date`, `hour`). If the hash is even, it returns `true` (Available); otherwise, it returns `false`.
