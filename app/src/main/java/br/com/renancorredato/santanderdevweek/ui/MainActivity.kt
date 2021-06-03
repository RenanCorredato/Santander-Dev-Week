package br.com.renancorredato.santanderdevweek.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.renancorredato.santanderdevweek.R
import br.com.renancorredato.santanderdevweek.data.Conta

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // chamdo a main principal
        setSupportActionBar(findViewById(R.id.toolbar)) // chamando pelo id o menu

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        buscarContaCliente()
    }

    private fun buscarContaCliente(){
        mainViewModel.buscarContaCliente().observe(this, Observer {result ->
            bindOnView(result)
        })
    }

    private fun bindOnView(conta: Conta){
        findViewById<TextView>(R.id.tv_agencia).text = conta.agencia
        findViewById<TextView>(R.id.tv_conta_corrente).text = conta.numero
        findViewById<TextView>(R.id.tv_saldo).text = conta.saldo
        findViewById<TextView>(R.id.tv_limite).text = conta.limete
        findViewById<TextView>(R.id.tv_usuario).text = conta.cliente.nome
        findViewById<TextView>(R.id.tv_cartao_final_value).text = conta.cartao.numeroCartao
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean { // sobre escrendo o metodo do meu e infaldno ( criando corpo)
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean { // escutando item do menu
        return  when (item.itemId) {
            R.id.item_1 -> {
                true

            }
            else -> super.onOptionsItemSelected(item)
        }
    }



}