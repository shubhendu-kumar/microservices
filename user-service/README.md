# user-service
Micro-service - Stores user information in H2 in-memory DB and communicate with department-service to fetch corresponding department of an User

To create a user, JSON should be:  
{  
&nbsp;&nbsp;&nbsp;&nbsp;"firstName": "Shubhendu",  
&nbsp;&nbsp;&nbsp;&nbsp;"lastName": "Paul",  
&nbsp;&nbsp;&nbsp;&nbsp;"email": "shubhendu.kumar@gmail.com",  
&nbsp;&nbsp;&nbsp;&nbsp;"departmentId": 1  
}  

POST request.