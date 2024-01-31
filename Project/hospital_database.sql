-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 31, 2024 at 04:01 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `apn_info`
--

CREATE TABLE `apn_info` (
  `id` int(10) NOT NULL,
  `pname` varchar(20) DEFAULT NULL,
  `dname` varchar(20) DEFAULT NULL,
  `dspec` varchar(20) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `apn_info`
--

INSERT INTO `apn_info` (`id`, `pname`, `dname`, `dspec`, `date`, `time`) VALUES
(6, 'sagar umretiya', 'Doc1', 'Brain surgery', '2024-01-01', '10:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `doc_info`
--

CREATE TABLE `doc_info` (
  `id` int(10) NOT NULL,
  `dname` varchar(20) DEFAULT NULL,
  `specialization` varchar(20) DEFAULT NULL,
  `psswd` varchar(20) DEFAULT NULL,
  `street` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `doc_info`
--

INSERT INTO `doc_info` (`id`, `dname`, `specialization`, `psswd`, `street`, `location`, `gender`) VALUES
(3, 'Doc1', 'Brain Surgery', '123', 'abc', 'Rajkot', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `patients_info`
--

CREATE TABLE `patients_info` (
  `id` int(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `contact_no` decimal(10,0) DEFAULT NULL,
  `street` varchar(50) DEFAULT NULL,
  `location` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patients_info`
--

INSERT INTO `patients_info` (`id`, `name`, `email`, `contact_no`, `street`, `location`, `gender`, `password`) VALUES
(1, 'sagar umretiya', 'sagarumrtiya@gmail.com', 8866942646, 'a', 'Rajkot', 'gender', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `apn_info`
--
ALTER TABLE `apn_info`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `doc_info`
--
ALTER TABLE `doc_info`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `patients_info`
--
ALTER TABLE `patients_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `apn_info`
--
ALTER TABLE `apn_info`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `doc_info`
--
ALTER TABLE `doc_info`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `patients_info`
--
ALTER TABLE `patients_info`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
