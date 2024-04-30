DECLARE
	str varchar(10);
	rev varchar(10);
	len number;
BEGIN
	str := '&str';
	len := length(str);
	for i in reverse 1..len
	loop
	rev := rev||substr(str,i,1);
	end loop;
	dbms_output.put_line('Reverse: '||rev);
END;
/
