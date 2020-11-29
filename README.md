# Student
# Rest API using spring boot
This is a web project which stores the details of students using Spring Rest.

## Features Included
•	A student has 3 attributes id, name and city.  
•	User can add student’s details, fetch, remove and update.  
•	Use this URL to fetch the details of all students - http://localhost:8080/students. Details will come in JSON format.
https://user-images.githubusercontent.com/74603090/100546045-2d7ae500-3285-11eb-95f1-5f1832fae3f1.png
•	Use this URL to fetch the record for a particular student - http://localhost:8080/student/{studentID}
https://user-images.githubusercontent.com/74603090/100546074-5307ee80-3285-11eb-8187-9b820c137fa5.png
•	Use this URL to add a new student - http://localhost:8080/student. This is a post call. Input format will be in JSON
https://user-images.githubusercontent.com/74603090/100546096-716dea00-3285-11eb-8364-76a9ab22822c.png
•	Use this URL to Update the record of an existing student - http://localhost:8080/student. This is a PUT call and input will be in JSON
 https://user-images.githubusercontent.com/74603090/100546122-92363f80-3285-11eb-90b6-5f0864a0637b.png
•	Use this URL to delete the record of an existing student - http://localhost:8080/student/{studentID}. This is a DELETE call.
 https://user-images.githubusercontent.com/74603090/100546147-b09c3b00-3285-11eb-80b7-924a730502bf.png

## Tech/Frameworks Used
Core Java, Spring boot, Spring data JPA, MySQL

## Running the Project
•	Clone the Git repository
•	Install MySQL in your local system.
•	Change the Database name and port accordingly in application.properties
•	Run main method inside StudentApplicationTests.java class
•	Then use any client (eg Postman) for making API calls

 


