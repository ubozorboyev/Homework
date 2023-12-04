package hu.andersen.task.ui.theme



open class Animal(val name: String, val color: COLOR){


}


enum class COLOR(name: String){

    BLACK("black"),

    YELLOW("yellow"),

    PURPLE("purple"),

    GREEN("green"),

    RED("red")
}

class Cat(name: String, color: COLOR, age:Int?=null) : Animal(name, color){


    fun showDetail(){
        println("cat: $name is ${color.name.lowercase()}")
    }

}

class Dog(name: String, color: COLOR):Animal(name, color){




     fun showInfo(){

         print("dog: $name is ${color.name.lowercase()}.")

    }

    inner class Child(private val childCount:Int?=null){        // Inner class


        fun showChildCount(){

            print(" $name children cunt is $childCount.")
        }
    }

    class Children(){ // Nested class

        init {
            // no access to Dog class properties because this class is nested class not inner
        }
    }

}


fun main(){


    val cat = Cat("Poppy", COLOR.YELLOW)

    cat.showDetail()


    val dog = Dog("Kennedy",COLOR.BLACK)

    dog.showInfo()


    val child = dog.Child(3)

    child.showChildCount()

    val cat1 = Cat("Pop", COLOR.PURPLE)



}