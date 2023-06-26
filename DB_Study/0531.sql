-- SELECT [ALL��DISTINCT] �Ӽ��̸�(��)
-- FROM 	      ���̺��̸�(��)
-- [WHERE        �˻�����(��)]
-- [GROUP BY    �Ӽ��̸�]
-- [HAVING       �˻�����(��)]
-- [ORDER BY    �Ӽ��̸� [ASC��DESC]]

-- �����Լ� : Ư���� ��츦 �����ϰ�� �Ϲ� �÷��� ���� ��� �Ұ� 
--           Ư�� �Ӽ����� ��������� ����� ����� �˻��ϱ� ���� �Լ�
-- ���� ���� : NULL �Ӽ����� �����ϰ� ����Ѵ�.
--            WHERE ������ ����� �� ����, SELECT ���̳� HAVING�������� ��� ����
--  ���� :  SUM(�÷���) : �ش� �÷��� �հ� ���ϱ� 
--          AVG(�÷���) : �ش� �÷��� ��� ���ϱ� 
--          MAX(�÷���)  : �ش� �÷��� �ִ밪 ���ϱ� 
--          MIN(�÷���)  : �ش� �÷��� �ּҰ� ���ϱ� 
--          COUNT(�⺻ �÷��� �Ǵ� * )  : �ش� �÷��� ���� ���ϱ� 
 SELECT * FROM ��ǰ���̺� ;
-- ��ǰ���̺��� ��� ��ǰ�� �ܰ� ���, �ܰ� �հ�, ����, �� �˻� �غ���.
   SELECT  AVG(�ܰ�), SUM(�ܰ�), COUNT(*) FROM ��ǰ���̺� ;
   
-- �Ѻ��������� ������ ��ǰ�� ��� ���, �հ�, ���� �� ��ǰ���̺��� �˻��غ���.(����)
    SELECT  AVG(���), SUM(���), COUNT(*)  FROM ��ǰ���̺�  WHERE ������ü = '�Ѻ�����';
    
-- �����̺� ���� �� �� ��ϵǾ� �ִ��� �˻��غ���.
   SELECT COUNT(*)  FROM �����̺�;
   
-- ��ǰ���̺��� ������ü�� ���� �˻��غ���.(**�ߺ�����)
   SELECT COUNT( DISTINCT ������ü)  FROM ��ǰ���̺�;
   
   SELECT * FROM orders;
 -- orders ���̺��� ���� �ֹ��� ������ �� �Ǹž�, ��� �� ���Ͻÿ�.
   SELECT SUM(saleprice) AS ���Ǹž�, AVG(saleprice) ���   FROM ORDERS ;
   
 -- orders���̺� �� 2�� �迬�� ���� �ֹ��� ������ �� �Ǹž��� ���Ͻÿ�
 SELECT SUM(saleprice) AS ���Ǹž� , AVG(saleprice) ��� FROM ORDERS WHERE CUSTID = 2;
 
 ------------------------------------------------------------------------------------
  -- GROUP BY �÷��� [ HAVING ���� ] 
  -- Ư�� �Ӽ����� ���� Ʃ���� ��� �׷��� ����
  --  GROUP BY ���� SELECT ���� �����Լ��� GROUP BY ���� ����� �÷��� ��� ����
  --  �����Լ��� WHERE �������� ��� ���ϰ� HAVING ������ ��� ����
  --  HAVING ���� GROUP BY�� ����� ������ ������ ������ �� ��� 
  --  WHERE ���� GROUP BY ������ ������ ������ ������ �� ��� 
   
   SELECT * FROM ��ǰ���̺�;
   
   -- �ֹ����̺��� �ֹ���ǰ�� ������ �հ� �� �˻����� 
   SELECT �ֹ���ǰ, SUM(����)   FROM �ֹ����̺�   GROUP BY �ֹ���ǰ ;
   
   -- ��ǰ���̺��� ������ü����  ��ǰ�� ������ ������ �ܰ��� �˻�����.
   SELECT  ������ü, COUNT(*) AS ��ǰ��, MAX(�ܰ�) AS �ְ� 
   FROM ��ǰ���̺� GROUP BY ������ü;
   
   -- ��ǰ���̺��� ������ü����  ��ǰ�� ������ ������ �ܰ��� �˻�����.(��, ��ǰ���� 3���̻�)
    SELECT  ������ü, COUNT(*) AS ��ǰ��, MAX(�ܰ�) AS �ְ� 
    FROM ��ǰ���̺� GROUP BY ������ü HAVING COUNT(*) >=3;

  -- �����̺��� ������ ����� 1000�� �̻��� ��޿� ���� ��޺� ������ ������ ����� �˻��� ���� 
  select ���, count(*) as ����, avg(������)
  from �����̺� group by ��� having  avg(������) >= 1000 ;
  
  select * from orders ;
   -- orders ���̺��� ������ �ֹ��� ������ �� ������ �� �Ǹž��� ���Ͻÿ�.
    select custid,  count(*) , sum(saleprice) 
    from orders   group by custid  order by custid asc;
    
   select  * from orders ;
  -- ������ 8,000�� �̻��� ������ ������ ���� ���Ͽ� ���� �ֹ� ������ �� ������ ���Ͻÿ�. 
   select custid, count(*)
   from orders 
   where saleprice >= 8000
   group by custid ;
      
  -- ������ 8,000�� �̻��� ������ ������ ���� ���Ͽ� ���� �ֹ� ������ �� ������ ���Ͻÿ�. 
  --  ��, �� �� �̻� ������ ���� ���Ѵ�.
    select custid, count(*)
    from orders 
    where saleprice >= 8000
    group by custid 
    HAVING  count(*)>= 2   ;
    
  -- ORDERS ���̺��� �������� �� ���ž�(�������� ����ȣ�� 1������ ���� �ۼ�)
    select sum(saleprice)  from orders    where custid = 1 ;
 
  -- �������� ������ ������ ��(�������� ����ȣ�� 1������ ���� �ۼ�)
    select count(*)  from orders    where custid = 1 ;
    
  -- BOOK ���̺����� ������ �� ����
    select count(*) from book ;
    
  -- BOOK ���̺��� ���ǻ��� �� ���� ( �ߺ� ����)
   select count(DISTINCT publisher) from book ;
   
   commit;
   
   
   
  
  
  





