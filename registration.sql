-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 23, 2022 at 02:30 PM
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
-- Database: `registration`
--

-- --------------------------------------------------------

--
-- Table structure for table `user_register`
--

CREATE TABLE `user_register` (
  `ID` int(20) NOT NULL,
  `USER_NAME` varchar(20) NOT NULL,
  `PHONE` varchar(10) NOT NULL,
  `ADDRESS` varchar(100) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  `CON_PASSWORD` varchar(200) NOT NULL,
  `STATE` varchar(100) NOT NULL,
  `DISTRICT` varchar(100) NOT NULL,
  `TALUKA` varchar(100) NOT NULL,
  `VILLEAGE` varchar(100) NOT NULL,
  `PIN_CODE` varchar(6) NOT NULL,
  `GENDER` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_register`
--

INSERT INTO `user_register` (`ID`, `USER_NAME`, `PHONE`, `ADDRESS`, `PASSWORD`, `CON_PASSWORD`, `STATE`, `DISTRICT`, `TALUKA`, `VILLEAGE`, `PIN_CODE`, `GENDER`) VALUES
(60, 'ANIKET', '7757960401', 'RAMVADI', '1234', '1234', 'MAHARASHTRA', 'PUNE', 'INDAPUR', 'VADAPURI', '413106', 'Male'),
(61, 'AKSHAY', '9730828021', 'KORATKAR VASTI', '12345', '12345', 'MAHA', 'PUNE', 'INDAPUR', 'SURWAD', '413103', 'Male'),
(62, 'DHIRAJ', '9999999999', 'BARAMATI', 'DH@123', 'DH@123', 'MAHARASHTRA', 'PUNE', 'BARAMATI', 'BARAMATI', '121212', 'Male'),
(63, 'ASHWINI', '9999999999', 'KKKKKK', '9999', '9999', 'MMMMMMMMM', 'MMMMMMM', 'MMMMMMM', 'MMMMM', '999999', 'Female'),
(64, 'MAHESHKUMAR M BHALE', '9850601522', 'SURWAD', '1986', '1986', 'MAHARASTRA', 'PUNE', 'INDAPUR', 'SURWAD', '413106', 'Male'),
(65, 'AVINASH', '7664765476', 'SURWAD', 'AVI@123', 'AVI@123', 'MAHARASHTRA', 'PUNE', 'INDAPUR', 'SURWAD', '413103', 'Male'),
(66, 'avinash', '9975139956', 'surwad', '12345', '12345', 'maharastra', 'pune', 'indapur', 'surwad', '413103', 'Male');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_register`
--
ALTER TABLE `user_register`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user_register`
--
ALTER TABLE `user_register`
  MODIFY `ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
