-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.7.13-log - MySQL Community Server (GPL)
-- SO del servidor:              Win32
-- HeidiSQL Versión:             11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para nomina
DROP DATABASE IF EXISTS `nomina`;
CREATE DATABASE IF NOT EXISTS `nomina` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `nomina`;

-- Volcando estructura para tabla nomina.categorias
DROP TABLE IF EXISTS `categorias`;
CREATE TABLE IF NOT EXISTS `categorias` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `salario_base` double NOT NULL DEFAULT '0',
  `puesto_destino` varchar(100) NOT NULL,
  `estado` int(11) NOT NULL,
  `fecha_registro` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla nomina.categorias: ~7 rows (aproximadamente)
DELETE FROM `categorias`;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
INSERT INTO `categorias` (`id`, `nombre`, `salario_base`, `puesto_destino`, `estado`, `fecha_registro`) VALUES
	(19, 'ADMINISTRACIÓN', 1000000, 'RECEPCIONISTA', 2, '2021-02-02'),
	(20, 'ADMINISTRACIÓN', 1000000, 'SECRETARIA', 2, '2021-02-02'),
	(21, 'ADMINISTRACIÓN', 1000000, 'VIGILANTE', 1, '2021-02-02'),
	(22, 'PRODUCCIÓN', 1000000, 'SUPERVISOR', 2, '2021-04-03'),
	(23, 'FINANZAS', 5000000, 'CONTADOR', 1, '2021-02-03'),
	(24, 'FINANZAS', 4000000, 'DIRECTOR FINANCIERO', 1, '2021-02-03'),
	(25, 'ADMINISTRACIÓN', 1000000, 'AUXILIAR', 1, '2021-02-19');
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;

-- Volcando estructura para tabla nomina.complementos
DROP TABLE IF EXISTS `complementos`;
CREATE TABLE IF NOT EXISTS `complementos` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `valor` double NOT NULL DEFAULT '0',
  `descripcion` varchar(100) NOT NULL,
  `estado` varchar(100) NOT NULL,
  `fecha_registro` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla nomina.complementos: ~4 rows (aproximadamente)
DELETE FROM `complementos`;
/*!40000 ALTER TABLE `complementos` DISABLE KEYS */;
INSERT INTO `complementos` (`id`, `nombre`, `valor`, `descripcion`, `estado`, `fecha_registro`) VALUES
	(1, 'TRIENIO (50%)', 50, 'UN SALARIO CADA 3 AÑOS', '1', '2021-02-19'),
	(2, 'TRIENIO (75%)', 75, 'UN SALARIO CADA 3 AÑOS', '1', '2021-02-19'),
	(3, 'TRIENIO (100%)', 100, 'UN SALARIO CADA 3 AÑOS', '1', '2021-02-19'),
	(4, 'SIN COMPLEMENTO', 0, 'SIN COMPLEMENTO', '1', '2021-02-19');
/*!40000 ALTER TABLE `complementos` ENABLE KEYS */;

