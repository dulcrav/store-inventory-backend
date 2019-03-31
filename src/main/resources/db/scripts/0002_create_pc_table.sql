CREATE TABLE PC (
    id integer primary key,
    name varchar(255),
    producer varchar(255),
    processor varchar(255),
    ram integer,
    graphics varchar(255),
    hdd integer,
    ssd integer,
    os varchar(255),
    quantity integer
);

INSERT INTO PC VALUES
(1, 'Dell Vostro 3670', 'Dell', 'Intel Core i5-8400', 16, 'Intel UHD Graphics 630', 1000, 250, 'Microsoft Windows 10 Pro PL x64', 10),
(2, 'Dell Vostro 3470', 'Dell', 'Intel Core i5-8400', 8, 'Intel UHD Graphics 630', 1000, null, 'Microsoft Windows 10 Pro PL x64', 5),
(3, 'x-kom G4M3R 500', 'x-kom', 'Intel Core i7-8700', 16, 'NVIDIA GeForce GTX 1060', 1000, 500, 'Microsoft Windows 10 Pro PL x64', 20),
(4, 'SHIRU 6200', 'SHIRU', 'Intel Core i5-8400', 16, 'NVIDIA GeForce GTX 1050Ti', null, 1000, 'Microsoft Windows 10 Home PL x64', 40),
(5, 'Dell Inspiron 3670', 'Dell', 'Intel Core i3-8100', 16, 'Intel UHD Graphics 630', 1000, 250, 'Microsoft Windows 10 Pro PL x64', 2);
