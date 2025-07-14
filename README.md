# CountryManager_JPA

A simple Java console application that performs CRUD operations on `countries` and `regions` tables using **Hibernate with JPA (Java Persistence API)**.

---

## 🧰 Technologies Used
- Java  
- Hibernate (JPA)  
- PostgreSQL  
- Maven  

---

## ✨ Features

### ✅ JPA Integration
Uses Hibernate with JPA for clean and object-oriented database interaction.

### 📌 CRUD Operations for `regions` Table
- Create a new region  
- View all regions  
- Update an existing region name  
- Delete a region by ID  

### 🌍 CRUD Operations for `countries` Table
- Insert a new country with region reference  
- View all countries  
- Update country name  
- Delete a country by country ID  

---

## 🗂️ Project Structure
```
CountryCRUD_JPA
├── src/
│     ├── entity/
│     │     ├── CountryEntity.java
│     │     └── RegionEntity.java
│     │
│     ├── service/
│     │    ├── CountryService.java
│     │    └── RegionService.java
│     │
│     └── app/
│         ├── HibernateUtil.java
│         └── Main.java
│   
├── resources/ 
│       └── META-INF/
│             └── persistence.xml
└── pom.xml
```
---

📦 Maven Dependencies
Below are the dependencies required in your pom.xml:
```
<dependencies>
    <!-- Hibernate Core -->
    <dependency>
        <groupId>org.hibernate.orm</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>7.0.5.Final</version>
    </dependency>

    <!-- PostgreSQL JDBC Driver -->
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.7.7</version>
    </dependency>

    <!-- Jakarta Persistence API -->
    <dependency>
        <groupId>jakarta.persistence</groupId>
        <artifactId>jakarta.persistence-api</artifactId>
        <version>3.2.0</version>
    </dependency>

    <!-- Jakarta Transaction API -->
    <dependency>
        <groupId>jakarta.transaction</groupId>
        <artifactId>jakarta.transaction-api</artifactId>
        <version>2.0.1</version>
    </dependency>
</dependencies>

```
---
🖼️ Screenshot

<img width="517" height="230" alt="Screenshot 2025-07-14 161150" src="https://github.com/user-attachments/assets/ff086fa5-454f-4aca-afa1-c02a456e2960" />

---
📌 Contact Details

 -Name : Rohit Jagdale

 -Email : rohitjagdale0606@gmail.com
