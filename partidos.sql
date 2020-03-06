-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 06, 2020 at 06:02 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `partidos`
--

-- --------------------------------------------------------

--
-- Table structure for table `partido`
--

CREATE TABLE `partido` (
  `id_partido` int(11) NOT NULL,
  `equipo1` varchar(45) NOT NULL,
  `equipo2` varchar(45) NOT NULL,
  `jugadores` int(11) NOT NULL,
  `tarjetas_amarillas` int(11) NOT NULL,
  `goles` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `partido`
--

INSERT INTO `partido` (`id_partido`, `equipo1`, `equipo2`, `jugadores`, `tarjetas_amarillas`, `goles`) VALUES
(1, 'Real Madrid', 'Barcelona', 22, 5, 3),
(2, 'Juventus', 'Galaxy', 7, 1, 8),
(4, 'Barcelona', 'Juventus', 22, 0, 8),
(5, 'Barcelona', 'Juventus', 22, 0, 8),
(6, 'Barcelona', 'Juventus', 22, 0, 8),
(7, 'Barcelona', 'Juventus', 22, 0, 8),
(8, 'Barcelona', 'Juventus', 22, 0, 8),
(9, 'Barcelona', 'Juventus', 22, 0, 8),
(10, 'Barcelona', 'Juventus', 22, 0, 8),
(11, 'Barcelona', 'Juventus', 22, 0, 8),
(12, 'Barcelona', 'Juventus', 22, 0, 8),
(13, 'Barcelona', 'Juventus', 22, 0, 8),
(14, 'Barcelona', 'Juventus', 22, 0, 8),
(15, 'Barcelona', 'Juventus', 22, 0, 8);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `partido`
--
ALTER TABLE `partido`
  ADD PRIMARY KEY (`id_partido`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `partido`
--
ALTER TABLE `partido`
  MODIFY `id_partido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
