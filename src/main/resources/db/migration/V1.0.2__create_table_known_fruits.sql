create table known_fruits (
    id int not null,
    name varchar(40),
    primary key (id)
)

INSERT INTO known_fruits(id, name)
VALUES (1, 'mango');