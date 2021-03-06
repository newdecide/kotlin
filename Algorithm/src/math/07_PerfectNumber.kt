package math

// 07.완전수: 자신을 제외한 약수를 모두 합한 값이 자신과 같으면 완전수이다.
// 6은 완전수이다.
// 1, 2, 3, 6
// 자신을 제외하고 1 + 2 + 3 (약수를 더한 값이 자신(6)과 같다.)

fun main(args: Array<String>) {
    var pn = 0 // 완전수 개수

    for(n in 4..500){ // 4부터 500까지의 변수
        var sum = 0 // 약수를 누적하는 변수
        var k = n / 2 // 완전수의 절반값

        for(j in 1..k){ //
            var r = n % j // j가 n의 약수인지 판별
            if( r == 0) { // 0으로 나누어 떨어지면 약수입니다.
                sum += j // 약수의 합이 n과 같으면 n은 완전수다.
            }
        }

        if(n == sum){ // 완전수 인가?
            pn++
            println("${pn} 번째 완전수는 : "+n)

        }
    }
    println("완전수의 개수는: "+pn)
}