CREATE TABLE `core_user` (
  `core_user_id` varchar(40) NOT NULL,
  `user_name` varchar(256) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `comment_info` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`core_user_id`),
  UNIQUE KEY `pk_core_user_id` (`core_user_id`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
