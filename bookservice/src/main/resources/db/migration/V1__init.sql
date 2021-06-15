

CREATE TABLE BOOK (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  author VARCHAR(250) NOT NULL,
  category VARCHAR(250) NOT NULL,
  publisher VARCHAR(250) NOT NULL
);

INSERT INTO BOOK (title, author, category, publisher) VALUES
  ('New Comics', 'Gupta', 'Comics','DC Comics');