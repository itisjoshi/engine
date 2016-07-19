README
-----------------

This is just a backend to store a team and students writtten in Java(Spring, Hibernate)

The Database used is MySQL

Steps to run the application:

1. Create a database name ENGINE in mysql server running on port 3306 with username root password root.
2. Deploy the war file in tomcat7. It automatically creates the tables needed.
3. Run the queries given in dummy.sql file.
4. you can get the teams available by calling the context path team/getallstudents
5. This will return a object with teams and thier students.
6. you can get the students available by calling the context path /team/getallstudents
7. you can change the values of student and team by a PUT request to /team/updatestudents
