class BankAccount(var depositedv: Long, var withdrawn: Long){
    var balance: Long = depositedv - withdrawn
}

fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)
}