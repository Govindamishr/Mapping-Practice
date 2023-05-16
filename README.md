# Mapping-Practice

:house: **Mapping**

### ***Framework***
---------
- spring boot

-------------

### ***Project management tool***
-------
- Maven


-----------------
### ***DataBase***
****************
- MySql
****************

### **use of dependency**
-----
- <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
      </dependency>
- <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-web</artifactId>
     </dependency>

- <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-devtools</artifactId>
	<scope>runtime</scope>
	<optional>true</optional>
	</dependency>
- <dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.0.33</version>
 </dependency>

- <dependency>
       <groupId>org.projectlombok</groupId>
       <artifactId>lombok</artifactId>
       <optional>true</optional>
	</dependency>
- <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-test</artifactId>
     <scope>test</scope>
     </dependency>
<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation -->
- <dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-validation</artifactId>
	<version>3.0.6</version>
	</dependency>





--------


-------------


### **Run tests**

------

⭕ postman 

:globe_with_meridians: chrome browser

********

### **Data structure And programming language**

-----

 - core java
 
 --------

  :point_down: **Summary**
*****
The portal is designed to handle various types of relationships (one-to-one, one-to-many, many-to-one, and many-to-many) between four models: Student, Laptop, Course, and Book. Each model has specific attributes and associations as follows:

Student:

Attributes: ID, name, age, phoneNumber, branch, department.
Relationship: One-to-one with Address model (via address field).
Laptop:

Attributes: ID, name, brand, price.
Relationship: One-to-one with Student model (via student field).
Course:

Attributes: ID, title, description, duration.
Relationship: Many-to-many with Student model (via studentList field).
Book:

Attributes: ID, title, author, description, price.
Relationship: Many-to-one with Student model (via student field).
Embedded Model:

Address:
Attributes: addressId, landmark, zipcode, district, state, country.
CRUD Operations:

Student:

Create: Create a new student record with the provided attributes and associate it with an address.
Read: Retrieve student details by ID, including the associated address.
Update: Update student attributes and address information.
Delete: Remove a student record and its associated address from the system.
Laptop:

Create: Create a new laptop record with the provided attributes and associate it with a student.
Read: Retrieve laptop details by ID, including the associated student.
Update: Update laptop attributes and the associated student information.
Delete: Remove a laptop record and its association with the student.
Course:

Create: Create a new course record with the provided attributes and associate it with one or multiple students.
Read: Retrieve course details by ID, including the list of associated students.
Update: Update course attributes and the list of associated students.
Delete: Remove a course record and its associations with students.
Book:

Create: Create a new book record with the provided attributes and associate it with a student.
Read: Retrieve book details by ID, including the associated student.
Update: Update book attributes and the associated student information.
Delete: Remove a book record and its association with the student.
The portal provides a comprehensive system to manage the relationships and perform CRUD operations on the Student, Laptop, Course, and Book models, facilitating efficient data management and retrieval.
*****

### **Show your Support** 
****
:star: Thankyou 

****
