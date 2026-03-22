
CREATE TABLE `geo` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `geo_id` varchar(255) NOT NULL,
  `parent_id` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `locale_name` varchar(255) DEFAULT NULL,
  `centroid` varchar(255) DEFAULT NULL,
  `created_at` timestamp DEFAULT CURRENT_TIMESTAMP,
  `created_by` BIGINT,
  `updated_at` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` BIGINT,
  PRIMARY KEY (`id`)
);


INSERT INTO geo
(geo_id, parent_id, `type`, name, status, locale_name, centroid, created_at, updated_at)
VALUES('30000013', '102813', 'LOCALITY', 'Transport Extranet Jakarta Timur', 'active', 'Transport Extranet Jakarta Timur', '{"lon":"106.9198171980679","lat":"-6.174682406564763","valid":true}', '2024-08-21 20:07:08', '2024-08-21 20:07:08');
INSERT INTO geo
(geo_id, parent_id, `type`, name, status, locale_name, centroid, created_at, updated_at)
VALUES('102952', '102813', 'CITY', 'Jakarta Utara', 'active', 'Jakarta Utara', '{"lon":"106.84074323769892","lat":"-6.136182549048804","valid":true}', '2024-08-21 20:05:19', '2024-08-21 20:05:19');
INSERT INTO geo
(geo_id, parent_id, `type`, name, status, locale_name, centroid, created_at, updated_at)
VALUES('102899', '102813', 'CITY', 'Jakarta Pusat', 'active', 'Jakarta Pusat', '{"lon":"106.84070766437799","lat":"-6.177905334830378","valid":true}', '2024-08-21 20:05:18', '2024-08-21 20:05:18');
INSERT INTO geo
(geo_id, parent_id, `type`, name, status, locale_name, centroid, created_at, updated_at)
VALUES('30000015', '102813', 'LOCALITY', 'Transport Extranet Jakarta Selatan', 'active', 'Transport Extranet Jakarta Selatan', '{"lon":"106.8429129011929","lat":"-6.31051792427296","valid":true}', '2024-08-21 20:07:08', '2024-08-21 20:07:08');
INSERT INTO geo
(geo_id, parent_id, `type`, name, status, locale_name, centroid, created_at, updated_at)
VALUES('102990', '102813', 'CITY', 'Jakarta Selatan', 'active', 'Jakarta Selatan', '{"lon":"106.80114273447543","lat":"-6.284222554862204","valid":true}', '2024-08-21 20:05:21', '2024-08-21 20:05:21');
INSERT INTO geo
(geo_id, parent_id, `type`, name, status, locale_name, centroid, created_at, updated_at)
VALUES('30000948', '102813', 'LOCALITY', 'Jakarta - bluebird', 'active', 'Jakarta - bluebird', '{"lon":"106.8700600889684","lat":"-6.299677980675464","valid":true}', '2024-08-21 20:07:08', '2024-08-21 20:07:08');
INSERT INTO geo
(geo_id, parent_id, `type`, name, status, locale_name, centroid, created_at, updated_at)
VALUES('30000014', '102813', 'LOCALITY', 'Transport Extranet Jakarta Barat', 'active', 'Transport Extranet Jakarta Barat', '{"lon":"106.73167632892728","lat":"-6.171269196994279","valid":true}', '2024-08-21 20:07:08', '2024-08-21 20:07:08');
INSERT INTO geo
(geo_id, parent_id, `type`, name, status, locale_name, centroid, created_at, updated_at)
VALUES('102814', '102813', 'CITY', 'Jakarta Timur', 'active', 'Jakarta Timur', '{"lon":"106.90607142169029","lat":"-6.2785243994157","valid":true}', '2024-08-21 20:05:15', '2024-08-21 20:05:15');
INSERT INTO geo
(geo_id, parent_id, `type`, name, status, locale_name, centroid, created_at, updated_at)
VALUES('103066', '102813', 'CITY', 'Jakarta Barat', 'active', 'Jakarta Barat', '{"lon":"106.73335637926357","lat":"-6.156593839426864","valid":true}', '2024-08-21 20:05:22', '2024-08-21 20:05:22');
INSERT INTO geo
(geo_id, parent_id, `type`, name, status, locale_name, centroid, created_at, updated_at)
VALUES('102813', '100003', 'REGION', 'Jakarta', 'active', 'Jakarta', '{"lon":"106.80174635723233","lat":"-6.2463392381187415","valid":true}', '2024-08-21 20:05:15', '2024-08-21 20:05:15');