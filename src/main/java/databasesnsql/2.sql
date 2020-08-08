SELECT p.name,
SUM (salary)
FROM projects p
JOIN companies_projects cp
ON p.id = cp.project_id
JOIN developers_projects dp
ON p.id = dp.project_id
JOIN developers d
     ON d.id = dp.developer_id

GROUP BY p.id;



WHERE salary= (SELECT max(salary))