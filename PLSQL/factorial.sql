DECLARE
	fact number(5);
	n number(5); 
BEGIN
	fact := 1;
	n := &n;
	for i in 1..n
	loop
	fact := fact * i;
	end loop;
	dbms_output.put_line('Factorial: '||fact);
END;
/
