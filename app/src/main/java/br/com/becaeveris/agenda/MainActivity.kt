package br.com.becaeveris.agenda
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2)/ 2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >= 6 && faltas <= 10)  {
                resultado.setText("Aprovado:" + " \n " + ":Nota final:" + media + "\n" + "faltas:" + faltas)
                 resultado.setTextColor(Color.GREEN)
            }else{
                resultado.setText("Reprovado" + "\n" + "Nota final:" + media + "\n" + "faltas:" + faltas)
                resultado.setTextColor(Color.RED)
        }
            resultado.setText(resultado.getText().toString() + "  ")
        }

    }

    override fun onClick(v: View?) {

    }
}
