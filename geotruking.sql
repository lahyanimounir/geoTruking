-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : Dim 13 juin 2021 à 23:30
-- Version du serveur :  8.0.21
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `geotruking`
--

-- --------------------------------------------------------

--
-- Structure de la table `camion`
--

DROP TABLE IF EXISTS `camion`;
CREATE TABLE IF NOT EXISTS `camion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `immatriculation` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `mission`
--

DROP TABLE IF EXISTS `mission`;
CREATE TABLE IF NOT EXISTS `mission` (
  `id` int NOT NULL AUTO_INCREMENT,
  `consommation_capter` double(15,3) DEFAULT NULL,
  `long` varchar(20) DEFAULT NULL,
  `isArrived` tinyint(1) DEFAULT NULL,
  `date_depart` date DEFAULT NULL,
  `date_arriver` int DEFAULT NULL,
  `id_conducteur` int NOT NULL,
  `id_ville_depart` int NOT NULL,
  `lat` varchar(20) NOT NULL,
  `id_ville_arriver` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_conducteur` (`id_conducteur`),
  KEY `id_ville` (`id_ville_depart`),
  KEY `id_ville_arriver` (`id_ville_arriver`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `persone`
--

DROP TABLE IF EXISTS `persone`;
CREATE TABLE IF NOT EXISTS `persone` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) DEFAULT NULL,
  `prenom` varchar(20) DEFAULT NULL,
  `login` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `role` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `persone`
--

INSERT INTO `persone` (`id`, `nom`, `prenom`, `login`, `password`, `role`) VALUES
(1, 'lahyani', 'mounir', 'lahyani', 'lahyani', 1),
(2, 'brahim', 'ait ali', 'brahim', '123456', 0);

-- --------------------------------------------------------

--
-- Structure de la table `suivi`
--

DROP TABLE IF EXISTS `suivi`;
CREATE TABLE IF NOT EXISTS `suivi` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_camion` int NOT NULL,
  `id_mission` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_camion` (`id_camion`),
  KEY `id_mission` (`id_mission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `ville`
--

DROP TABLE IF EXISTS `ville`;
CREATE TABLE IF NOT EXISTS `ville` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `ville`
--

INSERT INTO `ville` (`id`, `nom`) VALUES
(1, 'Rabat'),
(15, 'Témara');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `mission`
--
ALTER TABLE `mission`
  ADD CONSTRAINT `mission_fk` FOREIGN KEY (`id_conducteur`) REFERENCES `persone` (`id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `mission_fk1` FOREIGN KEY (`id_ville_depart`) REFERENCES `ville` (`id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `mission_fk2` FOREIGN KEY (`id_ville_arriver`) REFERENCES `ville` (`id`) ON UPDATE CASCADE;

--
-- Contraintes pour la table `suivi`
--
ALTER TABLE `suivi`
  ADD CONSTRAINT `suivi_fk` FOREIGN KEY (`id_camion`) REFERENCES `camion` (`id`),
  ADD CONSTRAINT `suivi_fk1` FOREIGN KEY (`id_mission`) REFERENCES `mission` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
