DECLARE
	a number;
	b number;
	c number;
function findmax(x in number,y in number)
RETURN number is
	z number;
BEGIN
	if x>y then
	z := x;
	else
	z := y;
	end if;
	return z;
END findmax;
BEGIN
	a := 23;
	b := 45;
	c := findmax(a,b);
	dbms_output.put_line('Max of (23,45) is '||c);
END;
/
	
	
