CREATE DATABASE transport_system;

CREATE TYPE ProfileType AS ENUM ('PASSENGER', 'DRIVER');
CREATE TYPE TransportType AS ENUM ('STARTED', 'ENDED', 'NONE');

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    usertype ProfileType,
    phone BIGINT
);

CREATE TABLE profile (
    user_id INT PRIMARY KEY REFERENCES users(id) ON DELETE CASCADE,
    address VARCHAR(255),
    image VARCHAR(255)
);

CREATE TABLE credential (
    user_id INT PRIMARY KEY REFERENCES users(id) ON DELETE CASCADE,
    password_hash VARCHAR(255)
);

CREATE TABLE driver (
    user_id INT PRIMARY KEY REFERENCES users(id) ON DELETE CASCADE,
    license_number VARCHAR(50)
);

CREATE TABLE CarKind (
    id SERIAL PRIMARY KEY,
    kind VARCHAR(100),
    mark VARCHAR(255)
);

CREATE TABLE driver_credential (
    driver_id INT REFERENCES driver(user_id) ON DELETE CASCADE,
    car_kind_id INT REFERENCES CarKind(id) ON DELETE CASCADE,
    PRIMARY KEY (driver_id, car_kind_id)
);

CREATE TABLE bank (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    account VARCHAR(255) NOT NULL UNIQUE,
    address VARCHAR(255)
);

CREATE TABLE transport (
    id SERIAL PRIMARY KEY,
    passenger_id INT REFERENCES users(id) ON DELETE SET NULL,
    amount NUMERIC(10,2),
    trans TransportType DEFAULT 'NONE',
    start_time TIMESTAMP,
    end_time TIMESTAMP
);

CREATE TABLE distance (
    id SERIAL PRIMARY KEY,
    begin_position VARCHAR(255),
    end_position VARCHAR(255),
    start_time TIMESTAMP,
    end_time TIMESTAMP
);

CREATE TABLE transport_distance (
    transport_id INT REFERENCES transport(id) ON DELETE CASCADE,
    distance_id INT REFERENCES distance(id) ON DELETE CASCADE,
    PRIMARY KEY (transport_id, distance_id)
);

CREATE TABLE available_pos (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    lat VARCHAR(100),
    lon VARCHAR(100)
);
