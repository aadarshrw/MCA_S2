create or replace function findsum(x in number,y in number)
RETURN number is
	z number;
BEGIN
	z := x+y;
	return z;
END findsum;
/
DECLARE 
	a number;
	b number;
	s number;
BEGIN
	a := &a;
	b := &b;
	s := findsum(a,b);
	dbms_output.put_line('Sum is '||s);
END;
/

