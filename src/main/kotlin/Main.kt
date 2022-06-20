fun main(args: Array<String>) {
    val obj = Math()
    println(obj.gcd(124, 24))
    println(obj.gcd(3465,3135))
    println(obj.gcd(0,0))
    println(obj.lcm(124,52))
    println(obj.lcm(125,150))
    try {
        println(obj.lcm(0, 0))
    }
    catch (e: Exception){
        println(e.message)
    }
    println(obj.containsDolarSign("234"))
    println(obj.containsDolarSign("2$34"))
    println(obj.zeroToHundredSum())
    println(obj.reverseInt(123))
    println(obj.reverseInt(1134))
    println(obj.reverseInt(10220))
    obj.isPolindrom("2234")
    println(obj.isPolindrom("asdfffdsas"))
    println(obj.isPolindrom(""))
    println(obj.isPolindrom("asdfdsa"))
}