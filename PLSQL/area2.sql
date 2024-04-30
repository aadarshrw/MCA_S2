DECLARE
	area number(6,2);
	pi constant number(3,2) := 3.14;
	radius number(5);
BEGIN
	radius := &radius;
	if radius < 0 then
	dbms_output.put_line('radius cannot be negative!!');
	else
	area := pi;
	for i in 1..2
	loop
	area := area*radius;
	end loop;
	end if;
	dbms_output.put_line('Area: '||area);
END;
/
