fun main(){
    odd()
    var names=getname(arrayOf("carol","nyambura","mugo","rachel"))
    println(names)
    getrobot(8)
    getrobot(6)
    getrobot(12)
    noofmultiplication()



}
fun odd(){
    for (num in  1..100)
        if ((num%2)!=0){
            println(num)
        }
}
fun getname(names:Array<String>):Int{
    var name =0
    names.forEach {lengths->
        if(lengths.length>5)
            name++
    }
    return name

}
fun getrobot(age:Int){
    if(age<=6){
        println("glass of milk")
    }
    else{
        println("cocacola")
    }
}
fun noofmultiplication(){
    for(num in 1..100){
        if((num%3==0)){
            println("fizz")
        }
        else if(num%5==0){
            println("buzz")
        }
        if(num%3==0 && num%5==0)
            println("fizzbuzz")
    }

}
