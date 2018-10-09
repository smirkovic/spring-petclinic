INSERT INTO vet VALUES (1, 'Jelena', 'Jovanovic');
INSERT INTO vet VALUES (2, 'Steva', 'Keranovic');
INSERT INTO vet VALUES (3, 'Sasa', 'Mirkovic');
INSERT INTO vet VALUES (4, 'Alisa', 'Sovanec');
INSERT INTO vet VALUES (5, 'Aleksandra', 'Klasnja');
INSERT INTO vet VALUES (6, 'Milan', 'Jovanovic');

INSERT INTO specialties VALUES (1, 'Radiologija');
INSERT INTO specialties VALUES (2, 'Operacije');
INSERT INTO specialties VALUES (3, 'Opsti');

INSERT INTO vet_specialties VALUES (1, 3);
INSERT INTO vet_specialties VALUES (2, 1);
INSERT INTO vet_specialties VALUES (3, 2);
INSERT INTO vet_specialties VALUES (3, 3);
INSERT INTO vet_specialties VALUES (4, 2);
INSERT INTO vet_specialties VALUES (5, 1);
INSERT INTO vet_specialties VALUES (6, 2);

INSERT INTO types VALUES (1, 'Macka');
INSERT INTO types VALUES (2, 'Pas');
INSERT INTO types VALUES (3, 'Guster');
INSERT INTO types VALUES (4, 'Zmija');
INSERT INTO types VALUES (5, 'Ptica');
INSERT INTO types VALUES (6, 'Hrcak');

INSERT INTO owner VALUES (1, 'Petar', 'Petrovic', 'Narodnog fronta', 'Novi Sad', '6085551023');
INSERT INTO owner VALUES (2, 'Betty', 'Davis', '638 Cardinal Ave.', 'Novi Sad', '6085551749');
INSERT INTO owner VALUES (3, 'Eduardo', 'Rodriquez', '2693 Commerce St.', 'Novi Sad', '6085558763');
INSERT INTO owner VALUES (4, 'Harold', 'Davis', '563 Friendly St.', 'Windsor', 'Novi Sad');
INSERT INTO owner VALUES (5, 'Peter', 'McTavish', '2387 S. Fair Way', 'Madison', '6085552765');
INSERT INTO owner VALUES (6, 'Jean', 'Coleman', '105 N. Lake St.', 'Monona', '6085552654');
INSERT INTO owner VALUES (7, 'Jeff', 'Black', '1450 Oak Blvd.', 'Monona', '6085555387');
INSERT INTO owner VALUES (8, 'Maria', 'Escobito', '345 Maple St.', 'Madison', '6085557683');
INSERT INTO owner VALUES (9, 'David', 'Schroeder', '2749 Blackhawk Trail', 'Madison', '6085559435');
INSERT INTO owner VALUES (10, 'Carlos', 'Estaban', '2335 Independence La.', 'Waunakee', '6085555487');

INSERT INTO pets VALUES (1, 'Leo', '2010-09-07', 1, 1);
INSERT INTO pets VALUES (2, 'Basil', '2012-08-06', 6, 2);
INSERT INTO pets VALUES (3, 'Rosy', '2011-04-17', 2, 3);
INSERT INTO pets VALUES (4, 'Jewel', '2010-03-07', 2, 3);
INSERT INTO pets VALUES (5, 'Iggy', '2010-11-30', 3, 4);
INSERT INTO pets VALUES (6, 'George', '2010-01-20', 4, 5);
INSERT INTO pets VALUES (7, 'Samantha', '2012-09-04', 1, 6);
INSERT INTO pets VALUES (8, 'Max', '2012-09-04', 1, 6);
INSERT INTO pets VALUES (9, 'Lucky', '2011-08-06', 5, 7);
INSERT INTO pets VALUES (10, 'Mulligan', '2007-02-24', 2, 8);
INSERT INTO pets VALUES (11, 'Freddy', '2010-03-09', 5, 9);
INSERT INTO pets VALUES (12, 'Lucky', '2010-06-24', 2, 10);
INSERT INTO pets VALUES (13, 'Sly', '2012-06-08', 1, 10);

INSERT INTO visits VALUES (1, 7, '2013-01-01', 'rabies shot');
INSERT INTO visits VALUES (2, 8, '2013-01-02', 'rabies shot');
INSERT INTO visits VALUES (3, 8, '2013-01-03', 'neutered');
INSERT INTO visits VALUES (4, 7, '2013-01-04', 'spayed');
