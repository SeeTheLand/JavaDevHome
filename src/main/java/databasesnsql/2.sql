SELECT p.name
FROM projects p
JOIN developers_projects dp
ON p.id = dp.project_id
JOIN developers d
ON d.id = dp.developer_id
GROUP BY p.id
HAVING sum(d.salary) =
(
SELECT max(salary_sum)
FROM (
SELECT sum(salary) as salary_sum
FROM developers_projects dp
         JOIN developers d ON d.id = dp.developer_id
GROUP BY dp.project_id
) AS salary_sum
);

