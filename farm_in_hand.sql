-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 23, 2022 at 02:29 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `farm in hand`
--

-- --------------------------------------------------------

--
-- Table structure for table `akluj_update`
--

CREATE TABLE `akluj_update` (
  `ID` int(200) NOT NULL,
  `NAME` varchar(200) NOT NULL,
  `RATE` varchar(200) NOT NULL,
  `DAY` varchar(200) NOT NULL,
  `MONTH` varchar(200) NOT NULL,
  `YEAR` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `akluj_update`
--

INSERT INTO `akluj_update` (`ID`, `NAME`, `RATE`, `DAY`, `MONTH`, `YEAR`) VALUES
(1, 'TUR DAL', '3700', '02', 'FEB', '2022'),
(2, 'MAKKA', '1150', '02', 'FEB', '2022'),
(3, 'JWAR', '1150', '02', 'FEB', '2022'),
(4, 'BAJRA', '1100', '02', 'FEB', '2022'),
(5, 'SOYABIN', '4600', '02', 'FEB', '2022');

-- --------------------------------------------------------

--
-- Table structure for table `bmt_update`
--

CREATE TABLE `bmt_update` (
  `ID` int(200) NOT NULL,
  `NAME` varchar(200) NOT NULL,
  `RATE` varchar(200) NOT NULL,
  `DAY` varchar(200) NOT NULL,
  `MONTH` varchar(200) NOT NULL,
  `YEAR` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bmt_update`
--

INSERT INTO `bmt_update` (`ID`, `NAME`, `RATE`, `DAY`, `MONTH`, `YEAR`) VALUES
(1, 'TUR DAL', '3500', '02', 'FEB', '2022'),
(2, 'MAKKA', '1350', '02', 'FEB', '2022'),
(3, 'JWAR', '1000', '02', 'FEB', '2022'),
(4, 'BAJRA', '1230', '02', 'FEB', '2022'),
(5, 'SOYABIN', '4500', '02', 'FEB', '2022'),
(6, 'APPLE', '4510', '02', 'FEB', '2021'),
(7, 'KAJU', '20000', '12', 'APRIL', '2022'),
(9, 'ABC', '12000', '1', 'FEB', '2022');

-- --------------------------------------------------------

--
-- Table structure for table `gust_data`
--

CREATE TABLE `gust_data` (
  `ID` int(250) NOT NULL,
  `NAME` varchar(200) NOT NULL,
  `PHONE` varchar(200) NOT NULL,
  `GENDER` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gust_data`
--

INSERT INTO `gust_data` (`ID`, `NAME`, `PHONE`, `GENDER`) VALUES
(20, 'AVI', '1111111111', 'MALE');

-- --------------------------------------------------------

--
-- Table structure for table `host_page`
--

CREATE TABLE `host_page` (
  `ID` int(250) NOT NULL,
  `FIRST NAME` varchar(200) NOT NULL,
  `LAST NAME` varchar(200) NOT NULL,
  `USER ID` varchar(200) NOT NULL,
  `PASSWORD` varchar(200) NOT NULL,
  `CON PASSWORD` varchar(200) NOT NULL,
  `LICENCE NO` varchar(200) NOT NULL,
  `ISSUED AUTHORITY` varchar(200) NOT NULL,
  `MOBILE NO` varchar(200) NOT NULL,
  `PAN NO` varchar(200) NOT NULL,
  `APMC NAME` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `host_page`
--

INSERT INTO `host_page` (`ID`, `FIRST NAME`, `LAST NAME`, `USER ID`, `PASSWORD`, `CON PASSWORD`, `LICENCE NO`, `ISSUED AUTHORITY`, `MOBILE NO`, `PAN NO`, `APMC NAME`) VALUES
(13, 'AVINASH', 'SHEMNE', 'AVI', 'AVI@123', 'AVI@123', '999999', 'SDO', '5555555555', '111111111111', 'INDAPUR APMC');

-- --------------------------------------------------------

--
-- Table structure for table `indapur_update`
--

CREATE TABLE `indapur_update` (
  `ID` int(200) NOT NULL,
  `NAME` varchar(200) NOT NULL,
  `RATE` varchar(200) NOT NULL,
  `DAY` varchar(200) NOT NULL,
  `MONTH` varchar(200) NOT NULL,
  `YEAR` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `indapur_update`
--

INSERT INTO `indapur_update` (`ID`, `NAME`, `RATE`, `DAY`, `MONTH`, `YEAR`) VALUES
(1, 'TUR DAL', '1500', '01', 'FEB', '2022'),
(2, 'MAKKA', '1100', '01', 'FEB', '2022'),
(3, 'JWAR', '1000', '01', 'FEB', '2022'),
(4, 'BAJRA', '1200', '01', 'FEB', '2022'),
(5, 'SOYABIN', '1500', '01', 'FEB', '2022');

-- --------------------------------------------------------

--
-- Table structure for table `registered data`
--

CREATE TABLE `registered data` (
  `ID` int(250) NOT NULL,
  `USER_NAME` varchar(250) NOT NULL,
  `PHONE` varchar(250) NOT NULL,
  `ADDRESS` varchar(250) NOT NULL,
  `PASSWORD` varchar(250) NOT NULL,
  `CON_PASSWORD` varchar(250) NOT NULL,
  `STATE` varchar(250) NOT NULL,
  `DISTRICT` varchar(250) NOT NULL,
  `TALUKA` varchar(250) NOT NULL,
  `VILLEAGE` varchar(250) NOT NULL,
  `PIN_CODE` varchar(250) NOT NULL,
  `GENDER` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akluj_update`
--
ALTER TABLE `akluj_update`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `bmt_update`
--
ALTER TABLE `bmt_update`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `gust_data`
--
ALTER TABLE `gust_data`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `host_page`
--
ALTER TABLE `host_page`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `indapur_update`
--
ALTER TABLE `indapur_update`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `registered data`
--
ALTER TABLE `registered data`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `akluj_update`
--
ALTER TABLE `akluj_update`
  MODIFY `ID` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `bmt_update`
--
ALTER TABLE `bmt_update`
  MODIFY `ID` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=100;

--
-- AUTO_INCREMENT for table `gust_data`
--
ALTER TABLE `gust_data`
  MODIFY `ID` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `host_page`
--
ALTER TABLE `host_page`
  MODIFY `ID` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `indapur_update`
--
ALTER TABLE `indapur_update`
  MODIFY `ID` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `registered data`
--
ALTER TABLE `registered data`
  MODIFY `ID` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
