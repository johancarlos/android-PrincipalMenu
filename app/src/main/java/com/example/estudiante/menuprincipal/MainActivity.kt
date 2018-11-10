package com.example.estudiante.menuprincipal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_servicios.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bntServicios.setOnClickListener({
            textbnt.text= "Servicios"
        })
        bntPortafolio.setOnClickListener({
            textbnt.text= "Portafolio"
        })
        bntAcerca.setOnClickListener({
            textbnt.text= "Acerca de"
        })
        bntContacto.setOnClickListener({
            textbnt.text= "Contacto"
        })
        bntRedes.setOnClickListener({
            textbnt.text= "Redes Sociales"
        })

        bntServicios.setOnClickListener({
            val intent: Intent = Intent(this, ServiciosActivity::class.java)
            startActivity(intent)
        })
    }


}
