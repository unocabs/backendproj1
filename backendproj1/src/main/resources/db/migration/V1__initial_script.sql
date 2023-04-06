DROP SCHEMA IF EXISTS rosgian cascade;
CREATE SCHEMA rosgian;

CREATE TABLE rosgian.COFFEE (
                                coffee_id uuid,
                                coffee_name varchar(150),
                                location varchar(150),
                                price int,
                                PRIMARY KEY (coffee_id)
);