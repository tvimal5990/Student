# Student
Rest API using spring boot
This is a web project which stores the details of students using Spring Rest.

Features Included
•	A student has 3 attributes id, name and city.
•	User can add student’s details, fetch, remove and update.
•	Use this URL to fetch the details of all students - http://localhost:8080/students. Details will come in JSON format.
•	Use this URL to fetch the record for a particular student - http://localhost:8080/student/{studentID}

•	Use this URL to add a new student - http://localhost:8080/student. This is a post call. Input format will be in JSON
•	Use this URL to Update the record of an existing student - http://localhost:8080/student. This is a PUT call and input will be in JSON
 

•	Use this URL to delete the record of an existing student - http://localhost:8080/student/{studentID}. This is a DELETE call.
 

Tech/Frameworks Used
Core Java, Spring boot, Spring data JPA, MySQL
Running the Project
•	Clone the Git repository
•	Install MySQL in your local system.
•	Change the Database name and port accordingly in application.properties
•	Run main method inside StudentApplicationTests.java class
•	Then use any client (eg Postman) for making API calls

 


