-- ������ : �ڵ����� ���� ���ڰ��� ������ �ִ� ������ �Ѵ�.
--         ���� �⺻Ű�������� ���ȴ�.
-- ���� : MySQL�̳� MariaDB ������ auto_increment�� �����Ѵ�.

-- ������� :  
--   CREATE SEQUENCE �̸�(���̺��̸�_seq)
--   increment by ��������(������ 1)
--   start with ���ۼ���(������ 1)
--   nocycle ; 
--   nocycle =>  ��ȣ�� ������ �� �� �ٽ� ���� ���� ����

--  ����� ;  insert �Ҷ�  �������̸�.nextval �� ����ϸ� 
--             �ڵ����� ���� �Ҷ� ��ȣ�� ���� �ȴ�.

select * from customer;
delete from customer;
commit;

CREATE SEQUENCE CUSTOMER_SEQ
INCREMENT BY 1
START WITH 1
NOCYCLE ;

INSERT INTO customer(CUSTID, NAME, ADDRESS, PHONE)
VALUES(CUSTOMER_SEQ.NEXTVAL, '������', '���� ��ü��Ÿ', '000-5000-0001');

INSERT INTO customer(CUSTID, NAME, ADDRESS, PHONE)
VALUES(CUSTOMER_SEQ.NEXTVAL, '�迬��', '���ѹα� ����', '000-6000-0001');

INSERT INTO customer(CUSTID, NAME, ADDRESS, PHONE)
VALUES(CUSTOMER_SEQ.NEXTVAL, '��̶�', '���ѹα� ������', '000-7000-0001');

INSERT INTO customer(CUSTID, NAME, ADDRESS, PHONE)
VALUES(CUSTOMER_SEQ.NEXTVAL, '�߽ż�', '�̱� Ŭ������', '000-8000-0001');

INSERT INTO customer(CUSTID, NAME, ADDRESS, PHONE)
VALUES(CUSTOMER_SEQ.NEXTVAL, '�ڼ���', '���ѹα� ����', null);
COMMIT;
SELECT * FROM customer order by custid ;

---------------------------------------------------------------------------------
 -- �� (VIEW) : �ٸ� ���̺��� ������� ������� ���� ���̺�
 --             �����͸� ������ �����ϱ� �ʰ� �������θ� �����ϴ� ���̺��̴�.
 --             �Ϲ� ����� �������δ� �並 ���� �� ����.
 --             ������ �޾ƾ� �Ѵ�. (SYSTEM �������� GRANT CREATE VIEW TO �Ϲݰ��� )
 --             ��� ����, ����, ���� �� ������ �ƴ϶� �˻�(SELECT)�� �����̴�.
 --             ���� ���̺��� �ϳ��� ���ļ� �ϳ��� ��� ���� �� �� �ְ�
 --             �ϳ��� ���̺��� �������� �並 ���� ���� �ֵ�.
 --           
 
 -- ����� ��� : 
 --        ���� �̸��� �䰡 �����ϸ� ���� �߻� 
 -- ���1)   CREATE  VIEW ���̸�
 --          AS SELECT ��;
 
 --         ���� �̸��� �䰡 �����ϸ� ������ �ִ� �並 �����ϰ� ���� �����.
 -- ���1)   CREATE OR REPLACE VIEW ���̸�
 --          AS SELECT ��;
 

-- banana ���� �ֹ��� ��ǰ�� �̸��� �˻��� ����.(join)
select  p.��ǰ�� , O.�ֹ�����
from ��ǰ���̺� p, �ֹ����̺� o 
WHERE p.��ǰ��ȣ = o.�ֹ���ǰ and o.�ֹ���='banana';

-- �� ������ ��� ����� ���� 
CREATE VIEW banana_select
as select  p.��ǰ�� , O.�ֹ�����
   from ��ǰ���̺� p, �ֹ����̺� o 
   WHERE p.��ǰ��ȣ = o.�ֹ���ǰ and o.�ֹ���='banana';
   
   select * from banana_select;

-- ���� �̸��� ���� �ֹ��� ������ �̸��� ���Ͻÿ�.
select c.name, b.bookname, b.price
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid
order by c.name; 

create VIEW v_book
as select c.name, b.bookname, b.price
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid
order by c.name; 

select * from v_book;

-- �̻�̵��� ������ ������ ������ ���� �̸��� ���̽ÿ�. 
   --subquery
  select name from customer 
  where custid in (select custid from orders 
                    where bookid in (select bookid from book where publisher = '�̻�̵��'));

 create VIEW �̻�̵��_���̸�
 as select name from customer 
  where custid in (select custid from orders 
                    where bookid in (select bookid from book where publisher = '�̻�̵��'));

select * from �̻�̵��_���̸�;

------------------------------------------------------------------------------------------
-- ����Ŭ ���� �Լ� : ����Ŭ ��ü���� ������� �Լ� 
-- dual : ��°���� ���� ���� ����Ŭ���� �����ϴ� ���� ���̺� 
-- 1. ���ڰ��� ���� �Լ��� 
--   1) ���밪 : ABS(����)
   select abs(-75), abs(+75), abs(75), abs(3.156),abs(-3.156) from dual ;
--   2) �ø� : ceil(����) , �Ҽ��� �������� �ø�
   select ceil(-75.41), ceil(75.41), ceil(75.61), ceil(-75.61) from dual ;
--   3) ���� : floor(����) , �Ҽ��� �������� ����
   select floor(-75.41), floor(75.41), floor(75.61), floor(-75.61) from dual ;
