BEGIN;

CREATE TABLE Status (
    id_status SERIAL PRIMARY KEY,
    Name VARCHAR(10) NOT NULL
);

INSERT INTO Status (Name) VALUES ('New');
INSERT INTO Status (Name) VALUES ('Fixation');
INSERT INTO Status (Name) VALUES ('Update');
INSERT INTO Status (Name) VALUES ('Deleted');

CREATE TABLE Orders (
    id_order SERIAL PRIMARY KEY,
    plan_flight_airport_id INTEGER,
    id_plan_flight_airport INTEGER,
    plane_type_id SMALLINT,
    crew_type INTEGER,
    date_takeoff_real TIMESTAMP,
    city_origin_id INTEGER,
    city_destination_id INTEGER,
    city_name VARCHAR(25),
    flight_number VARCHAR(10),
    airport_origin_id SMALLINT,
    airport_origin_name VARCHAR(100),
    airport_destination_name VARCHAR(100),
    date_takeoff_calculation TIMESTAMP,
    date_landing_calculation TIMESTAMP,
    end_time TIMESTAMP,
    flight_number_arrival VARCHAR(10),
    from_airport VARCHAR(100),
    airport_origin VARCHAR(100),
    status_id INTEGER,
    create_time TIMESTAMP,
    update_time TIMESTAMP,
    old_date_landing_calculation TIMESTAMP,
    old_end_time TIMESTAMP,
    old_airport_origin_id SMALLINT,
    old_airport_origin_name VARCHAR(100),
    FOREIGN KEY (status_id) REFERENCES Status(id_status)
);

CREATE TABLE Personnel (
    id_personnel SERIAL PRIMARY KEY,
    personnel_id INTEGER,
    first_name VARCHAR(25),
    last_name VARCHAR(25),
    sex VARCHAR(1),
    phone VARCHAR(50),
    post VARCHAR(100),
    type_room VARCHAR(4),
    type VARCHAR(10),
    order_id INTEGER,
    FOREIGN KEY (order_id) REFERENCES Orders(id_order) ON DELETE CASCADE
);
COMMIT;