# Servicio Mock de Disponibilidad Veterinaria

[![Read in English](https://img.shields.io/badge/Lang-English-red)](README.md)

Un microservicio simulado (mock) para verificar la disponibilidad de veterinarios. Este servicio es parte del sistema VetTrack.

## 🛠 Tecnologías

- **Java**: 21
- **Framework**: Spring Boot 4.0.0
- **Herramienta de Construcción**: Maven
- **Dependencias**: Lombok, Spring Web

## 🚀 Comenzando

### Prerrequisitos

- Java 21 instalado.
- Maven (opcional, se incluye el wrapper).

### Ejecutando la Aplicación

Puedes ejecutar la aplicación usando el wrapper de Maven:

```bash
./mvnw spring-boot:run
```

La aplicación iniciará en el puerto `8080` (por defecto).

## 🔌 Uso de la API

### Verificar Disponibilidad

Verifica si un veterinario está disponible en una fecha y hora específicas.

- **URL**: `/availability`
- **Método**: `POST`
- **Content-Type**: `application/json`

#### Cuerpo de la Solicitud (Request Body)

```json
{
  "veterinarianId": 123,
  "date": "2023-10-27",
  "hour": "10:00"
}
```

| Campo | Tipo | Descripción |
| :--- | :--- | :--- |
| `veterinarianId` | `number` | El ID del veterinario. |
| `date` | `string` | La fecha a verificar (ej. "YYYY-MM-DD"). |
| `hour` | `string` | La hora a verificar (ej. "HH:MM"). |

#### Respuesta

**Disponible:**

```json
{
  "veterinarianId": 123,
  "available": true,
  "reason": "Disponible"
}
```

**No Disponible:**

```json
{
  "veterinarianId": 123,
  "available": false,
  "reason": "Agenda ocupada"
}
```

## ℹ️ Lógica

Este es un **servicio mock**. La disponibilidad se determina de manera determinista basada en el hash de los parámetros de entrada (`veterinarianId`, `date`, `hour`). Si el hash es par, retorna `true` (Disponible); de lo contrario, retorna `false`.
