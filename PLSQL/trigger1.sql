create trigger t2 after insert or update on xy
BEGIN
	if inserting
      		then insert into testtable values(‘insert done’, SYSDATE);
  	else
      		insert into testtable values(‘update done’, SYSDATE);
	end if;
END;
/
