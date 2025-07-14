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
CountryManager_JPA
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
📦Persistence.xml
```
 <persistence-unit name="myPersistence" transaction-type="RESOURCE_LOCAL">
        
        <class>entity.RegionEntity</class>
        <class>entity.CountryEntity</class>

        <properties>
            <property name="jakarta.persistence.jdbc.driver" value="org.postgresql.Driver"/>
            
            <property name="jakarta.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/countryManager"/>
            
            <property name="jakarta.persistence.jdbc.user" value="postgres"/>
            
            <property name="jakarta.persistence.jdbc.password" value="123"/>
            
            <property name="hibernate.dialect" value="org.hibernate.dialect.PostgreSQLDialect"/>
            
            <property name="hibernate.show_sql" value="false"/>
            
            <property name="hibernate.format_sql" value="false"/>

            <property name="jakarta.persistence.schema-generation.database.action" value="update"/>
        </properties>
    </persistence-unit>
```
---
🖼️ Screenshot

<img width="514" height="196" alt="Screenshot 2025-07-14 161150" src="https://github.com/user-attachments/assets/7892a904-63be-4738-a51d-0fa5c0c0065e" />


---
📌 Contact Details

 -Name : Rohit Jagdale

 -Email : rohitjagdale0606@gmail.com
