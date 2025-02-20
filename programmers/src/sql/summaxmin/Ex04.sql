-- 잡은 물고기 중 가장 큰 물고기의 길이 구하기
-- 코드를 작성해주세요
SELECT CONCAT(MAX(LENGTH),'cm') AS 'MAX_LENGTH'
FROM FISH_INFO;