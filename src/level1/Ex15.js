//level 0
//평행
function solution(dots) {
    var answer = 0;
    var gradient1;
    var gradient2;
    gradient1= (dots[0][1]-dots[1][1]) / (dots[0][0]-dots[1][0]);
    gradient2= (dots[2][1]-dots[3][1]) / (dots[2][0]-dots[3][0]);
    if(gradient1===gradient2) return 1;
    gradient1= (dots[0][1]-dots[2][1]) / (dots[0][0]-dots[2][0]);
    gradient2= (dots[1][1]-dots[3][1]) / (dots[1][0]-dots[3][0]);
    if(gradient1===gradient2) return 1;
    gradient1= (dots[0][1]-dots[3][1]) / (dots[0][0]-dots[3][0]);
    gradient2= (dots[1][1]-dots[2][1]) /(dots[1][0]-dots[2][0]);
    if(gradient1===gradient2) return 1;
        
    return 0;
}