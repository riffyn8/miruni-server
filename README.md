# 🐢 미룬이 (Miruni) - Server

> 개인용 AI 일정 관리 앱 **미룬이**의 백엔드 서버입니다.

---

## 소개

미룬이는 할일 관리, 프로젝트 트래킹, 가계부, 마크다운 노트 기능을 제공하고  
AI 비서가 목표를 분석해 주간/일간 계획을 자동으로 생성해주는 개인용 앱입니다.

> 🚧 현재 개발 중입니다.

---

## 기술 스택

| 구분 | 기술 |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot 4.0.5 |
| Database | PostgreSQL 16 |
| Build | Gradle - Kotlin |
| Auth | Spring Security + JWT |

---

## 관련 레포

| 레포 | 설명 |
|---|---|
| [miruni-app]() | Expo (React Native) 프론트엔드 |
| [miruni-devlog](https://github.com/riffyn8/miruni-devlog) | 개발 일지 |

---

## 시작하기

### 사전 요구사항
- Java 21
- Docker Desktop

### 실행

```bash
# PostgreSQL 실행
docker-compose up -d

# 서버 실행
./gradlew bootRun
```

### 환경변수 설정

루트에 `.env` 파일 생성:

```
DB_URL=jdbc:postgresql://localhost:5432/miruni
DB_USERNAME=miruni
DB_PASSWORD=your_password
```
