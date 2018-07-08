
DROP TABLE wishlist;
DROP TABLE sale;
DROP TABLE book;
DROP TABLE shopmember;

-- shopmember
CREATE TABLE shopmember(
  userid      varchar2(20) CONSTRAINT shopmember_nn NOT NULL,
  password    varchar2(20) CONSTRAINT shopmember_password_nn NOT NULL,
  username    varchar2(20) CONSTRAINT shopmember_username_nn NOT NULL,
  address     varchar2(100),
  phone       varchar2(50),

  CONSTRAINT shopmember_pk PRIMARY KEY(userid)
);

-- book
CREATE TABLE book(
  bookcode    NUMBER CONSTRAINT book_bookcode_nn NOT NULL,
  title       VARCHAR2(50) CONSTRAINT book_title_nn NOT NULL,
  price       NUMBER DEFAULT 0,
  quantity    NUMBER DEFAULT 0
);

-- sale
CREATE TABLE sale(
  userid      VARCHAR2(20) CONSTRAINT sale_userid_nn NOT NULL,
  bookcode    NUMBER CONSTRAINT sale_bookcode_ NOT NULL,
  purchasecnt NUMBER DEFAULT 0,
  purchasedate DATE DEFAULT SYSDATE,
  
  CONSTRAINT sale_userid_fk FOREIGN KEY(userid) REFERENCES shopmember ON DELETE CASCADE
);

-- wishlist
CREATE TABLE wishlist(
  userid      VARCHAR2(20)  CONSTRAINT wishlist_userid_nn NOT NULL,
  bookcode    NUMBER  CONSTRAINT wishlist_bookcode_nn NOT NULL,
  
  CONSTRAINT wishlist_userid_fk FOREIGN KEY(userid) REFERENCES shopmember ON DELETE CASCADE
);

-- sequence
DROP SEQUENCE bookseq;
CREATE SEQUENCE bookseq;



-- book data
insert into book values(1,'Java 1.9 따라하기',10000,10);
insert into book values(2,'C로 배우는 자료구조',12000,10);
insert into book values(3,'HTML5_CSS3',9000,10);
insert into book values(4,'자바 디자인 패턴',15000,10);
insert into book values(5,'안드로이드 프로그래밍',20000,10);

commit;
