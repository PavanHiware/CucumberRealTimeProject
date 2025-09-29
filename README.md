# 🌐 Cucumber Real-Time Project – Automation Testing Framework

This repository contains a **real-time automation testing framework** built using **Selenium WebDriver, Java, Cucumber (BDD), and TestNG**.
It demonstrates a **hybrid framework** with **Page Object Model (POM)** design, reusable utilities, and feature-driven test scenarios.

---

## 📂 Project Structure

```
projectDetails/
 ├── src/test/java
 │   ├── StepDefinitionsCucumberProject/
 │   │    ├── HomePage_registration.java
 │   │    ├── Hooks.java
 │   │    ├── TC_LF_01.java
 │   │    ├── resetPassword_forgetPassword.java
 │   │    ├── searchFunction.java
 │   │
 │   ├── cucumberOption/
 │   │
 │   ├── features/
 │   │    ├── ForgotPassword.feature
 │   │    ├── LoginFunction.feature
 │   │    ├── RegistrationFunction.feature
 │   │    ├── Search.feature
 │   │
 │   ├── pageObjects/
 │   │
 │   ├── utils/
 │   │
 │   ├── resources/
 │
 ├── pom.xml
```

---

## ✨ Key Features

* ✅ **BDD with Cucumber** – easy-to-understand feature files written in Gherkin.
* ✅ **Page Object Model (POM)** – organized code for better reusability.
* ✅ **Hooks** – setup and teardown for pre/post execution steps.
* ✅ **TestNG** – parallel execution and detailed test reports.
* ✅ **Reusable Utilities** – to handle drivers, waits, and common actions.
* ✅ **Modular Test Cases** for:

  * Login
  * Registration
  * Forgot Password
  * Search Functionality

---

## 🛠️ Tech Stack

* **Language**: Java
* **Automation Tool**: Selenium WebDriver
* **BDD Tool**: Cucumber
* **Test Runner**: TestNG
* **Build Tool**: Maven
* **Version Control**: Git/GitHub

---

## ▶️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/PavanHiware/CucumberRealTimeProject.git
   ```
2. Navigate to project folder:

   ```bash
   cd CucumberRealTimeProject/projectDetails
   ```
3. Install dependencies:

   ```bash
   mvn clean install
   ```
4. Run tests:

   ```bash
   mvn test
   ```

---

## 📊 Reports

* **Cucumber HTML Reports** available under `/target/cucumber-reports`
* **TestNG Reports** generated in `/test-output`

---

## 🤝 Contribution

Contributions are welcome!
If you’d like to improve test coverage or add new features, fork the repo and submit a PR.

---

## 👨‍💻 Author

**Pavan Hiware**
Automation Test Engineer | 3+ Years Experience

* 🔗 [LinkedIn](https://www.linkedin.com/in/pavan-hiware/)
* 💻 [GitHub](https://github.com/PavanHiware)

---
