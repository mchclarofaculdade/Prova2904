package com.example.prova2904

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

import java.util.ArrayList

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var lista_api = findViewById<ListView>(R.id.lista_api);
        var dados_api: ArrayList<String> = ArrayList<String>();
        var url_itens = "https://restcountries.com/v3.1/lang/spa"
        dados_api.add("Itens do json")


        var adapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, dados_api)
        lista_api.adapter = adapter
        lista_api.onItemClickListener = AdapterView.OnItemClickListener{ _, _, pos, id ->
            var url = "https://restcountries.com/v3.1/lang/spa${dados_api[1]}"
            Toast.makeText(this, url, Toast.LENGTH_LONG).show()
            var i = Intent(this, MainActivity2::class.java).apply {
            }
            startActivity(i)
        }
    }
}