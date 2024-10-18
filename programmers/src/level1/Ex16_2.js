//A로 B만들기 다른 풀이
function solution(before, after) {
    return [...before].sort().join("")===[...after].sort().join("") ? 1 : 0
 }