fun main() {
    print("Введите целое число n: ")
    val n = readln().toDouble()
    print("Введите основание степени x: ")
    val x = readln().toDouble()
    if (x == 1.0)
    {
        if (n == 1.0)
        {
            println("Подходит любое число y (1^y = 1)")
        }
        else
        {
            println("Целочисленный показатель не существует.")
        }
        return
    }
    if (x == 0.0)
    {
        if (n == 0.0)
        {
            println("y - любое положительное число")
        }
        else
        {
            println("Целочисленный показатель не существует.")
        }
        return
    }
    val y = kotlin.math.log(n, x)
    if (y % 1 == 0.0)
    {
        println("Целочисленный показатель равен $y")
    }
    else
    {
        println("Целочисленный показатель не существует.")
    }
}