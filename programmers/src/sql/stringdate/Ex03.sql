-- 한 해에 잡은 물고기 수 구하기
-- 코드를 작성해주세요
SELECT COUNT(*) AS FISH_COUNT
FROM FISH_INFO
WHERE YEAR(TIME)=2021;