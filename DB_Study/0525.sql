CREATE TABLE MEMBER01(
  IDX NUMBER NOT NULL PRIMARY KEY,
  M_ID VARCHAR2(50),
  M_PW VARCHAR2(50),
  M_NAME VARCHAR2(50),
  M_AGE NUMBER(3),
  M_REG DATE
);

CREATE TABLE MEMBER02(
  IDX NUMBER NOT NULL,
  M_ID VARCHAR2(50),
  M_PW VARCHAR2(50),
  M_NAME VARCHAR2(50),
  M_AGE NUMBER(3),
  M_REG DATE,
  PRIMARY KEY(IDX)
);

CREATE TABLE MEMBER03(
  IDX NUMBER NOT NULL PRIMARY KEY,
  M_ID VARCHAR2(50) NOT NULL PRIMARY KEY,
  M_PW VARCHAR2(50),
  M_NAME VARCHAR2(50),
  M_AGE NUMBER(3),
  M_REG DATE
);

CREATE TABLE MEMBER04(
  IDX NUMBER NOT NULL ,
  M_ID VARCHAR2(50) NOT NULL ,
  M_PW VARCHAR2(50),
  M_NAME VARCHAR2(50),
  M_AGE NUMBER(3),
  M_REG DATE,
  PRIMARY KEY(IDX, M_ID)
);

-- MEMBER02, MEMBER04 ���̺� ���� 
DROP TABLE MEMBER02 ;
DROP TABLE MEMBER04 ;

-- ���̺� ���� 
-- MEMBER01 ���̺��� ������ ������ �����ؼ� C_MEM01 ���̺��� ������ 
   CREATE TABLE C_MEM01 AS SELECT * FROM member01;
-- MEMBER01 ���̺��� ������ �����ؼ� C_MEM02 ���̺��� ������ 
  CREATE TABLE C_MEM02 AS SELECT * FROM member01 WHERE 1 = 2 ;
  
INSERT INTO MEMBER01 VALUES(1, 'HONG', 'H111', 'ȫ�浿', 24, SYSDATE);
COMMIT;
SELECT * FROM MEMBER01;

-- �����̺� (�����̵�(pk),���̸�, ����, ���, ����, ������)
-- ���߿� PK �ֱ� 
CREATE TABLE �����̺�(
  �����̵� VARCHAR2(50),
  ���̸� VARCHAR2(50),
  ���� NUMBER,
  ��� VARCHAR2(50),
  ���� VARCHAR2(50),
  ������  NUMBER
);
-- book ���̺� ����� 
--  ������ȣ(bookid, pk),  �����̸�(bookname, 90), ���ǻ�(publisher,50), ����(price,7)
 CREATE TABLE BOOK(
     BOOKID VARCHAR2(50) NOT NULL PRIMARY KEY,
     BOOKNMAE VARCHAR2(90),
     PUBLISHER VARCHAR2(50),
     PRICE  NUMBER(7)
 );

-- ��������
  -- NOT NULL :  ���� ������� ����
  -- DEFAULT : �⺻���� �����ϴ� Ű���� 
     --  ������ NUMBER DEFAULT 0  => ���� �Է��Ҷ� �Է����� ������ 0���� ä������.
  -- CHECK : ���̺� ��Ȯ�ϰ� ��ȿ�� �����͸� �����ϱ� ���� Ư�� �Ӽ��� ���� ���������� ����
     -- AGE NUMBER CHECK >= 19  => 19 �̻��� ���ڸ� ���� 
     -- ��� NUMBER CHECK(��� >=0 AND ��� <= 1000)  => ����� 0~1000 ���� 

-- ���̺� ���� ���� : ALTER
-- �÷� �߰� (ADD)  : ALTER TABLE ���̺��̸� ADD �÷��� �ڷ���(ũ��) [��������]
 -- MEMBER01 ���̺� �ּҸ� ���� (M_ADDR  VARCHAR2(100) DEFAULT '����' ;
    
    ALTER TABLE MEMBER01 ADD M_ADDR VARCHAR2(100) ;
    COMMIT;
    ALTER TABLE MEMBER01 ADD M_ADDR2 VARCHAR2(100) DEFAULT '����' ;
    COMMIT;
    
-- �÷� ���� (DROP COLUMN �÷���) : ALTER TABLE ���̺��̸� DROP COLUMN �÷���;
   ALTER TABLE MEMBER01 DROP COLUMN M_ADDR ;
   COMMIT;
   -- �����Ͱ� �־ ���� �ȴ�.
   -- ���࿡ ������ �Ӽ��� �����ϴ� �ٸ� �Ӽ��� ������ ���� �ȵ�
   ALTER TABLE MEMBER01 DROP COLUMN M_ADDR2 ;
   COMMIT;

 -- �÷� ���� (MODIFY) : ALTER TABLE ���̺��̸� MODIFY �÷��� �ڷ���(ũ��) [��������]
   -- �����Ͱ� ���� ��� : �÷��� �ڷ����� ũ�⸦ ������� ������ ���ִ�.
    -- M_ADDR�� �����Ͱ� �����Ƿ� ���� �ڷ����� ũ�� ������� ����
      ALTER TABLE MEMBER01 MODIFY M_ADDR VARCHAR2(150);
    -- M_ADDR�� �����Ͱ� �����Ƿ� �ٸ� �ڷ������� ���� ����
    ALTER TABLE MEMBER01 MODIFY M_ADDR NUMBER(7);
 
   -- �����Ͱ� �ִ� ��� ���� �ڷ����� ũ�� ������ ���� (��, ���� �ִ� �������� ũ�⺸�ٴ� Ŀ�� �ȴ�.)
      ALTER TABLE MEMBER01 MODIFY M_ADDR2 VARCHAR2(50);
      
   -- �����Ͱ� �ִµ� �ٸ� �ڷ������� ���� �Ҷ� (�� ��õ)
      --  ���ڸ� ���ڷ� ������ ��  �ȵȴ�.
        ALTER TABLE MEMBER01 MODIFY M_ADDR2 NUMBER ;
      -- ���ڸ� ���ڷ� ������ �� �ȵȴ�.
        ALTER TABLE MEMBER01 MODIFY M_AGE VARCHAR2(6) ;
      
      
      
      
      
      
      
      
      
      
      

