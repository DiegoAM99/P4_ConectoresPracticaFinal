-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-02-2019 a las 11:15:46
-- Versión del servidor: 10.1.29-MariaDB
-- Versión de PHP: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tienda_instrumentos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--
CREATE DATABASE IF NOT EXISTS tienda_instrumentos;
CREATE TABLE `clientes` (
  `DNI` varchar(245) COLLATE utf8_bin NOT NULL,
  `Nombre` varchar(115) COLLATE utf8_bin NOT NULL,
  `Apellidos` varchar(115) COLLATE utf8_bin NOT NULL,
  `Correo` varchar(115) COLLATE utf8_bin NOT NULL,
  `num_Contacto` int(10) NOT NULL,
  `Direccion` varchar(245) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`DNI`, `Nombre`, `Apellidos`, `Correo`, `num_Contacto`, `Direccion`) VALUES
('50247928', 'Diego', 'Alvarez', 'alvarezmd@hotmail.es', 605417542, 'C/Gran Via, 20'),
('50495658', 'Jorge', 'Cisneros', 'fraxit0@gmail.com', 615488459, 'C/Fraxit0, 22');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente_producto`
--

CREATE TABLE `cliente_producto` (
  `DNI_cliente` varchar(115) COLLATE utf8_bin NOT NULL,
  `id_producto` int(245) DEFAULT NULL,
  `marca_producto` varchar(115) COLLATE utf8_bin NOT NULL,
  `nombre_producto` varchar(115) COLLATE utf8_bin NOT NULL,
  `fecha_venta` year(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `cliente_producto`
--

INSERT INTO `cliente_producto` (`DNI_cliente`, `id_producto`, `marca_producto`, `nombre_producto`, `fecha_venta`) VALUES
('50247928', 1, 'Hohner', 'Flauta Travesera', 2012),
('50495658', 2, 'Hohner', 'Guitarra', 2010);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(115) NOT NULL,
  `nombre_producto` varchar(115) COLLATE utf8_bin NOT NULL,
  `marca` varchar(115) COLLATE utf8_bin NOT NULL,
  `fecha_venta` year(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `nombre_producto`, `marca`, `fecha_venta`) VALUES
(1, 'Flauta Travesera', 'Hohner', 2012),
(2, 'Guitarra', 'Hohner', 2010);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `cliente_producto`
--
ALTER TABLE `cliente_producto`
  ADD UNIQUE KEY `DNI_cliente` (`DNI_cliente`),
  ADD UNIQUE KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
