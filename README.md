# LeaveManagementApplication
leave management system using Java Spring Boot and microservices with in-memory storage.
2 microservices 1 for Employee (8081 Port) and 1 for Leave services (8080 Port)
----------------------------------------
Server started for Employee service
---------------------------------------
![image](https://github.com/user-attachments/assets/e71ee188-df8d-460b-b3d5-65cfefd9aba6)

--------------------------------------
Server started for Leave service
--------------------------------------
![image](https://github.com/user-attachments/assets/c445e632-1bab-4d3b-ad3d-6443f6708cfc)
--------------------------------------------
***********  CRUD FOR EMPLOYEE ************
--------------------------------------------
API For Create : http://localhost:8081/employees/add

![image](https://github.com/user-attachments/assets/5c107920-0d0d-450f-b8ef-783be36f06d8)

API For Get/Read : http://localhost:8081/employees

![image](https://github.com/user-attachments/assets/bc991f54-5428-42d5-9ed4-301de1bfc989)

API for Delete :  http://localhost:8081/employees/{Id}

![image](https://github.com/user-attachments/assets/3ed97536-c845-4261-87f5-fcd44e7acc55)

API for Get Employee By Id: http://localhost:8081/employees/{Id}

![image](https://github.com/user-attachments/assets/92bdcb21-bfa4-4a34-925e-d83a4b774413)

-------------------------------------------
**********  CRUD FOR LEAVE ***********
-------------------------------------------
API for Apply/Create Leave : http://localhost:8080/leaves/1/apply

![image](https://github.com/user-attachments/assets/62fd0f95-33e9-4aaa-a88d-e81a6c4bd73d)

API for Delete Leave : http://localhost:8080/leaves/1

![image](https://github.com/user-attachments/assets/d1a3e845-72a9-4bf6-8673-556d44541fbf)














