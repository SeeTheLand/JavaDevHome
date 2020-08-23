SELECT sum(salary)
FROM developers d
JOIN developers_skills ds on d.id = ds.developer_id
JOIN languages l on ds.language_id = l.id
WHERE l.name = 'Java';
