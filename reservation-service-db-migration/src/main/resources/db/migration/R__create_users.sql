CREATE TABLE IF NOT EXISTS `users` (
  `id`           INT AUTO_INCREMENT,
  `user_name`    VARCHAR(50)                 NOT NULL,
  `status`       VARCHAR(15)                 NOT NULL COMMENT 'ACTIVE, INACTIVE',
  `company_id`   INT                         NOT NULL,
  `created_time` DATETIME                    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_time` DATETIME                    NULL,
  PRIMARY KEY (`id`),
  INDEX (`user_name`),
  INDEX (`company_id`)
);