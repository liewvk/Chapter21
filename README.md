# Chapter21

This repository contains Java source code for Chapter21.

## Overview

A Java codebase. The repository is 100% Java according to the language composition metadata.

## Build

Use your preferred Java build tool (Maven, Gradle) or the JDK directly.

- With javac (JDK 8+):

  1. Compile all source files:
     ```sh
     mkdir -p out
     javac -d out $(find . -name "*.java")
     ```
  2. Run the application (replace `com.example.Main` with your main class):
     ```sh
     java -cp out com.example.Main
     ```

- With Maven:

  ```sh
  mvn clean package
  java -jar target/your-artifact.jar
  ```

- With Gradle:

  ```sh
  ./gradlew build
  java -jar build/libs/your-artifact.jar
  ```

## Contributing

Contributions are welcome. Please open issues or pull requests.

## License

Specify a license for this repository (e.g., MIT, Apache-2.0) by adding a LICENSE file.
