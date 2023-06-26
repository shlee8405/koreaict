-- 조작어(DML) : 삽입(INSERT INTO), 삭제(DELETE  FROM), 수정(UPDATE ~ SET), 검색(SELECT ~ FROM)
-- 제어어(DCL) : GRANT, REVOKE, COMMIT , ROLLBACK
  -- COMMIT : 현재 상태를 DB에 적용(저장)
  -- ROLLBACK : COMMIT 이전상태로 되돌린다.
   --  COMMIT - 작업1  - 작업2 - 작업3 - COMMIT - 작업4 - 작업5-COMMIT  - ROLLBACK (작업4, 작업5 이전상태로 되돌린다.
   
-- 데이터 삽입 ( INSERT  INTO ~ VALUES ~ )  
-- 방법1)  INSERT INTO 테이블이름 
      -- VALUES(테이블에들어갈 값,테이블에들어갈 값,테이블에들어갈 값,);
      -- 값은 순서대로 모두 채워야 한다.
      -- 모두 채우지 않으면 오류 이다. 
      -- 값을 넣기 실으면 NULL 을 넣으수 있다. 
      -- (단, 속성 NOT NULL  이면 무조건 값이 들어가야 한다.)
      -- 날짜와 문자는 반드시 '' (사용)
      -- SYSDATE는 오늘날짜를 뜻하는 오라클 명령어이다.
      INSERT INTO MEMBER01
      VALUES(2, 'KIM', 'K111', '김둘리', 24, SYSDATE, 02,'서울');
      
      INSERT INTO MEMBER01
      VALUES(3, 'PARK', 'P111', '박꺽정', NULL, NULL, 02,'서울');
      
      INSERT INTO MEMBER01
      VALUES(4, 'LEE', 'L111', '이지매', NULL,'2023/01/22', 02,'서울');
      COMMIT;
      SELECT * FROM MEMBER01;
      
