create or replace procedure squarenum(x in out number) is
BEGIN
	x := x*x;
END;
/
DECLARE
	a number;
BEGIN
	a := &a;
	squarenum(a);
	dbms_output.put_line('Square is '||a);
END;
/
