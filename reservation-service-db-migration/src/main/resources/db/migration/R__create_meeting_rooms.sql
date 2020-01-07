CREATE TABLE IF NOT EXISTS `meeting_rooms` (
  `id`           INT AUTO_INCREMENT,
  `room_name`    VARCHAR(50)                 NOT NULL,
  `description`  VARCHAR(200)                NOT NULL,
  `status`       VARCHAR(15)                 NOT NULL COMMENT 'ACTIVE, INACTIVE',
  `company_id`   INT                         NOT NULL,
  `created_time` DATETIME                    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_time` DATETIME                    NULL,
  PRIMARY KEY (`id`),
  INDEX (`company_id`)
);