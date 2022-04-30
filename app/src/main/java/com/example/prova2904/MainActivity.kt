package com.example.prova2904

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var next = "->";
        var lista = findViewById<ListView>(R.id.lista);
        var item: ArrayList<String> = ArrayList<String>();
        item.add("Calculo combustível");
        item.add("Perfil do desenvolvedor");
        item.add("API");

        var adapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)
        lista.adapter = adapter
        lista.onItemClickListener = AdapterView.OnItemClickListener{ _, _, pos, id ->
            if (pos == 0) {
                val calculo = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(calculo)
            } else if (pos == 1) {
                val perfil = Intent(this@MainActivity, MainActivity3::class.java)
                startActivity(perfil)
            } else if (pos == 2) {
                val api = Intent(this@MainActivity, MainActivity4::class.java)
                startActivity(api)
            }
        }
    }
}