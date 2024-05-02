create or replace procedure findmin(x in number,y in number,z out number) is
BEGIN
	if x<y
	then
		z := x;
	else
		z := y;
	end if; 
END;
/
DECLARE
	a number;
	b number;
	c number;
BEGIN
	a := &a;
	b := &b;
	findmin(a,b,c);
	dbms_output.put_line('Minimum value is '||c);
END;
/	
