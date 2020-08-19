SELECT avg(salary)
FROM developers d
         INNER JOIN developers_projects dp on d.id = dp.developer_id
         INNER JOIN  projects p on dp.project_id = p.id
WHERE p.id = (SELECT id
FROM projects p
WHERE cost = (
    SELECT max (cost)
    FROM projects
    ));