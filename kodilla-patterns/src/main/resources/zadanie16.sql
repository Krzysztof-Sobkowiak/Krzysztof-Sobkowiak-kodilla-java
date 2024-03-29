CREATE TABLE USERS
(
   ID   SERIAL PRIMARY KEY,
   FIRSTNAME   VARCHAR(100),
   LASTNAMEVARCHAR(100)
);

CREATE TABLE POSTS
(
   ID  SERIAL PRIMARY KEY,
   USER_ID  BIGINT UNSIGNED NOT NULL,
   BODY   VARCHAR(1024),
   FOREIGN KEY (USER_ID) REFERENCES USERS(ID)
);

INSERT INTO USERS (FIRSTNAME, LASTNAME)
VALUES ("John", "Smith");

COMMIT;

INSERT INTO POSTS (USER_ID, BODY)
VALUES (1, "This is my first post on this forum!");

COMMIT;

SELECT * FROM POSTS;

INSERT INTO USERS (FIRSTNAME, LASTNAME)
VALUES ("Zachary", "Lee");

INSERT INTO USERS (FIRSTNAME, LASTNAME)
VALUES ("Stephanie", "Kovalsky");

INSERT INTO USERS (FIRSTNAME, LASTNAME)
VALUES ("Thomas", "Landgren");

INSERT INTO USERS (FIRSTNAME, LASTNAME)
VALUES ("John", "Thomson");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (2, "This is my first post too!");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (2, "How are you?");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (1, "Quite good, thanks bro!");

INSERT INTO POSTS (USER_ID, BODY)
VALUES (4, "Yo all! Here is Thomas!");

COMMIT;