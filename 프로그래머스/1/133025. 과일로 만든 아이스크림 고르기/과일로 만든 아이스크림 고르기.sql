-- 코드를 입력하세요
SELECT f.flavor
FROM first_half AS f RIGHT OUTER JOIN icecream_info AS i
ON f.flavor = i.flavor
WHERE total_order >= 3000 AND ingredient_type = 'fruit_based'
ORDER BY total_order DESC;