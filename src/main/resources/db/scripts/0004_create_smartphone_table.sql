CREATE TABLE SMARTPHONE (
    id integer primary key,
    name varchar(255),
    producer varchar(255),
    display real,
    processor varchar(255),
    ram integer,
    graphics varchar(255),
    memory integer,
    camera_front real,
    camera_back real,
    battery integer,
    fingerprint_scanner boolean,
    os varchar(255),
    quantity integer
);

INSERT INTO SMARTPHONE VALUES
(1, 'Huawei P20 Lite Dual SIM', 'Huawei', 5.84, 'HiSilicon Kirin 659', 4, 'Mali-T830 MP2', 64, 16.0, 16.0, 3000, TRUE, 'Android 8.0 Oreo', 20),
(2, 'Samsung Galaxy S10', 'Samsung', 6.1, 'Samsung Exynos 9820', 8, 'Mali-G76 MP12', 128, 16.0, 10.0, 3400, TRUE, 'Android 9.0 Pie', 40),
(3, 'Xiaomi Mi 8 lite', 'Xiaomi', 6.26, 'Qualcomm Snapdragon 660', 6, 'Adreno 512', 128, 12.0, 24.0, 3350, TRUE, 'Android 8.1 Oreo', 30),
(4, 'Samsung Galaxy S10+', 'Samsung', 6.4, 'Samsung Exynos 9820', 8, 'Mali-G76 MP12', 128, 16.0, 10.0, 4100, TRUE, 'Android 9.0 Pie', 50),
(5, 'iPhone X', 'Apple', 5.8, 'Apple A11 Bionic', 3, null, 64, 7.0, 12.0, 3000, TRUE, 'iOS 11', 35),
(6, 'Sony Xperia XZ1 G8342', 'Sony', 5.2, 'Qualcomm Snapdragon 835', 4, 'Adreno 540', 64, 13.0, 19.0, 2700, FALSE, 'Android 8.0 Oreo', 15),
(7, 'Huawei P30 Pro', 'Huawei', 6.47, 'Kirin 980', 6, 'Mali-G76 MP10', 128, 32.0, 40.0, 4200, TRUE, 'Android 9.0 Pie', 30),
(8, 'LG V30', 'LG', 6.0, 'Qualcomm Snapdragon 835', 4, 'Adreno 540', 64, 5.0, 16.0, 3300, FALSE, 'Android 7.1 Nougat', 5),
(9, 'Samsung Galaxy S8', 'Samsung', 5.8, 'Samsung Exynos 8895', 4, 'Mali-G71 MP20', 64, 8.0, 12.0, 3000, TRUE, 'Android 7.0 Nougat', 30),
(10, 'Samsung Galaxy A7', 'Samsung', 6.0, 'Samsung Exynos 7885', 4, 'Mali-G71', 64, 24.0, 24.0, 3300, TRUE, 'Android 8.0 Oreo', 20);