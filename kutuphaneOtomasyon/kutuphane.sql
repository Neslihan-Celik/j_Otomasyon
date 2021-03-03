-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 05 Şub 2021, 13:56:58
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
-- Veritabanı: `kutuphane`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kitap`
--

CREATE TABLE `kitap` (
  `kId` int(11) NOT NULL,
  `KAdi` varchar(100) NOT NULL,
  `seriNo` varchar(20) NOT NULL,
  `Yazar` varchar(100) NOT NULL,
  `durum` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `kitap`
--

INSERT INTO `kitap` (`kId`, `KAdi`, `seriNo`, `Yazar`, `durum`) VALUES
(1, 'Savaş Sanatı', '0202', 'Sun Tzu', 'Ödünç Verilmiş'),
(6, 'Simyacı', '8855', 'Paulo Coelho', 'Ödünç Verilmiş'),
(7, 'Rakamların Evrensel Tarihi', '9696', 'Georges Ifrah', 'Ödünç Verilmiş'),
(8, 'Fahrenheit 451', '5555', 'Ray Bradbury', 'Hasarlı'),
(9, 'Savaş Sanatı', '1234', 'Sun Tzu', 'Hasarlı'),
(10, '1984', '0001', 'George Orwell', 'Uygun'),
(11, 'Köpeğinize Kuantum Fiziğini Nasıl Öğretirsiniz', '3333', 'Chad Orzel', 'Uygun'),
(12, 'Saatleri ayarlama Enstütüsü', '1111', 'Ahmet Hamdi Tanpınar', 'Hasarlı'),
(13, 'Bir Bilim Adamının Romanı', '5525', 'Oğuz Atay', 'Uygun');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici`
--

CREATE TABLE `kullanici` (
  `id` int(11) NOT NULL,
  `adSoyad` varchar(100) NOT NULL,
  `tc` varchar(11) NOT NULL,
  `tel` varchar(15) NOT NULL,
  `mail` varchar(30) NOT NULL,
  `adres` varchar(100) NOT NULL,
  `aTarih` varchar(20) NOT NULL,
  `vTarih` varchar(30) NOT NULL,
  `KAdi` varchar(100) NOT NULL,
  `kId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `kullanici`
--

INSERT INTO `kullanici` (`id`, `adSoyad`, `tc`, `tel`, `mail`, `adres`, `aTarih`, `vTarih`, `KAdi`, `kId`) VALUES
(1, 'şahsiyet', '123456789', '00000', 'mail', 'istanbul', '01-02--2023', '01-02--2023', 'Savaş sanatı ', 1),
(4, 'şahıs', '0000', '1234', 'mail', 'ankara', '23-02--2026', '23-02--2026', 'Simyacı', 6),
(5, 'kişi', '11111', '88888', 'mail', 'antalya', '04-02--2027', '04-02--2027', 'Rakamların Evrensel Tarihi', 7),
(7, 'birisi', '9999', '77777', 'mail', 'Gaziantep', '14-02--2027', '14-02--2027', 'Fahrenheit 451', 8);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personel`
--

CREATE TABLE `personel` (
  `id` int(11) NOT NULL,
  `adSoyad` varchar(100) NOT NULL,
  `tc` varchar(11) NOT NULL,
  `tel` varchar(15) NOT NULL,
  `mail` varchar(30) NOT NULL,
  `adres` varchar(1000) NOT NULL,
  `isBaslama` varchar(30) NOT NULL,
  `kadi` varchar(20) NOT NULL,
  `ksifre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `personel`
--

INSERT INTO `personel` (`id`, `adSoyad`, `tc`, `tel`, `mail`, `adres`, `isBaslama`, `kadi`, `ksifre`) VALUES
(1, 'Admin Admin', '0000', '99999', 'mail', 'Ankara', '10-06--2022', 'admin', '1234'),
(4, 'personel1', '00000', '11111', 'mail', 'istanbul', '03-02--2021', 'per1', '1234'),
(5, 'personel2', '8888', '9999', 'mail', 'Bursa', '01-02--2018', 'per2', '1234');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kitap`
--
ALTER TABLE `kitap`
  ADD PRIMARY KEY (`kId`);

--
-- Tablo için indeksler `kullanici`
--
ALTER TABLE `kullanici`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `personel`
--
ALTER TABLE `personel`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kitap`
--
ALTER TABLE `kitap`
  MODIFY `kId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Tablo için AUTO_INCREMENT değeri `kullanici`
--
ALTER TABLE `kullanici`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Tablo için AUTO_INCREMENT değeri `personel`
--
ALTER TABLE `personel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
