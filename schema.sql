CREATE TYPE ProfileType AS ENUM ('passenger', 'driver');

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    usertype ProfileType,
    phone INTEGER NOT NULL
);

CREATE TABLE profile (
	user_id INT PRIMARY KEY REFERENCES users(id),
	locationat BIGINT NOT NULL,
	image STRING,	
)

CREATE TABLE credential (
	user_id INT PRIMARY KEY REFERENCES users(id),
)

CREATE TABLE driver (
	user_id INT PRIMARY KEY REFERENCES users(id)
)

CREATE TABLE drivercredential (
	 driver_id INT PRIMARY KEY REFERENCES driver(user_id)
)