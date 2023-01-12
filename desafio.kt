enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(val nome: String, val nivel: Nivel, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val joe = Usuario()
    val ana = Usuario()
    
    val conteudo1 = ConteudoEducacional("Kotlin básico", Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Kotlin funções", Nivel.INTERMEDIARIO, 60)
    val conteudo3 = ConteudoEducacional("Kotlin orientado a objetos", Nivel.INTERMEDIARIO, 80)
    val conteudo4 = ConteudoEducacional("Desafios com kotlin", Nivel.AVANCADO, 120)
    
    val formacao_conteudos = mutableListOf(conteudo1, conteudo2, conteudo3, conteudo4)
    val formacao = Formacao("Kotlin experience", formacao_conteudos)
    
    formacao.matricular(joe)
    formacao.matricular(ana)
    
    println(formacao.nome)
    println(formacao.inscritos)
    println(formacao.conteudos)
}
