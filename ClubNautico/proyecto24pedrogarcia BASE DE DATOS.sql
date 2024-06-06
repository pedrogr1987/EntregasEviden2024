-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-06-2024 a las 13:35:54
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto24pedrogarcia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `barco`
--

DROP TABLE IF EXISTS `barco`;
CREATE TABLE `barco` (
  `Matricula` varchar(10) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Numamarre` int(3) NOT NULL,
  `Cuota` float NOT NULL,
  `socio` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `barco`
--

INSERT INTO `barco` (`Matricula`, `Nombre`, `Numamarre`, `Cuota`, `socio`) VALUES
('1325MUY', 'Escorbuto caribeño', 122, 150.9, '1'),
('1354LLM', 'La gamba Borracha', 185, 125.2, '2'),
('1652KLS', 'La joya del Guadalquivir', 124, 125.5, '1'),
('1999DLS', 'El barco de Yisus', 666, 999.4, '3'),
('7651LKJ', 'El barco de Chanquete', 123, 200.6, '2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `patron`
--

DROP TABLE IF EXISTS `patron`;
CREATE TABLE `patron` (
  `DNI` varchar(9) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellidos` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `patron`
--

INSERT INTO `patron` (`DNI`, `Nombre`, `Apellidos`) VALUES
('11223344A', 'Antonio', 'Sepia'),
('12345668M', 'Jesús Manuel', 'Luna Cordero'),
('12345678M', 'Juan', 'Pescaito'),
('44332211A', 'Marta', 'Caramerluza');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salida`
--

DROP TABLE IF EXISTS `salida`;
CREATE TABLE `salida` (
  `id` int(11) NOT NULL,
  `Fecha` varchar(10) NOT NULL,
  `Hora` varchar(6) NOT NULL,
  `Destino` varchar(50) NOT NULL,
  `Patron` varchar(9) NOT NULL,
  `Barco` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `salida`
--

INSERT INTO `salida` (`id`, `Fecha`, `Hora`, `Destino`, `Patron`, `Barco`) VALUES
(1, '2024/05/25', '12:05', 'Canarias', '44332211A', '7651LKJ'),
(2, '2024/05/20', '10:32', 'Tortuga', '12345678M', '1354LLM'),
(52, '2024/07/05', '08:25', 'Cuba', '12345668M', '1999DLS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socio`
--

DROP TABLE IF EXISTS `socio`;
CREATE TABLE `socio` (
  `id` varchar(4) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `DNI` varchar(9) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish_ci;

--
-- Volcado de datos para la tabla `socio`
--

INSERT INTO `socio` (`id`, `DNI`) VALUES
('1', '11223344A'),
('2', '12345678M'),
('3', '12345668M');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `barco`
--
ALTER TABLE `barco`
  ADD PRIMARY KEY (`Matricula`),
  ADD KEY `socio` (`socio`);

--
-- Indices de la tabla `patron`
--
ALTER TABLE `patron`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `salida`
--
ALTER TABLE `salida`
  ADD PRIMARY KEY (`id`,`Patron`,`Barco`) USING BTREE,
  ADD KEY `Barco` (`Barco`),
  ADD KEY `Patron` (`Patron`);

--
-- Indices de la tabla `socio`
--
ALTER TABLE `socio`
  ADD PRIMARY KEY (`id`,`DNI`) USING BTREE,
  ADD KEY `DNI` (`DNI`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `barco`
--
ALTER TABLE `barco`
  ADD CONSTRAINT `FKtcbqk9kcu1me66rt0a0h0murm` FOREIGN KEY (`socio`) REFERENCES `socio` (`id`);

--
-- Filtros para la tabla `salida`
--
ALTER TABLE `salida`
  ADD CONSTRAINT `salida_ibfk_1` FOREIGN KEY (`Barco`) REFERENCES `barco` (`Matricula`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `salida_ibfk_2` FOREIGN KEY (`Patron`) REFERENCES `patron` (`DNI`);

--
-- Filtros para la tabla `socio`
--
ALTER TABLE `socio`
  ADD CONSTRAINT `socio_ibfk_1` FOREIGN KEY (`Barco`) REFERENCES `barco` (`Matricula`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `socio_ibfk_2` FOREIGN KEY (`DNI`) REFERENCES `patron` (`DNI`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
