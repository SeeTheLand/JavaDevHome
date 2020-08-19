SELECT *
FROM projects p
WHERE cost = (
    SELECT MAX (cost)
    FROM projects
    );