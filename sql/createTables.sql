CREATE TABLE user (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR,
  password VARCHAR,
  name VARCHAR,
  email VARCHAR,
  phoneNo INT
);



CREATE TABLE vendor (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR,
  phone INT,
  email VARCHAR,
  street VARCHAR,
  city VARCHAR,
  state VARCHAR(2),
  zip VARCHAR(7)
);

CREATE TABLE receipt (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  userID INT NOT NULL,
  FOREIGN KEY (userID)
  REFERENCES user(id)
  ON DELETE CASCADE,
  vendorID INT NOT NULL,
  FOREIGN KEY (vendorID)
  REFERENCES vendor(id)
  ON DELETE CASCADE,
  price FLOAT,
  description VARCHAR,
  item VARCHAR
);
