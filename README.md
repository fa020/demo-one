-- select * from emp
-- \d emp
-- id | bigint | not null default nextval('emp_id_seq'::regclass)


-- select column_name, data_type, column_default, is_nullable
-- FROM information_schema.columns
-- WHERE table_name = 'emp';


-- -- Step 1: Create a sequence (only once)
-- CREATE SEQUENCE emp_id_seq START 1;

-- -- Step 2: Alter the table to use the sequence as default for id
-- ALTER TABLE emp ALTER COLUMN id SET DEFAULT nextval('emp_id_seq');


INSERT INTO emp (name, date_of_joinging, is_active)
VALUES ('A', '2024-12-01', true);
