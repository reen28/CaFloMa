# QUICKSTART GUIDE

## Preconditions

- Docker Desktop installed

## Running CaFloMa locally

### Environment variables

- `APP_PORT` specifies the port for the application container
- `DB_PORT` specifies the port for the database container
- `DB_USER` specifies the user to connect with
- `DB_PASSWORD` specifies the password for the user to connect with
- `BOOT_PROFILE_GROUP` specifies the profile group loading the specific profiles for the given environment

### Running CaFloMa for the first time

```
APP_PORT=<app-port> DB_PORT=<database-port> DB_USER=<database-user> DB_PASSWORD=<database-password> BOOT_PROFILE_GROUP=<profile> docker-compose up --build -d
```

### Running CaFloMa

```
APP_PORT=<app-port> DB_PORT=<database-port> DB_USER=<database-user> DB_PASSWORD=<database-password> BOOT_PROFILE_GROUP=<profile> docker-compose up -d
```
