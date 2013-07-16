
CREATE DATABASE `byod` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `byod`.`device` (
  `DeviceID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `DeviceCompositeID` varchar(45) NOT NULL,
  `Make` varchar(45) NOT NULL,
  `Model` varchar(45) NOT NULL,
  `RegisteredDate` date NOT NULL,
  `Owner` int(10) unsigned NOT NULL,
  `employee_empID` int(10) unsigned NOT NULL,
  `employee_employeeCode` varchar(60) NOT NULL,
  PRIMARY KEY (`DeviceID`,`DeviceCompositeID`),
  UNIQUE KEY `idDevice_UNIQUE` (`DeviceID`),
  UNIQUE KEY `DeviceCompositeID_UNIQUE` (`DeviceCompositeID`),
  KEY `fk_device_employee1_idx` (`employee_empID`,`employee_employeeCode`),
  CONSTRAINT `fk_device_employee1` FOREIGN KEY (`employee_empID`, `employee_employeeCode`) REFERENCES `employee` (`empID`, `employeeCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `byod`.`employee` (
  `empID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `employeeCode` varchar(60) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `photo` blob,
  `dateRegistered` datetime NOT NULL,
  PRIMARY KEY (`empID`,`employeeCode`),
  UNIQUE KEY `userID_UNIQUE` (`empID`),
  UNIQUE KEY `employeeID_UNIQUE` (`employeeCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `byod`.`scanreport` (
  `ScanReportID` int(11) NOT NULL,
  `ScanDate` datetime NOT NULL,
  `ScanType` varchar(45) NOT NULL,
  `ScanScore` int(11) NOT NULL,
  `ScanDescription` varchar(500) NOT NULL,
  `device_DeviceID` int(11) unsigned NOT NULL,
  PRIMARY KEY (`ScanReportID`),
  UNIQUE KEY `ScanReportID_UNIQUE` (`ScanReportID`),
  KEY `fk_scanreport_device1_idx` (`device_DeviceID`),
  CONSTRAINT `fk_scanreport_device1` FOREIGN KEY (`device_DeviceID`) REFERENCES `device` (`DeviceID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `byod`.`technician` (
  `technicianID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `employeeCode` varchar(60) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `photo` blob,
  `dateRegistered` datetime NOT NULL,
  `admin` tinyint(1) NOT NULL,
  PRIMARY KEY (`technicianID`,`employeeCode`),
  UNIQUE KEY `userID_UNIQUE` (`technicianID`),
  UNIQUE KEY `employeeID_UNIQUE` (`employeeCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `byod`.`technician_employee` (
  `technician_technicianID` int(10) unsigned NOT NULL,
  `technician_employeeCode` varchar(60) NOT NULL,
  `employee_empID` int(10) unsigned NOT NULL,
  `employee_employeeCode` varchar(60) NOT NULL,
  KEY `fk_technician_employee_technician1_idx` (`technician_technicianID`,`technician_employeeCode`),
  KEY `fk_technician_employee_employee1_idx` (`employee_empID`,`employee_employeeCode`),
  CONSTRAINT `fk_technician_employee_employee1` FOREIGN KEY (`employee_empID`, `employee_employeeCode`) REFERENCES `employee` (`empID`, `employeeCode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_technician_employee_technician1` FOREIGN KEY (`technician_technicianID`, `technician_employeeCode`) REFERENCES `technician` (`technicianID`, `employeeCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



