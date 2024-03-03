SELECT name, MAX(salary) AS salary 
FROM employee 
WHERE salary IN
(SELECT salary FROM employee MINUS SELECT MAX(salary) 
FROM employee); 