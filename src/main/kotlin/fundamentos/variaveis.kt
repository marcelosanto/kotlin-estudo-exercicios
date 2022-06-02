package fundamentos

fun main() {
    // var = mutavel
    // val = imutavel - nunca mais vai ser alterado

    val idade: String = "30"
    val idadeVal = 30

    //idade = 31
    /***  */

    val applesCount: Int = 30
    //rintln(applesCount)
    val n = 1234
    val m = n % 1000 / 100
    val l = n / 10 / 100
    val o = n / 100 % 10
    val r = n / 1000 / 10
    val t = n / 10 % 10
    val u = n % 100 / 10
    val s = n // 100
    val x = n % 10 / 10


    //println("m: $m, l: $l, o: $o, r: $r")
    //println("t: $t, u: $u, s: $s, x: $x")

    var num = 0
    num = num++

    print(num)

}

class variaveis {
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}
