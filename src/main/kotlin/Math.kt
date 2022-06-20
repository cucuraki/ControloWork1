class Math {
    // greatest common divisior
    fun gcd(n1: Int, n2: Int): Int{
        if(n1 == 0 || n2 == 0)
            return -1
        var num1: Int
        var num2: Int
        if(n1 > n2){
            num1 = n1
            num2 = n2
        }else{
            num1 = n2
            num2 = n1
        }
        var temp: Int
        while(num1 % num2 != 0){
            temp = num1
            num1 = num2
            num2 = temp % num2
        }
        return num2
    }
    //least common multiple
    fun lcm(n1: Int, n2: Int): Int{
        var usg = n1
        if(n2 == 0 || n1 == 0) throw Exception("Can't be devided by 0, so $n1 and $n2 does not have lcm")
        while(usg % n2 != 0){
            usg += n1
        }
        return usg
    }

    fun containsDolarSign(s: String): Boolean{
        return s.contains("$")
    }

    fun zeroToHundredSum(n: Int = 100): Int = if(n==2) 2 else zeroToHundredSum(n-2) + n

    fun reverseInt(n: Int): Int{
        return  n.toString().reversed().toInt()
    }
    fun isPolindrom(st: String): Boolean{
        for(i in st.indices) {
            if(i >= st.length - 1 - i)
                break
            if(st[i] != st[st.length-i-1])
                return false
        }
        return true
    }

}