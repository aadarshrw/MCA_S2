DECLARE
	n number;
BEGIN
	n := &n;
	if mod(n,2)=0 then
	dbms_output.put_line('Even');
	else
	dbms_output.put_line('Odd');
	end if;
END;
/
