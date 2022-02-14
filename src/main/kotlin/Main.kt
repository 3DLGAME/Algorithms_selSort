fun selectionSort(items: MutableList<Int>): MutableList<Int> {

    val n: Int = items.size

    for (i in 0..n-1) {

        for (j in n-1 downTo i) {

            if (items[i] > items[j]) {

                var temp: Int = items[i]
                items[i] = items[j]
                items[j] = temp

            }
        }
    }

    return items

}

fun main() {

    val array: MutableList<Int> = mutableListOf(5, 2, 3, 8, 1, 0)

    println(selectionSort(array))

}