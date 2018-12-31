# ******* MACk AIR Cargo System *******

*This API is a maven based spring restfull API. In this current API is not using a database. It's using some dummy data.

*You have to have tomcat server to run this and JAVA 1.8.

*From using this API user will able to do
    1) Create a Employee 
    2) Retrieve Single Employee
    3) Retrieve All Users
    4) Update a Employee
    5) Delete a Employee
    6) Delete All Employees
    
* If user want to add  more controllers add controllers to the " /MackAirCargoSystem/src/main/java/com/revport/controller/EmployeeController.java "

*User can add there respective databases to the dao layer

*If user want to add more properties to the Employee add them to the " /home/sachini/Desktop/cas/MackAirCargoSystem/src/main/java/com/revport/model/ Employee.java "

*To add jsp pages use "/home/sachini/Desktop/cas/MackAirCargoSystem/src/main/webapp/WEB-INF/views"

** Use postman to check the status.

ex: 
veiw employees: http://localhost:4287/MackAirCargoSystem_war_exploded/employee/
                http://localhost:4287/MackAirCargoSystem_war_exploded/employee/1
                
