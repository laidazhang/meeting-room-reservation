CREATE TABLE IF NOT EXISTS `companies` (
  `id`              INT AUTO_INCREMENT,
  `company_name`    VARCHAR(50)                 NOT NULL,
  `description`     VARCHAR(200)                NOT NULL,
  `address`         VARCHAR(100)                NOT NULL,
  `status`          VARCHAR(15)                 NOT NULL COMMENT 'ACTIVE, INACTIVE',
  `created_time`    DATETIME                    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_time`    DATETIME                    NULL,
  PRIMARY KEY (`id`)
);