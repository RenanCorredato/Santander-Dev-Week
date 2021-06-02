package br.com.renancorredato.santanderdevweek.data

data class Conta(
    val numero: String,
    val agencia: String,
    val saldo: String,
    val limete: String,
    val cliente: Cliente,
    val cartao: Cartao

)