-- Volcando estructura para tabla nomina.contratos
DROP TABLE IF EXISTS `contratos`;
CREATE TABLE IF NOT EXISTS `contratos` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `id_empleado` int(11) NOT NULL,
  `id_categoria` int(11) NOT NULL,
  `id_complemento` int(11) NOT NULL,
  `fecha_alta` varchar(50) NOT NULL DEFAULT '',
  `fecha_baja` varchar(50) NOT NULL DEFAULT '',
  `fecha_registro` varchar(50) NOT NULL DEFAULT '',
  `estado` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_empleado` (`id_empleado`),
  KEY `FK_caregoria` (`id_categoria`),
  KEY `FK3_complemento` (`id_complemento`),
  CONSTRAINT `FK3_complemento` FOREIGN KEY (`id_complemento`) REFERENCES `complementos` (`id`),
  CONSTRAINT `FK_caregoria` FOREIGN KEY (`id_categoria`) REFERENCES `categorias` (`id`),
  CONSTRAINT `FK_empleado` FOREIGN KEY (`id_empleado`) REFERENCES `empleados` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla nomina.contratos: ~1 rows (aproximadamente)
DELETE FROM `contratos`;
/*!40000 ALTER TABLE `contratos` DISABLE KEYS */;
INSERT INTO `contratos` (`id`, `id_empleado`, `id_categoria`, `id_complemento`, `fecha_alta`, `fecha_baja`, `fecha_registro`, `estado`) VALUES
	(1, 1, 21, 3, '2017-02-01', '', '2021-02-19', 1);
/*!40000 ALTER TABLE `contratos` ENABLE KEYS */;

-- Volcando estructura para tabla nomina.deducciones
DROP TABLE IF EXISTS `deducciones`;
CREATE TABLE IF NOT EXISTS `deducciones` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `valor` double(20,2) NOT NULL DEFAULT '0.00',
  `rango_inicial` double(20,2) NOT NULL DEFAULT '0.00',
  `rango_final` double(20,2) NOT NULL DEFAULT '0.00',
  `estado` int(11) NOT NULL DEFAULT '0',
  `fecha_registro` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla nomina.deducciones: ~8 rows (aproximadamente)
DELETE FROM `deducciones`;
/*!40000 ALTER TABLE `deducciones` DISABLE KEYS */;
INSERT INTO `deducciones` (`id`, `nombre`, `descripcion`, `valor`, `rango_inicial`, `rango_final`, `estado`, `fecha_registro`) VALUES
	(1, 'CONTINGENCIAS COMUNES (2021)', 'CONTINGENCIAS COMUNES (2021)', 4.70, 0.00, 0.00, 1, '2021-02-19'),
	(2, 'IRPF (24%)', 'IRPF (24%)', 24.00, 4500.00, 17000.00, 1, '2021-02-19'),
	(3, 'IRPF (28%)', 'IRPF (28%)', 28.00, 17001.00, 32000.00, 1, '2021-02-19'),
	(4, 'IRPF (37%)', 'IRPF (37%)', 37.00, 32001.00, 52000.00, 1, '2021-02-19'),
	(5, 'IRPF (43%)', 'IRPF (43%)', 43.00, 52000.00, 999999999999.00, 1, '2021-02-19'),
	(6, 'APORTACIONES A LA S.S (4%)', 'APORTACIONES A LA S.S (4%)', 4.00, 0.00, 0.00, 1, '2021-02-19'),
	(7, 'DESEMPLEO (2%)', 'DESEMPLEO (2%)', 2.00, 0.00, 0.00, 1, '2021-02-19'),
	(8, 'FORMACIÓN PROFESIONAL (2%)', 'FORMACIÓN PROFESIONAL (2%)', 2.00, 0.00, 0.00, 1, '2021-02-19');
/*!40000 ALTER TABLE `deducciones` ENABLE KEYS */;

-- Volcando estructura para tabla nomina.detalle_contrato_complemento
DROP TABLE IF EXISTS `detalle_contrato_complemento`;
CREATE TABLE IF NOT EXISTS `detalle_contrato_complemento` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `id_contrato` int(100) NOT NULL,
  `id_complemento` int(100) NOT NULL,
  `estado` int(11) NOT NULL,
  `fecha_registro` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  KEY `FK_contrato` (`id_contrato`),
  KEY `FK_complement` (`id_complemento`),
  CONSTRAINT `FK_complement` FOREIGN KEY (`id_complemento`) REFERENCES `complementos` (`id`),
  CONSTRAINT `FK_contrato` FOREIGN KEY (`id_contrato`) REFERENCES `contratos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla nomina.detalle_contrato_complemento: ~0 rows (aproximadamente)
DELETE FROM `detalle_contrato_complemento`;
/*!40000 ALTER TABLE `detalle_contrato_complemento` DISABLE KEYS */;
INSERT INTO `detalle_contrato_complemento` (`id`, `id_contrato`, `id_complemento`, `estado`, `fecha_registro`) VALUES
	(1, 1, 3, 1, '2020-19-02');
/*!40000 ALTER TABLE `detalle_contrato_complemento` ENABLE KEYS */;

