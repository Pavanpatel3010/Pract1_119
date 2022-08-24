fun userDefine() {
    arithmetic()
}
fun arithmetic() {
    val x: Int = 111
    val y: Int = 2222
    val z: Int = -222

    var ans = x + y + z
    println("Addition of $x, $y, $z is $ans")

    ans = x - y - z
    println("Subtraction of $x, $y, $z is $ans")

    ans = x * y * z
    println("Multiplication of $x, $y, $z is $ans")

    ans = y / x
    println("Division of $x, $y is $ans")
}