# SELECT CONCAT(ROUND(MAX(LENGTH), 2), 'cm') AS "MAX_LENGTH"
# FROM FISH_INFO;
select  CONCAT(MAX(LENGTH), "cm") AS MAX_LENGTH from FISH_INFO