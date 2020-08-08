ALTER TABLE developers ADD COLUMN salary int;
UPDATE developers SET salary = 1200 WHERE id = 1;
UPDATE developers SET salary = 1500 WHERE id = 2;
UPDATE developers SET salary = 3000 WHERE id = 3;
UPDATE developers SET salary = 10000 WHERE id = 4;