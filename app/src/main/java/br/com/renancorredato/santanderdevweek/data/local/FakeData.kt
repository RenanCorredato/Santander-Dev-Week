package br.com.renancorredato.santanderdevweek.data.local

import br.com.renancorredato.santanderdevweek.data.Cartao
import br.com.renancorredato.santanderdevweek.data.Cliente
import br.com.renancorredato.santanderdevweek.data.Conta

class FakeData{
    fun getlocalData() : Conta{

        val cliente = Cliente("Olá, Renan")
        val cartao = Cartao("455556824")
        return Conta(
            "458747-5",
            "5789-8",
            "3.558,80",
            "2.000,00",
            cliente,
            cartao)
    }
}