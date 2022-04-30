package com.example.prova2904

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var etanol = findViewById<TextView>(R.id.valuee);
        var gasolina = findViewById<TextView>(R.id.valueg);
        var btn = findViewById<Button>(R.id.calcular);

       // lista.onItemClickListener = AdapterView.OnItemClickListener{ _, _, posicao, id ->
       //     Toast.makeText(this, "pos: "+posicao+dados[posicao], Toast.LENGTH_SHORT).show()
        //}


        btn.setOnClickListener(View.OnClickListener() {

            val num1 = etanol.text.toString().toInt();
            val num2 = gasolina.text.toString().toInt();

            var res = 1.0*num1/num2;
            var n = 0.7;

            if(res <= n)
            {
                Toast.makeText(this, "É mais vantajoso o ETANOL ", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "É mais vantajoso a GASOLINA ", Toast.LENGTH_SHORT).show()
            }


        })
    }
}