set serveroutput on;
create or replace trigger display_salary_changes 
before delete or insert or update on customers 
for each row
when (new.id > 0) 
DECLARE 
   sal_diff number; 
BEGIN 
   sal_diff := :new.salary  - :old.salary; 
   dbms_output.put_line('Old salary: ' || :old.salary); 
   dbms_output.put_line('New salary: ' || :new.salary); 
   dbms_output.put_line('Salary difference: ' || sal_diff); 
END; 
/
