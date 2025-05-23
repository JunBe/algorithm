-- 자동차 대여 기록에서 장기/단기 대여 구분하기
-- 코드를 입력하세요
SELECT history_id AS HISTORY_ID, car_id AS CAR_ID,
       DATE_FORMAT(START_DATE,'%Y-%m-%d') AS START_DATE,
       DATE_FORMAT(END_DATE,'%Y-%m-%d') AS END_DATE,
       IF(DATEDIFF(END_DATE,START_DATE) >= 29, "장기 대여", "단기 대여") AS RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE YEAR(START_DATE) = 2022 AND MONTH(START_DATE) = 9
ORDER BY history_id DESC;