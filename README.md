Address and Employee have a one-to-one relationship, where each Address is associated with one Employee.
Employee and Task have a one-to-many relationship, where each Employee can have multiple tasks, but each task belongs to only one Employee.
Employee and Mission have a many-to-many relationship, 
where each Employee can be associated with multiple missions, and each Mission can have multiple employees. 
This is represented by a join table misson_employee.
Mission and Employee have a many-to-many relationship, established by the employeeList attribute in Mission and 
missionList attribute in Employee, and represented by the same join table misson_employee.

![image](https://github.com/chaossmonkey/HibernateMappings/assets/123546049/3267da70-fbd0-4d1f-a1fe-7f41acb5de4f)

