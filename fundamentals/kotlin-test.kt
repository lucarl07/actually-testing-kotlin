// First experience with Kotlin:
fun main() {
   val notANumber: Any = "60"
    
   if (notANumber is Int) {
       println("It's a number!")
   } else {
       println("It's not a number...")
   }
   
   val names = mutableListOf<String>("Luiz", "Carlos", "Júnior")
   println(names[2])
   
   names.add(2, "Dos Santos")
   
   for (name in names) {
       print("${names.indexOf(name) + 1}. $name \t")
       // Ou...
       val count = names.indexOf(name) + 1
       println("$count. $name")
   }
   
   for (i in 0 until 5) {
       println("[$i] Número ${i+1}")
   }
}