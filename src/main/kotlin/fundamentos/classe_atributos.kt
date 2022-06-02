package fundamentos

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono) {
    override fun toString(): String {
        return "Carro(cor: '$cor', anoFabricacao: $anoFabricacao, dono: $dono)"
    }
}

data class Dono(var nome: String, var idade: Int, var Endereco: Endereco)

data class Endereco(var rua: String, var numero: Int, var cep: String)

fun main() {
    val carro = Carro("Branco", 2011, Dono("Marcelo", 30, Endereco("Trv dos Marrecos", 222, "29160-300")))

    println(carro)
}
