CREATE TABLE LAPTOP (
    id integer primary key,
    name varchar(255),
    producer varchar(255),
    display real,
    processor varchar(255),
    ram integer,
    graphics varchar(255),
    hdd integer,
    ssd integer,
    fingerprint_scanner boolean,
    os varchar(255),
    quantity integer
);

INSERT INTO LAPTOP VALUES
(1, 'ASUS ROG GX567', 'ASUS', '17.3', 'Intel Core i7-6800K 3,5 GHz', 16, 'nVidia GeForce GTX 1080Ti', 1000, 250, TRUE, 'Windows 10 Pro x64', 10),
(2, 'ASUS ROG GT450', 'ASUS', '17.3', 'Intel Core i7-9800T 3,7 GHz', 32, 'nVidia GeForce GTX 1060Ti', 1000, 250, TRUE, 'Windows 10 Pro x64', 20),
(3, 'Lenovo Yoga Book C930', 'Lenovo', '13.3', 'Intel Core i5-7Y54 3,2 GHz', 8, 'Intel HD Graphics 615', null, 500, FALSE, 'Windows 10 Home x64', 30),
(4, 'MSI GV72', 'MSI', '17.3', 'Intel Core i7-8750H 4,1 GHz', 16, 'nVidia GeForce GTX 1050Ti', 1000, 250, FALSE, 'Windows 10 Home x64', 40),
(5, 'Acer Aspire 5', 'Acer', '17.3', 'Intel Core i5-8250U 3,5 GHz', 8, 'nVidia GeForce MX150', 500, 250, FALSE, 'Windows 10 Home x64', 50),
(6, 'HP 17', 'HP', '15.3', 'Intel Core i3-7020U 3,5 GHz', 8, 'Intel HD Graphics 630', null, 250, TRUE, 'Windows 10 Home x64', 60),
(7, 'Dell Inspiron', 'Dell', '17.3', 'Intel Core i7-8750H 3,5 GHz', 16, 'nVidia GeForce GTX 1060Ti', 2000, 250, TRUE, 'Windows 10 Home x64', 10);