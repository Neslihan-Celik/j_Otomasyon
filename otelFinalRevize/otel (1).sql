-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1:3307
-- Üretim Zamanı: 10 Oca 2021, 12:00:23
-- Sunucu sürümü: 10.4.14-MariaDB
-- PHP Sürümü: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `otel`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `reservation`
--

CREATE TABLE `reservation` (
  `reservationId` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `nameSurname` varchar(155) COLLATE utf8_turkish_ci NOT NULL,
  `tcNo` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `telNo` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `mail` varchar(155) COLLATE utf8_turkish_ci NOT NULL,
  `address` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `checkIn` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `checkOut` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `roomType` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `roomNo` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `bedType` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `amount` varchar(11) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `reservation`
--

INSERT INTO `reservation` (`reservationId`, `nameSurname`, `tcNo`, `telNo`, `mail`, `address`, `checkIn`, `checkOut`, `roomType`, `roomNo`, `bedType`, `amount`) VALUES
('RE001', 'Hüseyin Can ÇİRKİN', '11111111111', '11111111111', 'hüseyinCan@gmail.com', 'jaasjdasjkdasjkd', '01-01--2023', '05-01--2023', 'BRONZE', 'R001', '1', '250'),
('RE002', 'Rumeysa ÇİFCİ', '11111', '11111', 'rumeysa@gmail.com', 'asdasd', '01-01--2025', '03-01--2025', 'BRONZE', 'R001', '1', '500'),
('RE003', 'Neslihan ÇELİK', '5566588', '7888544', 'nes@gmail.com', 'sddsuısdıu', '01-01--2022', '11-01--2022', 'GOLD', 'R003', '3', '200'),
('RE004', 'ayşe fatma', 'jkfdjkffdkj', 'kler', 'klreklrek', 'lrkrfep', '07-01--2021', '01-01--2021', 'BRONZE', 'R001', '1', '500');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `room`
--

CREATE TABLE `room` (
  `roomId` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `roomType` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `bedType` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `room`
--

INSERT INTO `room` (`roomId`, `roomType`, `bedType`, `amount`) VALUES
('R001', 'BRONZE', '1', 100),
('R002', 'BRONZE', '2', 150),
('R003', 'BRONZE', '3', 200),
('R004', 'BRONZE', '4', 250),
('R005', 'SILVER', '1', 150),
('R006', 'SILVER', '2', 300),
('R007', 'SILVER', '3', 450),
('R008', 'SILVER', '4', 600),
('R009', 'GOLD', '1', 300),
('R010', 'GOLD', '2', 600),
('R011', 'GOLD', '3', 900),
('R012', 'GOLD', '4', 1200),
('R013', 'GOLD', '2', 1500);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `user`
--

CREATE TABLE `user` (
  `userId` int(4) NOT NULL,
  `personelName` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `personelTcNo` varchar(11) COLLATE utf8_turkish_ci NOT NULL,
  `personelTelNo` varchar(11) COLLATE utf8_turkish_ci NOT NULL,
  `personelMail` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `personelMaas` varchar(6) COLLATE utf8_turkish_ci NOT NULL,
  `personelAddress` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `username` varchar(55) COLLATE utf8_turkish_ci NOT NULL,
  `password` varchar(55) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `user`
--

INSERT INTO `user` (`userId`, `personelName`, `personelTcNo`, `personelTelNo`, `personelMail`, `personelMaas`, `personelAddress`, `username`, `password`) VALUES
(1, 'Hüseyin Can Çirkin', '42654878513', '05453435479', 'hsyncrkn@hotmail.com', '10', 'Yıldıztabya Gaziosmanpaşa', 'admin', '1234'),
(2, 'Rumeysa ÇİFTCİ', '16513135', '5186541', 'rumeysa@hotmail.com', '1111', 'asdasdasd', 'rumeysa', '1234'),
(3, 'Neslihan ÇELİK', '111111', '11111', 'asdasdasd', '5000', 'urfa', 'nes', '1234');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`reservationId`);

--
-- Tablo için indeksler `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`roomId`);

--
-- Tablo için indeksler `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userId`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `user`
--
ALTER TABLE `user`
  MODIFY `userId` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
