DECLARE
	area number(6,2);
	pi constant number(3,2) := 3.14;
	radius number(5) := 5;
BEGIN
	area := pi*radius*radius;
	dbms_output.put_line('Area: '||area);
END;
/
