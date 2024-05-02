create or replace function findsquare(num in number)
RETURN number is
	sq number(10);
BEGIN
	sq := num*num;
	return sq;
END findsquare;
/
DECLARE
	i number;
	s number;
BEGIN
	for i in 1..10
	loop
	s := findsquare(i);
	INSERT INTO squares VALUES(i,s);
	end loop;
END;
/
SELECT * FROM squares;

