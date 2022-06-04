package src.main.kotlin.exercicios

fun main() {
    val str = "a +++ 2 * 3 -- 4 ---  9"
    val str2 = "2 * (3 + 4)".replace(" ", "")
    val str3 = "3 + 8 * ((4 + 3) - 2 + 1) - 6 / (2 + 1)"
    val str4 = "a*2+b*3+c*(2+3)"
    val str5 = "-3 / 5 / (2^a)"
    val str6 = "-4+3"
    val str7 = "2+2-"
    val regex2 =
        Regex("([\\d|[a-zA-Z]]*\\s*([*/^]|[+]+|-{1,3})\\s*[\\d|[a-zA-Z]]+\\s*)*([\\d|[a-zA-Z]]*\\s*([*/]|[+]+|-{1,3})\\s*[(][\\d|[a-zA-Z]]+\\s*([*/^]|[+]+|-{1,3})\\s*[\\d|[a-zA-Z]]+[)])*(\\s*([*/^]|[+]+|-{1,3})\\s*\\d+\\s*)?")


    if (str2.matches(regex2)) {
        // println(str3.replace(" ", ""))
        val regex = Regex("[(]\\s*\\d+\\s*[-+]\\s*\\d+\\s*[)]")
        val regex5 = Regex("[(]?[(]\\s*\\d+\\s*[-+]\\s*\\d+\\s*[)]\\s*[-+]\\s*\\s*\\d+\\s*[-+]\\s*\\d+\\s*[)]?")

        val teste = regex5.find(str3)?.value.toString()

        println(str3)
        println(str3.replace(teste, ",e,"))
    } else println("Error")
}