--   4) ���� : trunc(����), trunc(����, �ڸ���)  ; �ڸ��� ���� ����
   select trunc(-75.41), trunc(75.41), trunc(75.61), trunc(-75.61) from dual ;
   select trunc(-75.41,0), trunc(75.41,0), trunc(75.61,0), trunc(-75.61,0) from dual ;
   select trunc(-75.41,1), trunc(75.41,1), trunc(75.61,1), trunc(-75.61,1) from dual ;
   select trunc(-75.41,-1), trunc(75.41,-1), trunc(75.61,-1), trunc(-75.61,-1) from dual ;
--   5) �ݿø� : round(����), round(����, �ڸ���)  :  �ڸ��� ���ϸ� �ø�
   select round(-13.4441),  round(13.4441), round(-13.5541),  round(13.5541) from dual; 
   select round(-13.4441,0),  round(13.4441,0), round(-13.5541,0),  round(13.5541,0) from dual; 
   select round(-13.4441,1),  round(13.4441,1), round(-13.5541,1),  round(13.5541,1) from dual; 
-- 6) power (����, ����) : �����Լ�
  SELECT power(2,3), power(3,2) from dual;
  --     2 * 2 * 2,        3 * 3 
 -- 7)  sqrt(����) : ������
  select sqrt(4), sqrt(9), sqrt(10),  trunc(sqrt(10),1) from dual;
 -- 8) sign(����) : ��������,������� �Ǻ� : ���� -1,  ��� 1  
  select sign(-75.41), sign(75.41), sign(75.61), sign(-75.61) from dual ;
  -- 9) mod : ���� ������ (java %�� ����)
  select mod(27,2), mod(27,3), mod(27,4 ) from dual ;
  
 -----------------------------------------------------------------------------------------------
 -- �����Լ�
 -- 1. chr(�ƽ�Ű�ڵ� = ����) : �ƽ�Ű�ڵ忡 �ش��ϴ� ���� ǥ�� 
      select chr(97), chr(65), chr(49) from dual;
 -- 2. concat(���ڿ�, ���ڿ�) : �� ���ڿ� ����
      select concat('ICT', '���簳�߿�') from dual;
 -- ** 3. lower(���ڿ�) : ��� ���ڸ� �ҹ��ڷ� ����
 -- ** 4. upper(���ڿ�) : ��� ���ڸ� �빮�ڷ� ���� 
 --    5. initcap(���ڿ�) : ù���� �빮�� �������� �ҹ��ڷ� ����
     select lower('KOREA1231'),lower('KoRea'), lower('korea'), 
            upper('KOREA1212'),upper('KoRea'), upper('korea') ,
            initcap('KOREA1212'),initcap('KoRea'), initcap('korea')
            from dual;
   
     select * from �����̺� where UPPER(�����̵�) = 'BANANA'; 
 --  6. trim(���ڿ�) : ���� ���� ����     
 --  7. ltrim(���ڿ�) : ���� ���� ����
 --  8. rtrim(���ڿ�) : ������ ���� ���� 
 --  9. length(���ڿ�) : ���ڿ��� ����
 select trim('  oracle  xe 21c  '), ltrim('  oracle  xe 21c  '), rtrim('  oracle  xe 21c  ') from dual;
 
  select length('  oracle  xe 21c  '),
         length(trim('  oracle  xe 21c  ')), 
         length(ltrim('  oracle  xe 21c  ')),
         length(rtrim('  oracle  xe 21c  ')) from dual;
 -- 10.  lpad(���ڿ�, �ڸ���, ���� ������ �޿� ����) : �ڸ����� ���ڸ��� �߸���.
 -- 11.  rpad(���ڿ�, �ڸ���, ������ ������ �޿� ����) : �ڸ����� ���ڸ��� �߸���.
 select lpad('oracle xe', 20, '*'), rpad('oracle xe', 20, '*') from dual;
 select lpad('oracle xe', 5, '*') a, rpad('oracle xe', 5, '*') b from dual;
 
 -- 12. substr(���ڿ�, ������ġ, ����) ; ������ġ 1���� , -�� ������ ���
 select substr('abcdefg', 2, 2),
        substr('abcdefg', -2, 2),
        substr('abcdefg', -3, 5),
        substr('abcdefg', -5, 3) from dual;
        
  -- 13. replace(���ڿ�, ������ ���ڿ�, ���� ���� )
  select replace('���ѹα�' , '��', ' �� ��' ) from dual;
  
  -- 14. ASCII('�ƽ�Ű�ڵ幮��') : ���ڷ� ��Ÿ�� (chr() �� �ݴ�)
  select ASCII('A'), ASCII('a'), ASCII('1') from dual;

  -- 15. instr(���ڿ�, ã�� ���ڿ�, ������ġ) : ���ڿ����� ���ڿ��� ��ġǥ��, index �� 1����
  select instr('770704-1000000', '-') from dual ;  -- 7
  select instr('770704-1000000', '0') from dual ;  -- 3 (ù��° 0ã��)
  select instr('770704-1000000', '0',3+1) from dual ;  -- 5 (�ι�° 0ã��)
  select instr('770704-1000000', '0',
     (select instr('770704-1000000', '0') from dual)+1) from dual ;  -- 5 (�ι�° 0ã��)
     
  select instr('770704-1000000', '0',1,1) from dual ;  -- 3 (ù��° 0ã��)   
  select instr('770704-1000000', '0',1,2) from dual ;  -- 5 (ù��° 0ã��)   
  select instr('770704-1000000', '0',1,3) from dual ;  -- 9 (ù��° 0ã��)   
  
     
 
 
 
 
 
  
  




