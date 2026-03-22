CREATE TABLE `booking_log` (
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `oms_journey_code` VARCHAR(100),
    `oms_booking_code` VARCHAR(100),
    `status` VARCHAR(20) NOT NULL,
    `error_message` TEXT,
    `contact_email` VARCHAR(255),
    `contact_phone_number` VARCHAR(50),
    `request_payload` JSON NOT NULL,
    `response_payload` JSON,
    `created_by` BIGINT,
    `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updated_by` BIGINT,
    `updated_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE INDEX idx_email ON booking_log(contact_email);
CREATE INDEX idx_phone ON booking_log(contact_phone_number);
CREATE INDEX idx_booking_code ON booking_log(oms_booking_code);
