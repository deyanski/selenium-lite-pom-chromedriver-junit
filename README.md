
# selenium-lite-pom-chromedriver-junit

A minimal Selenium + Java + Maven + **JUnit 5** project with **WebDriverManager** to auto-manage **ChromeDriver**. Headless by default for CI environments.

## Run locally
```bash
mvn clean test           # headless by default
mvn clean test -Dheadless=false   # run headed
```

## Project structure
```
├─ pom.xml
├─ README.md
└─ src/test/java/demo/
   ├─ BaseTest.java
   ├─ GoogleTitleTest.java
   └─ SwagLabsLoginTest.java
```

## GitHub Actions
This repo includes a workflow at `.github/workflows/ci.yml` that installs Java and Chrome and then runs the tests on Ubuntu runners. It uses `actions/setup-java` and `browser-actions/setup-chrome`.
