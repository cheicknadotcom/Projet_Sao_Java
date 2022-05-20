-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 20 mai 2022 à 20:53
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `dbbank`
--

-- --------------------------------------------------------

--
-- Structure de la table `t_comptes`
--

DROP TABLE IF EXISTS `t_comptes`;
CREATE TABLE IF NOT EXISTS `t_comptes` (
  `id` int(11) NOT NULL,
  `solvabilite` int(11) NOT NULL,
  `numero` varchar(60) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `t_datagprs`
--

DROP TABLE IF EXISTS `t_datagprs`;
CREATE TABLE IF NOT EXISTS `t_datagprs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` varchar(60) NOT NULL,
  `numeroTel` varchar(60) NOT NULL,
  `type` varchar(60) NOT NULL,
  `services` varchar(60) NOT NULL,
  `services2` varchar(60) NOT NULL,
  `services3` varchar(60) NOT NULL,
  `services4` varchar(60) NOT NULL,
  `services5` varchar(60) NOT NULL,
  `data` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `t_datagprs`
--

INSERT INTO `t_datagprs` (`id`, `date`, `numeroTel`, `type`, `services`, `services2`, `services3`, `services4`, `services5`, `data`) VALUES
(1, '30/03/2022', '0022377162380', 'POSTPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(2, '30/03/2022', '0022377162284', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(3, '30/03/2022', '00221777767777', 'PREPAID', 'NON', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(4, '31/03/2022', '0022394406290', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(5, '31/03/2022', '0022647842', 'POSTPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(6, '31/03/2022', '0021278789898', 'POSTPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(7, '02/04/2022', '00221774437777', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(8, '02/04/2022', '00221774447774', 'POSTPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(9, '02/04/2022', '002247744372', 'PREPAID', 'NON', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(10, '02/04/2022', '00221778418993', 'PREPAID', 'NON', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(11, '03/04/2022', '0022477887799', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(12, '03/04/2022', '0022477887799', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(13, '03/04/2022', '0022377162280', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(14, '03/04/2022', '0022377162384', 'POSTPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(15, '04/04/2022', '0022377899898', 'POSTPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(16, '05/04/2022', '0022377899899', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(17, '18/04/2022', '0022277162380', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(18, '22/04/2022', '002237717093', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(19, '23/04/2022', '0022377170853', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(20, '23/04/2022', '0022177170953', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(21, '24/04/2022', '0022377162280', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(22, '20/0/2022', '00223 77 16 23 80', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1);

-- --------------------------------------------------------

--
-- Structure de la table `t_datahlr`
--

DROP TABLE IF EXISTS `t_datahlr`;
CREATE TABLE IF NOT EXISTS `t_datahlr` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` varchar(60) NOT NULL,
  `numeroTel` varchar(60) NOT NULL,
  `type` varchar(60) NOT NULL,
  `services` varchar(60) NOT NULL,
  `services2` varchar(60) NOT NULL,
  `services3` varchar(60) NOT NULL,
  `services4` varchar(60) NOT NULL,
  `services5` varchar(60) NOT NULL,
  `data` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `t_datahlr`
--

INSERT INTO `t_datahlr` (`id`, `date`, `numeroTel`, `type`, `services`, `services2`, `services3`, `services4`, `services5`, `data`) VALUES
(15, '02/04/2022', '002227787984', 'PREPAID', 'NON', 'NON', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 0),
(3, '30/03/2022', '00221767689385', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(4, '30/03/2022', '00221774435752', 'POSTPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 0),
(5, '30/03/2022', '0022377162380', 'POSTPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(6, '30/03/2022', '0022377162284', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(7, '30/03/2022', '00221777767777', 'PREPAID', 'NON', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(8, '31/03/2022', '0022394406290', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(11, '02/04/2022', '00221774437777', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(12, '02/04/2022', '00221774447774', 'POSTPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(13, '02/04/2022', '002247744372', 'PREPAID', 'NON', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(14, '02/04/2022', '00221778418993', 'PREPAID', 'NON', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(16, '03/04/2022', '0022477887799', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(17, '03/04/2022', '0022477887799', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(18, '03/04/2022', '0022377162280', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(19, '03/04/2022', '0022377162384', 'POSTPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(20, '04/04/2022', '0022677889944', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(21, '04/04/2022', '0022377899898', 'POSTPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(22, '05/04/2022', '0022377899899', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(23, '18/04/2022', '0022277162380', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(24, '22/04/2022', '002237717093', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(25, '23/04/2022', '0022377170853', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(26, '23/04/2022', '0022177170953', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(27, '24/04/2022', '0022377162280', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(28, '20/0/2022', '00223 77 16 23 80', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1);

-- --------------------------------------------------------

--
-- Structure de la table `t_datain`
--

DROP TABLE IF EXISTS `t_datain`;
CREATE TABLE IF NOT EXISTS `t_datain` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` varchar(60) NOT NULL,
  `numeroTel` varchar(60) NOT NULL,
  `type` varchar(60) NOT NULL,
  `services` varchar(60) NOT NULL,
  `services2` varchar(60) NOT NULL,
  `services3` varchar(60) NOT NULL,
  `services4` varchar(60) NOT NULL,
  `services5` varchar(60) NOT NULL,
  `data` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `t_datain`
--

INSERT INTO `t_datain` (`id`, `date`, `numeroTel`, `type`, `services`, `services2`, `services3`, `services4`, `services5`, `data`) VALUES
(15, '23/04/2022', '0022177170953', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(6, '02/04/2022', '00221778418993', 'PREPAID', 'NON', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1),
(11, '05/04/2022', '0022377899899', 'PREPAID', 'SMS', 'APPEL', 'HOTLINE', 'RENVOIAPPEL', 'ROAMING', 1);

-- --------------------------------------------------------

--
-- Structure de la table `t_demandes`
--

DROP TABLE IF EXISTS `t_demandes`;
CREATE TABLE IF NOT EXISTS `t_demandes` (
  `id` int(11) NOT NULL,
  `numeroCompte` varchar(60) NOT NULL,
  `montant` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
CREATE TABLE IF NOT EXISTS `t_user` (
  `identifiant` int(11) NOT NULL,
  `login` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `t_user`
--

INSERT INTO `t_user` (`identifiant`, `login`, `password`) VALUES
(1, 'cheickna', 'cheick'),
(2, 'cheick', 'cheick');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
