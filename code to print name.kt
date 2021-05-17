fun inputData(data:String):String{
    print(data)
    return readLine()!!
}
fun main() {
    var type = 0
    var name = listOf<String?>()
    var age = listOf<Int?>()

    while (true) {
        val input = inputData("Mulai Y/N: ")
        if (input == "N" || input == "n") {
            break
        }
        type++
        if (input == "Y" || input == "y") {
            name = name + inputData("Input nama : ")
            age = age + inputData("Input usia : ").toIntOrNull()

            var data = name zip age
            println(data.joinToString(separator = " | "))
        }
    }
}
