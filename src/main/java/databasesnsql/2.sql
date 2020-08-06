DO
$$
DECLARE
    i_num_count int;
BEGIN
    FOR i_num_count IN
        SELECT project_id FROM developers_projects
                       WHERE developer_id = (
                           SELECT id FROM developers
                           WHERE salary = (
                               SELECT max(salary)
                               FROM developers
                           )
                       )
    LOOP
        SELECT * FROM projects
        WHERE id = i_num_count;
    END LOOP;
END;
$$
LANGUAGE plpgsql;

