-- 코드를 입력하세요
SELECT DR_NAME,	DR_ID,MCDP_CD,date_format(hire_ymd, '%Y-%m-%d') as hire_ymd 
from DOCTOR
where MCDP_CD = 'GS' or MCDP_CD ="CS"
order by 4 desc ,DR_NAME