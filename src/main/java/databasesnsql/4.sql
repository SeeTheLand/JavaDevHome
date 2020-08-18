ALTER TABLE projects
ADD COLUMN cost int;

UPDATE projects
SET cost = sumValue
FROM
(SELECT pSum.id, sum(salary) sumValue
FROM projects pSum
INNER JOIN developers_projects dp on pSum.id = dp.project_id
INNER JOIN developers d on dp.developer_id = d.id
GROUP BY pSum.id) p2
WHERE projects.id = p2.id;