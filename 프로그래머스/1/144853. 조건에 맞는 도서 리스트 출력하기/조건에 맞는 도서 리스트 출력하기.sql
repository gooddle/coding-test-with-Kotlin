-- 코드를 입력하세요
SELECT BOOK_ID, date_format(PUBLISHED_DATE, '%Y-%m-%d') from BOOK
WHERE   CATEGORY in ('인문') AND PUBLISHED_DATE like '2021%'