Структура проекта

C:/Work/Java/Task_Cloud/
├── config-server/           # ✅ Config Server приложение
│   ├── src/main/java/.../ConfigServerApplication.java (@EnableConfigServer)
│   ├── pom.xml (spring-cloud-config-server)
│   └── application.properties (подключение к Git)
│
├── config-repo/             # ✅ Git репозиторий конфигурации
│   ├── my-client-app.yml    # ✅ Конфигурация приложения
│   ├── my-client-app-dev.yml
│   ├── my-client-app-prod.yml
│   └── application.yml
│
└── config-client/           # ✅ Config Client приложение
    ├── src/main/java/.../ConfigClientApplication.java
    ├── src/main/java/.../controller/ConfigController.java (@Value)
    ├── pom.xml (spring-cloud-starter-config, spring-boot-starter-web)
    └── bootstrap.yml (подключение к configserver:http://localhost:8888)

    Config Server: http://localhost:8888
    Config Client: http://localhost:8081
    Получение конфигурации: http://localhost:8081/config → показывает значение из Config Server
