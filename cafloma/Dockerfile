ARG JAVA_VERSION=21
FROM amazoncorretto:${JAVA_VERSION} as builder

# work directory
WORKDIR /app

# copy gradle files
COPY build.gradle.kts settings.gradle.kts gradlew ./
COPY gradle gradle
COPY src src

# making gradlew executable
RUN chmod +x gradlew

# build project
RUN ./gradlew build -x test --no-daemon

# slim image version
FROM amazoncorretto:${JAVA_VERSION}

# setting up working directory
WORKDIR /app

# built jar
COPY --from=builder /app/build/libs/*.jar cafloma-application.jar

ENV SPRING_CONFIG_ADDITIONAL_LOCATION=optional:classpath:database/

# start application
ENTRYPOINT ["java", "-jar", "cafloma-application.jar"]