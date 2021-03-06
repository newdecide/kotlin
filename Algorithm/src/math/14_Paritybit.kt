package math

// 14.패리티비트

/*
* p[0] 값이 0 이면 짝수 패리티 비트 1이면 홀수 패리티 비트
* 0일 때 (0번 값 제외) 짝수개수면 오류 없음.
* 1일 때 (0번 값 제외0 홀수개수면 오류 없음.
* */
fun main(args: Array<String>) {
    var paritybit = arrayOf(0,1,0,0,1,0,0,0,1) // p[0]이 0이므로 짝수 패리티비트 배열이다.
    var pn = 0 // 패리티비트 카운트 변수
    var k = 0 // 배열의 첨자
    for(k in 1..8){ // 0번째는 짝수 홀수 구분하는 변수로 1부터 시작
        if(paritybit[k] == 1) {pn++} // paritybit 배열 값이 1이면 카운트 증가
    }
    var e = pn % 2// 카운트를 2로 나누어 나머지가 1인지 확인하는 변수

    if(paritybit[0] == e){ // 나누어떨어지면 짝수개수이므로 오류 미발견 나머지가 생기면 오류 발견
        println("오류 미발견")
    } else {
        println("오류 발견") // 이 패리티비트는 1이 3개이므로 홀수이므로 오류 발견
    }
}