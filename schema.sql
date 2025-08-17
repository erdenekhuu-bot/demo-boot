CREATE TYPE ProfileType AS ENUM ('PASSENGER', 'DRIVER');
CREATE TYPE TransportType AS ENUM ("STARTED","ENDED")

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    usertype ProfileType,
    phone INTEGER NULL,
);

CREATE TABLE profile (
	user_id INT PRIMARY KEY REFERENCES users(id),
	address VARCHAR(255) NULL,
	image VARCHAR NULL,
)

CREATE TABLE credential (
	user_id INT PRIMARY KEY REFERENCES users(id),
)

CREATE TABLE driver (
	user_id INT PRIMARY KEY REFERENCES users(id)
)

CREATE TABLE driver_credential (
     id SERIAL PRIMARY KEY,
	 driver_id INT PRIMARY KEY REFERENCES driver(user_id),
	 carKIND INT PRIMARY KEY REFERENCES carKIND(id)
)

CREATE TABLE CarKind (
    id SERIAL PRIMARY KEY,
    kind INTEGER,
    mark VARCHAR(255) NULL,
)

CREATE TABLE bank (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    account VARCHAR(255) NOT NULL,
    address VARCHAR(50)
)

CREATE TABLE transport (
    id SERIAL PRIMARY KEY,
    passenger INT,
    amount INT
    trans 0
    start_time
    end_time
)