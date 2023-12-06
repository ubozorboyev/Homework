package hu.andersen.task.ui.theme


sealed class Algo(val message:String)

class Cola(): Algo("Cola")
class Pepsi():Algo("Pepsi")
class Pila:Algo("Pila")

const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"

@Deprecated(SUBSYSTEM_DEPRECATED)
fun foo() {

}

abstract class Base{

    abstract val algo:Algo

    fun showMessage(){
        println("name: ${algo.message}")
    }
}

class ColaA(): Base(){
    override val algo = Cola()
}

class PepsiA():Base(){

    override val algo: Algo
        get() = Pepsi()
}

class Person{



}

fun main(){

    val cola = ColaA()

    cola.showMessage()

    val pepsi = PepsiA()

    pepsi.showMessage()


}