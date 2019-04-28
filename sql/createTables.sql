CREATE TABLE user (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(200),
  password VARCHAR(200),
  name VARCHAR(200),
  email VARCHAR(200),
  phoneNo INT
);

CREATE TABLE user_temporary (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(200),
  password VARCHAR(200)
);



CREATE TABLE vendor (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(200),
  phone INT,
  email VARCHAR(200),
  street VARCHAR(200),
  city VARCHAR(200),
  state VARCHAR(2),
  zip VARCHAR(7)
);

CREATE TABLE receipt (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  userID INT NOT NULL,
  FOREIGN KEY (userID)
  REFERENCES user_temporary(id)
  ON DELETE CASCADE,
  vendorID INT NOT NULL,
  FOREIGN KEY (vendorID)
  REFERENCES vendor(id)
  ON DELETE CASCADE,
  price FLOAT,
  description VARCHAR(200),
  item VARCHAR(200)
);
