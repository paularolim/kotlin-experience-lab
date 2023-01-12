enum class Level { BASIC, MID, ADVANCED }

class User

data class Content(val name: String, val level: Level, val duration: Int = 60)

data class Formation(val name: String, val contents: List<Content>) {

    val subscribers = mutableListOf<User>()
    
    fun subscribe(user: User) {
        subscribers.add(user)
    }
}

fun main() {
    val joe = User()
    val ana = User()
    
    val content1 = Content("Kotlin básico", Level.BASIC)
    val content2 = Content("Kotlin funções", Level.BASIC, 60)
    val content3 = Content("Kotlin orientado a objetos", Level.MID, 80)
    val content4 = Content("Desafios com kotlin", Level.ADVANCED, 120)
    
    val formation_contents = mutableListOf(content1, content2, content3, content4)
    val formation = Formation("Kotlin experience", formation_contents)
    
    formation.subscribe(joe)
    formation.subscribe(ana)
    
    println(formation.name)
    println(formation.subscribers)
    println(formation.contents)
}