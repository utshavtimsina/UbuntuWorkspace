-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 20, 2019 at 07:40 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `form`
--

-- --------------------------------------------------------

--
-- Table structure for table `answer`
--

CREATE TABLE `answer` (
  `a_id` int(11) NOT NULL,
  `a_description` varchar(255) DEFAULT NULL,
  `a_name` varchar(255) DEFAULT NULL,
  `question_q_id` int(11) DEFAULT NULL,
  `sub_question_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `answer`
--

INSERT INTO `answer` (`a_id`, `a_description`, `a_name`, `question_q_id`, `sub_question_id`) VALUES
(1, 'Satisfied', 'A1', 1, 0),
(2, 'Somewhat satisfied', 'A2', 1, 0),
(4, 'Neither satisfied nor dissatisfied', 'A3', 1, 0),
(5, 'Somewhat dissatisfied', 'A4', 1, 0),
(6, 'Dissatisfied', 'A5', 1, 0),
(87, 'Agree', NULL, 84, 2),
(88, 'Somewhat agree', NULL, 84, 3),
(89, 'Somewhat agree', NULL, 84, 2),
(90, 'Neither agree nor disagree', NULL, 84, 2),
(91, 'Somewhat disagree', NULL, 84, 2),
(92, 'Disagree', NULL, 84, 2),
(165, 'Excellent', NULL, 92, 16),
(166, 'Good', NULL, 92, 16),
(167, 'Fair', NULL, 92, 16),
(168, 'Poor', NULL, 92, 16),
(169, 'Very poor', NULL, 92, 16),
(170, 'N/A', NULL, 92, 16),
(171, 'Excellent', NULL, 92, 17),
(172, 'Good', NULL, 92, 17),
(173, 'Fair', NULL, 92, 17),
(174, 'Poor', NULL, 92, 17),
(175, 'Very poor', NULL, 92, 17),
(176, 'N/A', NULL, 92, 17),
(177, 'Excellent', NULL, 92, 18),
(178, 'Good', NULL, 92, 18),
(179, 'Fair', NULL, 92, 18),
(180, 'Poor', NULL, 92, 18),
(181, 'Very poor', NULL, 92, 18),
(182, 'N/A', NULL, 92, 18),
(183, 'Excellent', NULL, 92, 19),
(184, 'Good', NULL, 92, 19),
(185, 'Fair', NULL, 92, 19),
(186, 'Poor', NULL, 92, 19),
(187, 'Very poor', NULL, 92, 19),
(188, 'N/A', NULL, 92, 19),
(189, 'Excellent', NULL, 92, 20),
(190, 'Good', NULL, 92, 20),
(191, 'Fair', NULL, 92, 20),
(192, 'Poor', NULL, 92, 20),
(193, 'Very poor', NULL, 92, 20),
(194, 'N/A', NULL, 92, 20),
(195, 'Excellent', NULL, 92, 21),
(196, 'Good', NULL, 92, 21),
(197, 'Fair', NULL, 92, 21),
(198, 'Poor', NULL, 92, 21),
(199, 'Very poor', NULL, 92, 21),
(200, 'N/A', NULL, 92, 21),
(201, 'Excellent', NULL, 92, 22),
(202, 'Good', NULL, 92, 22),
(203, 'Fair', NULL, 92, 22),
(204, 'Poor', NULL, 92, 22),
(205, 'Very poor', NULL, 92, 22),
(206, 'N/A', NULL, 92, 22),
(207, 'Excellent', NULL, 92, 23),
(208, 'Good', NULL, 92, 23),
(209, 'Fair', NULL, 92, 23),
(210, 'Poor', NULL, 92, 23),
(211, 'Very poor', NULL, 92, 23),
(212, 'N/A', NULL, 92, 23),
(213, 'Excellent', NULL, 92, 24),
(214, 'Good', NULL, 92, 24),
(215, 'Fair', NULL, 92, 24),
(216, 'Poor', NULL, 92, 24),
(217, 'Very poor', NULL, 92, 24),
(218, 'N/A', NULL, 92, 24),
(219, 'Too low', NULL, 93, 25),
(220, 'Just right ', NULL, 93, 25),
(221, 'Too high', NULL, 93, 25),
(222, 'Not applicable', NULL, 93, 25),
(223, 'Too low', NULL, 93, 26),
(224, 'Just right ', NULL, 93, 26),
(225, 'Too high', NULL, 93, 26),
(226, 'Not applicable', NULL, 93, 26),
(227, 'Too low', NULL, 93, 27),
(228, 'Just right ', NULL, 93, 27),
(229, 'Too high', NULL, 93, 27),
(230, 'Not applicable', NULL, 93, 27),
(231, 'Too low', NULL, 93, 28),
(232, 'Just right ', NULL, 93, 28),
(233, 'Too high', NULL, 93, 28),
(234, 'Not applicable', NULL, 93, 28),
(235, 'Too low', NULL, 93, 29),
(236, 'Just right ', NULL, 93, 29),
(237, 'Too high', NULL, 93, 29),
(238, 'Not applicable', NULL, 93, 29),
(239, 'Too low', NULL, 93, 30),
(240, 'Just right ', NULL, 93, 30),
(241, 'Too high', NULL, 93, 30),
(242, 'Not applicable', NULL, 93, 30),
(243, 'Agree', NULL, 94, 31),
(244, 'Sowewhat agree', NULL, 94, 31),
(245, 'Neither agree nor disagree', NULL, 94, 31),
(246, 'Somewhat disagree', NULL, 94, 31),
(247, 'Disagree', NULL, 94, 31),
(248, 'Agree', NULL, 94, 32),
(249, 'Sowewhat agree', NULL, 94, 32),
(250, 'Neither agree nor disagree', NULL, 94, 32),
(251, 'Somewhat disagree', NULL, 94, 32),
(252, 'Disagree', NULL, 94, 32),
(253, 'Agree', NULL, 94, 33),
(254, 'Sowewhat agree', NULL, 94, 33),
(255, 'Neither agree nor disagree', NULL, 94, 33),
(256, 'Somewhat disagree', NULL, 94, 33),
(257, 'Disagree', NULL, 94, 33),
(258, 'Agree', NULL, 94, 34),
(259, 'Sowewhat agree', NULL, 94, 34),
(260, 'Neither agree nor disagree', NULL, 94, 34),
(261, 'Somewhat disagree', NULL, 94, 34),
(262, 'Disagree', NULL, 94, 34),
(264, 'Agree', NULL, 95, 35),
(265, 'Somewhat agree', NULL, 95, 35),
(266, 'Neither agree nor disagree', NULL, 95, 35),
(267, 'Somewhat disagree', NULL, 95, 35),
(268, 'Disagree', NULL, 95, 35),
(269, 'Agree', NULL, 95, 36),
(270, 'Somewhat agree', NULL, 95, 36),
(271, 'Neither agree nor disagree', NULL, 95, 36),
(272, 'Somewhat disagree', NULL, 95, 36),
(273, 'Disagree', NULL, 95, 36),
(274, 'Agree', NULL, 95, 37),
(275, 'Somewhat agree', NULL, 95, 37),
(276, 'Neither agree nor disagree', NULL, 95, 37),
(277, 'Somewhat disagree', NULL, 95, 37),
(278, 'Disagree', NULL, 95, 37),
(279, 'Agree', NULL, 95, 38),
(280, 'Somewhat agree', NULL, 95, 38),
(281, 'Neither agree nor disagree', NULL, 95, 38),
(282, 'Somewhat disagree', NULL, 95, 38),
(283, 'Disagree', NULL, 95, 38),
(284, 'Agree', NULL, 95, 39),
(285, 'Somewhat agree', NULL, 95, 39),
(286, 'Neither agree nor disagree', NULL, 95, 39),
(287, 'Somewhat disagree', NULL, 95, 39),
(288, 'Disagree', NULL, 95, 39),
(289, 'Agree', NULL, 95, 40),
(290, 'Somewhat agree', NULL, 95, 40),
(291, 'Neither agree nor disagree', NULL, 95, 40),
(292, 'Somewhat disagree', NULL, 95, 40),
(293, 'Disagree', NULL, 95, 40),
(294, 'Agree', NULL, 96, 41),
(295, 'Somewhat agree', NULL, 96, 41),
(296, 'Neither agree nor disagree', NULL, 96, 41),
(297, 'Somewhat disagree', NULL, 96, 41),
(298, 'Disagree', NULL, 96, 41),
(299, 'Agree', NULL, 96, 42),
(300, 'Somewhat agree', NULL, 96, 42),
(301, 'Neither agree nor disagree', NULL, 96, 42),
(302, 'Somewhat disagree', NULL, 96, 42),
(303, 'Disagree', NULL, 96, 42),
(304, 'Agree', NULL, 96, 43),
(305, 'Somewhat agree', NULL, 96, 43),
(306, 'Neither agree nor disagree', NULL, 96, 43),
(307, 'Somewhat disagree', NULL, 96, 43),
(308, 'Disagree', NULL, 96, 43),
(309, 'Agree', NULL, 96, 44),
(310, 'Somewhat agree', NULL, 96, 44),
(311, 'Neither agree nor disagree', NULL, 96, 44),
(312, 'Somewhat disagree', NULL, 96, 44),
(313, 'Disagree', NULL, 96, 44),
(314, 'Agree', NULL, 96, 45),
(315, 'Somewhat agree', NULL, 96, 45),
(316, 'Neither agree nor disagree', NULL, 96, 45),
(317, 'Somewhat disagree', NULL, 96, 45),
(318, 'Disagree', NULL, 96, 45),
(319, 'Agree', NULL, 96, 46),
(320, 'Somewhat agree', NULL, 96, 46),
(321, 'Neither agree nor disagree', NULL, 96, 46),
(322, 'Somewhat disagree', NULL, 96, 46),
(323, 'Disagree', NULL, 96, 46),
(324, 'Agree', NULL, 96, 47),
(325, 'Somewhat agree', NULL, 96, 47),
(326, 'Neither agree nor disagree', NULL, 96, 47),
(327, 'Somewhat disagree', NULL, 96, 47),
(328, 'Disagree', NULL, 96, 47),
(329, 'Agree', NULL, 96, 48),
(330, 'Somewhat agree', NULL, 96, 48),
(331, 'Neither agree nor disagree', NULL, 96, 48),
(332, 'Somewhat disagree', NULL, 96, 48),
(333, 'Disagree', NULL, 96, 48),
(334, 'Agree', NULL, 96, 49),
(335, 'Somewhat agree', NULL, 96, 49),
(336, 'Neither agree nor disagree', NULL, 96, 49),
(337, 'Somewhat disagree', NULL, 96, 49),
(338, 'Disagree', NULL, 96, 49);

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `id` int(11) NOT NULL,
  `comment` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comments`
--

INSERT INTO `comments` (`id`, `comment`) VALUES
(19, 'good'),
(20, 'Yo ..'),
(21, 'Yes I do Agree!!'),
(22, 'CardiB  '),
(23, 'PutaMadre!!'),
(24, ' I am Satisfed '),
(25, 'Yes i do baaa.........................\r\n...............\r\n...................///>>>>>>>>>>>>>>>...............');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(85),
(85),
(85),
(85);

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `q_id` int(11) NOT NULL,
  `q_description` text,
  `q_name` varchar(255) DEFAULT NULL,
  `q_remarks` varchar(255) DEFAULT NULL,
  `a_type` varchar(255) DEFAULT 'radio'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`q_id`, `q_description`, `q_name`, `q_remarks`, `a_type`) VALUES
