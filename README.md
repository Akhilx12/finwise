# FinWise 💳

An AI-powered digital wallet with group expense management and financial coaching.

## Tech Stack
- Java 17, Spring Boot 3.2.5
- PostgreSQL, Redis
- Apache Kafka
- OpenAI / Gemini API

## Services
| Service | Port | Description |
|---|---|---|
| api-gateway | 8080 | Entry point for all requests |
| auth-service | 8081 | Authentication & JWT |
| user-service | 8082 | User profiles |
| wallet-service | 8083 | Ledger & balances |

## Getting Started

### Prerequisites
- Java 17+
- PostgreSQL 15+
- Redis 7+
- Maven 3.8+

### Setup
1. Clone the repo
```bash
   git clone https://github.com/YOUR_USERNAME/finwise.git
```
2. Create databases
```sql
   CREATE DATABASE finwise_auth;
   CREATE DATABASE finwise_users;
   CREATE DATABASE finwise_wallet;
```
3. Create `application-local.yml` in each service's resources folder
   with your local DB credentials (see `application.yml` for required keys)

4. Run each service
```bash
   cd auth-service
   mvn spring-boot:run -Dspring-boot.run.profiles=local
```

## Team Workflow
- Never push directly to `main`
- Create a branch for each feature: `feature/your-feature-name`
- Open a Pull Request and get it reviewed before merging
