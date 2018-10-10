CREATE TABLE `core_user` (
  `core_user_id` varchar(40) NOT NULL,
  `user_name` varchar(256) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `comment_info` varchar(2000) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `modified_time` datetime DEFAULT NULL,
  PRIMARY KEY (`core_user_id`),
  UNIQUE KEY `pk_core_user_id` (`core_user_id`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cms_log` (
  `cms_log_id` varchar(40) NOT NULL,
  `log_type` varchar(30) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `modified_time` datetime DEFAULT NULL,
  `module` varchar(200) DEFAULT NULL,
  `user` varchar(100) DEFAULT NULL,
  `ip_address` varchar(40) DEFAULT NULL,
  `log_info` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`cms_log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;