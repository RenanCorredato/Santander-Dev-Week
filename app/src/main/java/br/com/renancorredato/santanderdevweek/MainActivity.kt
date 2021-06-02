package br.com.renancorredato.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // chamdo a main principal
        setSupportActionBar(findViewById(R.id.toolbar)) // chamando pelo id o menu
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