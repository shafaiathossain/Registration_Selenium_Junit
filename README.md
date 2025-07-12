# 🧪 Selenium Automation Project – User Registration & DSE Data Scraper

This project is built using **Java**, **JUnit 5**, and **Selenium WebDriver** to automate:

1. ✅ **User registration testing** on a sample form (`demo.wpeverest.com`)
2. 📊 **Scraping latest share price data** from the Dhaka Stock Exchange website (`dsebd.org`) and saving it to a `.txt` file

---

## 🔧 Technologies Used

- Java 17+
- JUnit 5
- Selenium WebDriver
- ChromeDriver
- Gradle (dependency management)
- Git

## ✅ Automated Test Cases
### 1. submitForm()
- Visits the user registration form:
- https://demo.wpeverest.com/user-registration/guest-registration-form/
- Fills out the form with valid data including:
First name, last name, email, password
Gender selection
Date of birth (using datepicker logic)
Dropdowns, checkboxes
-Submits the form
-Asserts the success message:
"User successfully registered."

### 2. scrapData()
- Visits:
-https://dsebd.org/latest_share_price_scroll_by_value.php
- Scrapes all rows of the share price table
- Saves the data to a local file:
- src/test/resources/dse_data.txt
- Also prints the scraped data to the console

## Reports

- Default
  
  ![Default](https://github.com/user-attachments/assets/05aab96d-6816-46b4-9097-6416c29748fa)
- User registration
  
  ![User Registration](https://github.com/user-attachments/assets/e7e57f8a-df9e-41a5-ae02-3af70ea5419d)
- Scrap Data
  
  ![Scrap Data](https://github.com/user-attachments/assets/dadf5bc9-071f-429f-a991-a6053108d20c)

## Videos
- User Registraion

  https://drive.google.com/file/d/1d6f84BsZAMw9s2yofltudXy-GK-zgw3P/view?usp=sharing
- Scrap Data

  https://drive.google.com/file/d/1jQrCGW1wlt3VFCs1YwSZAW4c30JmX1dC/view?usp=sharing




