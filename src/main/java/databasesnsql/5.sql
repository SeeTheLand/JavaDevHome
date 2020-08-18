SELECT *
FROM projects p
GROUP BY p.id
    WHERE min(cost);