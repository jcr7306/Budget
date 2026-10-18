# Spring Boot 50/30/20 Budgeting App

## Overview
This is a web application built with Java, Spring Boot, and JSP. It calculates a personal budget using the 50/30/20 rule (50% Needs, 30% Wants, 20% Savings).

## Features
- Implements an Interface (`BudgetCalculator`) and an Enum (`ExpenseCategory`).
- Contains 5 unique classes separating business logic, models, controllers, and file I/O.
- Provides a Graphical User Interface using JSP.
- Saves each user's data uniquely to a local `.txt` file named after their username.

## How to Use
1. Ensure you have Maven and Java installed.
2. Navigate to the project root directory.
3. Run the application using: `mvn spring-boot:run`
4. Open a web browser and navigate to `http://localhost:8080`
5. Enter a username and monthly income. The app will display your budget breakdown and save the data to a local text file.
