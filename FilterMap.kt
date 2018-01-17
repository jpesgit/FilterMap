fun main(args: Array<String>) {
    var arrayList = arrayListOf("Joao", "Ana", "Andre")
    println(arrayList)
    
    println(":. Add Arraylist item Julia")
    arrayList.add("Julia")
    println(arrayList)

    println(":. List filtered")
    var  listFiltered =arrayList.filter{it == "Joao"}.map{it}
    println(listFiltered)

    println(":. Remove Arraylist item Joao")
    arrayList.remove("Joao")
    println(arrayList)

    println(":. Size Arraylist")
    println(arrayList.size)

    println(":. Is Empty Arraylist?")
    println(arrayList.isEmpty())

    println(":. Arraylist contains Andre")
    println(arrayList.contains("Andre"))

    println(":. Show arraylist item by item")
        for (nome in arrayList) {
            println(nome)
        }
}