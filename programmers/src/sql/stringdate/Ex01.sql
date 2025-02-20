-- 특정 옵션이 포함된 자동차 리스트 구하기
-- 코드를 입력하세요
SELECT *
FROM CAR_RENTAL_COMPANY_CAR
WHERE options like '%네비게이션%'
ORDER BY CAR_ID DESC;