-- 코드를 입력하세요
SELECT 
count(1) as 'USERS'
from USER_INFO
WHERE JOINED like '%2021%' and  (GENDER = 1 OR GENDER = 0 OR GENDER IS NULL) AND AGE BETWEEN 20 AND 29;