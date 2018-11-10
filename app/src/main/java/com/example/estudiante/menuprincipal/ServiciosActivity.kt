package com.example.estudiante.menuprincipal

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ServiciosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicios)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        Toast.makeText( this, "Opcion de Servicios", Toast.LENGTH_LONG).show()
        Toast.makeText( this, "Evento no definido", Toast.LENGTH_LONG).show()

    }
}