-- Volcando estructura para tabla nomina.detalle_nomina_empleado
DROP TABLE IF EXISTS `detalle_nomina_empleado`;
CREATE TABLE IF NOT EXISTS `detalle_nomina_empleado` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `id_empleado` int(100) NOT NULL,
  `id_nomina` int(100) NOT NULL,
  `concepto` varchar(255) NOT NULL DEFAULT '',
  `valor` decimal(20,2) NOT NULL DEFAULT '0.00',
  `estado` int(11) NOT NULL,
  `fecha_registro` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_empleado_id_nomina_concepto` (`id_empleado`,`id_nomina`,`concepto`),
  KEY `FK_nomina` (`id_nomina`),
  KEY `FK_emplead` (`id_empleado`),
  CONSTRAINT `FK_emplead` FOREIGN KEY (`id_empleado`) REFERENCES `empleados` (`id`),
  CONSTRAINT `FK_nomina` FOREIGN KEY (`id_nomina`) REFERENCES `nominas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla nomina.detalle_nomina_empleado: ~6 rows (aproximadamente)
DELETE FROM `detalle_nomina_empleado`;
/*!40000 ALTER TABLE `detalle_nomina_empleado` DISABLE KEYS */;
INSERT INTO `detalle_nomina_empleado` (`id`, `id_empleado`, `id_nomina`, `concepto`, `valor`, `estado`, `fecha_registro`) VALUES
	(1, 1, 1, 'SALARIO DEVENGADO', 1033333.33, 1, '2021-02-19'),
	(2, 1, 1, 'CONTINGENCIAS COMUNES (2021)', -48566.67, 1, '2021-02-19'),
	(3, 1, 1, 'APORTACIONES A LA S.S (4%)', -41333.33, 1, '2021-02-19'),
	(4, 1, 1, 'DESEMPLEO (2%)', -20666.67, 1, '2021-02-19'),
	(5, 1, 1, 'FORMACIÓN PROFESIONAL (2%)', -20666.67, 1, '2021-02-19'),
	(20, 1, 1, 'IRPF (43%)', -444333.33, 1, '2021-02-19');
/*!40000 ALTER TABLE `detalle_nomina_empleado` ENABLE KEYS */;

-- Volcando estructura para tabla nomina.empleados
DROP TABLE IF EXISTS `empleados`;
CREATE TABLE IF NOT EXISTS `empleados` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `dni` varchar(100) NOT NULL,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `telefono` varchar(100) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `estado` int(11) NOT NULL,
  `cuenta_corriente` varchar(255) NOT NULL DEFAULT '',
  `fecha_registro` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla nomina.empleados: ~1 rows (aproximadamente)
DELETE FROM `empleados`;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` (`id`, `dni`, `nombres`, `apellidos`, `telefono`, `direccion`, `estado`, `cuenta_corriente`, `fecha_registro`) VALUES
	(1, '1143339923', 'LUIFER', 'VILLA LOZANO', '3016733590', 'Conjunto Residencial Brisas de Galicia Apto 210 Bloque i', 1, '123', '2021-02-19');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;

-- Volcando estructura para tabla nomina.nominas
DROP TABLE IF EXISTS `nominas`;
CREATE TABLE IF NOT EXISTS `nominas` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `fecha_ini` varchar(50) NOT NULL DEFAULT '',
  `fecha_fin` varchar(50) DEFAULT NULL,
  `encargado` varchar(100) NOT NULL,
  `total_pagar` double NOT NULL DEFAULT '0',
  `estado` int(100) NOT NULL,
  `fecha_registro` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla nomina.nominas: ~1 rows (aproximadamente)
DELETE FROM `nominas`;
/*!40000 ALTER TABLE `nominas` DISABLE KEYS */;
INSERT INTO `nominas` (`id`, `fecha_ini`, `fecha_fin`, `encargado`, `total_pagar`, `estado`, `fecha_registro`) VALUES
	(1, '2020-10-01', '2020-11-01', 'DUBAN SILGADO', 0, 1, '2021-02-19');
/*!40000 ALTER TABLE `nominas` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