(1, 'Overall, how satisfied are you with your membership in our Rotary club?', 'Q1', NULL, 'radio'),
(84, 'Considering our club’s culture, members, and meetings, indicate your agreement with the\r\nfollowing statements.', NULL, NULL, 'multiple'),
(92, 'How would you rate the following aspects of our weekly meetings?', NULL, NULL, 'multiple'),
(93, 'Thinking about the costs associated with club membership, how would you rate the following?', NULL, NULL, 'multiple'),
(94, 'Indicate you agreement with the following statements about club engagement.', NULL, NULL, 'multiple'),
(95, 'Thinking about <b>communication</b> and <b>responsiveness</b> in our Rotary club, indicate your agreement with the following statements. ', NULL, NULL, 'multiple'),
(96, 'Indicate your agreement with the following statements about the <b>value</b> of your membership.', NULL, NULL, 'multiple');

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`id`, `role`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Table structure for table `sub_question`
--

CREATE TABLE `sub_question` (
  `qId` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `q_description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sub_question`
--

INSERT INTO `sub_question` (`qId`, `id`, `q_description`) VALUES
(84, 2, 'Club meetings are a good use of my time'),
(84, 3, 'My club does a good job involving new members'),
(92, 16, 'Rotary International updates'),
(92, 17, 'Length'),
(92, 18, 'Time for socializing'),
(92, 19, 'Professional  connections and networking'),
(92, 20, 'Variety of program topics'),
(92, 21, 'Location'),
(92, 22, 'Meeting time and day'),
(92, 23, 'Meals for refreshments'),
(92, 24, 'Speakers and programs'),
(93, 25, 'Club dues'),
(93, 26, 'Meals at weekly meetings'),
(93, 27, 'Club fines'),
(93, 28, 'Club assessments'),
(93, 29, 'Requests for donations for service projects'),
(93, 30, 'Requests for contributions to The Rotary Foundation'),
(94, 31, 'I invite my friends, family, and colleagues to club events'),
(94, 32, 'I invite qualified prospective members to join my Rotary club'),
(94, 33, 'I frequently participate in my club\'s activities, projects, and programs'),
(94, 34, 'I\'m proud of my Rotary club'),
(95, 35, 'My club does a good job communicating to members'),
(95, 36, 'My club does a good job listening to members'),
(95, 37, 'My club seeks input and ideas from members'),
(95, 38, 'My club regularly acts upon members\' input and ideas'),
(95, 39, 'I am comfortable with pace of change in my club'),
(95, 40, 'My club works to update club processes and rules to meet the needs of its members'),
(96, 41, 'I feel welcome in my club'),
(96, 42, 'I make valuable connections through my club'),
(96, 43, 'My club provides opportunities to use my talents and skills'),
(96, 44, 'My experience as a member is worth the money I spend on Rotary participation'),
(96, 45, 'My experience as a member is worth the time I give to Rotary'),
(96, 46, 'My family sees value in my Rotary membership'),
(96, 47, 'My friends see value in my Rotary membership'),
(96, 48, 'Through Rotary, I make a difference in my community'),
(96, 49, 'Through Rotary, I make a difference in the world');

-- --------------------------------------------------------

--
-- Table structure for table `surveys`
--

CREATE TABLE `surveys` (
  `s_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `surveys`
--

INSERT INTO `surveys` (`s_id`, `u_id`) VALUES
(46, 46);

-- --------------------------------------------------------

--
-- Table structure for table `survey_answer`
--

CREATE TABLE `survey_answer` (
  `id` int(11) NOT NULL,
  `a_id` int(11) NOT NULL,
  `q_id` int(11) NOT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `survey_s_id` int(11) DEFAULT NULL,
  `sub_question_id` int(11) NOT NULL DEFAULT '0',
  `comment_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `survey_answer`
--

INSERT INTO `survey_answer` (`id`, `a_id`, `q_id`, `remarks`, `survey_s_id`, `sub_question_id`, `comment_id`) VALUES
(286, 1, 1, NULL, 46, 0, NULL),
(287, 87, 84, NULL, 46, 2, NULL),
(288, 87, 84, NULL, 46, 3, NULL),
(289, 93, 87, NULL, 46, 3, NULL),
(290, 102, 91, NULL, 46, 4, NULL),
(291, 102, 91, NULL, 46, 5, NULL),
(292, 102, 91, NULL, 46, 6, NULL),
(293, 102, 91, NULL, 46, 7, NULL),
(294, 102, 91, NULL, 46, 8, NULL),
(295, 102, 91, NULL, 46, 9, NULL),
(296, 102, 91, NULL, 46, 10, NULL),
(297, 102, 91, NULL, 46, 11, NULL),
(298, 102, 91, NULL, 46, 12, NULL),
(299, 157, 92, NULL, 46, 14, NULL),
(300, 157, 92, NULL, 46, 15, NULL),
(301, 163, 93, NULL, 46, 15, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `role_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `firstname`, `role_id`) VALUES
(46, 'user', 'user', 'userWithoneEye', 2),
(49, 'admin', 'admin', 'admin', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `answer`
--
ALTER TABLE `answer`
  ADD PRIMARY KEY (`a_id`),
  ADD KEY `answer_ibfk_1` (`question_q_id`);

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`q_id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sub_question`
--
ALTER TABLE `sub_question`
  ADD PRIMARY KEY (`id`),
  ADD KEY `sub_question_ibfk_1` (`qId`);

--
-- Indexes for table `surveys`
--
ALTER TABLE `surveys`
  ADD PRIMARY KEY (`s_id`);

--
-- Indexes for table `survey_answer`
--
ALTER TABLE `survey_answer`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKgptswrbkpkm48y94mpwwye530` (`survey_s_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `answer`
--
ALTER TABLE `answer`
  MODIFY `a_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=340;

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `question`
--
ALTER TABLE `question`
  MODIFY `q_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=99;

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `sub_question`
--
ALTER TABLE `sub_question`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT for table `survey_answer`
--
ALTER TABLE `survey_answer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=302;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `answer`
--
ALTER TABLE `answer`
  ADD CONSTRAINT `answer_ibfk_1` FOREIGN KEY (`question_q_id`) REFERENCES `question` (`q_id`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Constraints for table `sub_question`
--
ALTER TABLE `sub_question`
  ADD CONSTRAINT `sub_question_ibfk_1` FOREIGN KEY (`qId`) REFERENCES `question` (`q_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `survey_answer`
--
ALTER TABLE `survey_answer`
  ADD CONSTRAINT `FKgptswrbkpkm48y94mpwwye530` FOREIGN KEY (`survey_s_id`) REFERENCES `surveys` (`s_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
