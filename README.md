<p align="center">
  <img width="200" height="200" src="images/graylog.png">
  <img width="200" height="200" src="images/spring.png">
</p>

![example workflow](https://github.com/SanoranX/spring_graylog_example/actions/workflows/maven.yml/badge.svg)

# Graylog + Spring Boot Example

This repository demonstrates a sample implementation of Spring Centralized Logging to Graylog. In this example, Graylog is run using Docker Compose. However, in production, it can be installed as a standalone application.

### How-To Run

1. Start docker-compose by running following in your terminal

```bash
docker-compose up -d
```

2. Open your browser and go to http://localhost:9000.
3. After that, add a new GELF input.
4. Finally, run the application and you will be able to see the logs in Graylog

### How it works

The implementation is straightforward. It utilizes the GLF appender to add all logs with a specific level to the GELF port of Graylog. There is no requirement to exclude the default Spring Logging, as everything works seamlessly. You can create multiple appenders for various environments such as stage, development, production, and others. If you do not wish to save your local logs in Graylog, you can create a new file named application-dev.properties and add the necessary logback configuration. After which, you can run the .jar file with the required properties file and delete all settings from the original application.properties.