-- 방법2) INSERT INTO 테이블이름(컬럼명, 컬럼명,... )
--        VALUES(들어갈 값,값,...)
--       컬럼명과 들어갈 반드시 1:1 매칭
--       속성이 NOT NULL  반드시 넣어야 된다.
      INSERT INTO MEMBER01(IDX)
      VALUES(5);
      INSERT INTO MEMBER01(IDX, M_ID, M_NAME, M_PW)
      VALUES(6, 'KANG', '강동원', 'K111');
      
 -- 고객 테이블 삽입하기 
    INSERT INTO 고객테이블
    VALUES('apple', '정소화', 20, 'gold', '학생',1000 );
    INSERT INTO 고객테이블
    VALUES('banana', '김선우', 25, 'vip', '간호사',2500 );
    INSERT INTO 고객테이블
    VALUES('carrot', '고명석', 28, 'gold', '교사',4500 );
    INSERT INTO 고객테이블(고객아이디, 고객이름, 나이, 등급, 직업, 적립금)
    VALUES('orange', '김용욱', 22, 'silver', '학생',0 );
    INSERT INTO 고객테이블(고객아이디, 고객이름, 나이, 등급, 직업, 적립금)
    VALUES('melon', '성원용', 35, 'gold', '회사원',5000 );
    INSERT INTO 고객테이블(고객아이디, 고객이름, 나이, 등급, 직업, 적립금)
    VALUES('pear', '채광주', 31, 'silver', '회사원',500 );
    INSERT INTO 고객테이블(고객아이디, 고객이름,  등급, 직업, 적립금)
    VALUES('peach', '오형준',  'silver', '의사',300 );
    commit;
    INSERT INTO 고객테이블(고객아이디, 고객이름,  등급, 직업, 적립금)
    VALUES('peach1', '오형준1',  'silver1', '의사1',3001 );
    rollback;
    select * from 고객테이블;
      
    create table 제품테이블(
      제품번호 varchar2(50) not null primary key,
      제품명  varchar2(50),
      재고량 number,
      단가 number,
      제조업체 varchar2(50)
    );  
     create table 주문테이블(
      주문번호 varchar2(50) not null,
      주문고객  varchar2(50),
      주문제품 varchar2(50),
      수량 number,
      배송지 varchar2(50),
      주문일자 date,
      primary key(주문번호)
    );     
    
    insert into 제품테이블(제품번호,제품명,재고량,단가,제조업체 )
    values('p01', '그냥만두',5000,4500,'대한식품');
    insert into 제품테이블(제품번호,제품명,재고량,단가,제조업체 )
    values('p02', '매운쫄면',2500,5500,'민국푸드');
    insert into 제품테이블(제품번호,제품명,재고량,단가,제조업체 )
    values('p03', '쿵떡파이',3600,2600,'한빛제과');
    insert into 제품테이블(제품번호,제품명,재고량,단가,제조업체 )
    values('p04', '맛난초콜릿',1250,2500,'한빛제과');
    insert into 제품테이블(제품번호,제품명,재고량,단가,제조업체 )
    values('p05', '얼큰라면',2200,1200,'대한식품');
    insert into 제품테이블(제품번호,제품명,재고량,단가,제조업체 )
    values('p06', '통통우동',1000,1550,'민국푸드');
    insert into 제품테이블(제품번호,제품명,재고량,단가,제조업체 )
    values('p07', '달콤비스킷',1650,1500,'한빛제과');
    commit;
    select * from  제품테이블;
   
   insert into 주문테이블(주문번호,주문고객,주문제품,수량,배송지,주문일자)
    values('o01','apple', 'p03',10, '서울시 마포구', '2022-01-01');
   insert into 주문테이블(주문번호,주문고객,주문제품,수량,배송지,주문일자)
    values('o02','melon', 'p01',5, '인천시 계양구', '2022-01-10');
    insert into 주문테이블(주문번호,주문고객,주문제품,수량,배송지,주문일자)
    values('o03','banana', 'p06',45, '경기도 부천시', '2022-01-11');
    insert into 주문테이블(주문번호,주문고객,주문제품,수량,배송지,주문일자)
    values('o04','carrot', 'p02',8, '부산시 금정구', '2022-02-01');
    insert into 주문테이블(주문번호,주문고객,주문제품,수량,배송지,주문일자)
    values('o05','melon', 'p06',36, '경기도 용인시', '2022-02-20');
    insert into 주문테이블(주문번호,주문고객,주문제품,수량,배송지,주문일자)
    values('o06','banana', 'p01',19, '충청북도 보은군', '2022-03-02');
    insert into 주문테이블(주문번호,주문고객,주문제품,수량,배송지,주문일자)
    values('o07','apple', 'p03',22, '서울시 영등포구', '2022-03-15');
    insert into 주문테이블(주문번호,주문고객,주문제품,수량,배송지,주문일자)
    values('o08','pear', 'p02',50, '강원도 춘천시', '2022-04-10');
    insert into 주문테이블(주문번호,주문고객,주문제품,수량,배송지,주문일자)
    values('o09','banana', 'p04',15, '전라남도 목포시', '2022-04-11');
    insert into 주문테이블(주문번호,주문고객,주문제품,수량,배송지,주문일자)
    values('o10','carrot', 'p03',20, '경기도 안양시', '2022-05-22');
    commit;
    
    --  수정, 삭제는 반드시 조건식을 넣어야 한다. 
    -- 조건식을 넣지 않으면 전체가 삭제 되거나  전체가 수정 된다.
    
    -- 데이터 삭제 ( delete from 테이블이름 [where 조건식] )
     -- 조건식이 있으면 조건식 이 참인 것만 삭제 된다.
     -- 조건식이 없으면 전체가 삭제 된다.
     -- 조건식( 컬럼명 비교연산자 또는 논리연산)
     delete from 고객테이블 ;
     select * from 고객테이블;
     select * from 제품테이블;
     -- 제조업체가 '한빛제과'인 행만 삭제 
     delete from 제품테이블 where 제조업체 = '한빛제과';
     -- 제조업체가 '민국푸드'이면서 단가 3000이하인 행만 삭제 
     delete from 제품테이블 where 제조업체 = '민국푸드' and   단가 <=3000  ;
    rollback;
   
   -- 데이터 수정 (update 테이블이름 set 변경내용  [where 조건식] )
   -- 조건식이 있으면 조건식 이 참인 것만 수정 된다.
   -- 조건식이 없으면 전체가 수정 된다.
   
   -- 제조업체를 대한푸드로 수정
   update 제품테이블 set 제조업체 = '대한푸드' ;
   -- 제조업체를 한빛제과로 수정 단, 단가가 2000이상인 행만 수정 
   update 제품테이블 set 제조업체 = '한빛제과' where 단가 >= 2000;
   -- 제조업체를 대한식품, 재고량=10000 으로  수정 단,제품번호가 p01 또는  p05 행만 수정 
   update 제품테이블 set 제조업체 = '대한식품', 재고량 = 10000 where  제품번호 = 'p01' or 제품번호 = 'p05';
   rollback;
   
   select * from  제품테이블;
   -- 제품테이블에서 제품번호가 p03인 제품의 제품명을 통큰파이로 수정하자 
      update 제품테이블 set 제품명 ='통근파이' where 제품번호 = 'p03';
   -- 제품 테이블에 있는 모든 제품의 단가를 10% 인상해 보자 (컬럼이 숫자이면 산술연산이 가능)
      update 제품테이블 set 단가 = 단가 * 1.1 ;
      
   select * from  주문테이블; 
   -- 주문테이블에서 주문일자가 2022-05-22인 주문내역을 삭제하자
       delete from 주문테이블 where 주문일자 = '2022-05-22' ;
   -- 주문테이블에서 주문일자가 2022-03 ~ 2022-04인 주문내역을 삭제하자(날짜컬럼 연산 가능, )
       delete from 주문테이블 where 주문일자 >= '2022-03-01' and 주문일자 <= '2022-04-30' ;
   -- 주문테이블의 주문일자를 모두 5일 수정하자 
      update 주문테이블 set 주문일자 = 주문일자 + 5 ;
      
   -- 주문테이블 에서 정소화 고객이 주문한 제품의 주문 수량을 5개로 수정해보자 (서브쿼리 = 나중에)
      select * from 고객테이블;
   rollback;
   commit;
    
   
    

    
    
    
    