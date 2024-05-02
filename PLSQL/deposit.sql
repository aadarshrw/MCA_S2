create or replace procedure deposit(id in number,amt in number) is
BEGIN
	UPDATE customer SET balance=balance + amt WHERE accno=id;
END;
/
DECLARE
	accno number;
	amount number;
BEGIN
	accno:= &accno;
	amount:=&amount;
	deposit(accno,amount);
END;
/
