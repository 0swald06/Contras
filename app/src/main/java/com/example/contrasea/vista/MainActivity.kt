package com.example.contrasea.vista

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.contrasea.databinding.ActivityMainBinding
import com.example.contrasea.presentador.Ipresentador

class MainActivity : AppCompatActivity(), Ipresentador {

    private lateinit var  mBinding : ActivityMainBinding
    private lateinit var  presentador:Presentador


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)


        var pwd=mBinding.Contra2.text.toString()
        presentador= Presentador(this)
        mBinding.enviar.setOnClickListener {

            tomarContraseña()

       // mBinding.Contra2.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), android.R.color.holo_blue_dark))
    }
    private fun tomarContraseña(){

        presentador.validarContraseña(pwd)


    }
    override fun colorRojo(contraseña: Int) {
        val toast = Toast.makeText(applicationContext, "Contraseña insegura", Toast.LENGTH_LONG)
        toast.show()
    }

    override fun colorAmarillo(contraseña: Int) {
        val toast = Toast.makeText(applicationContext, "Contraseña mediana mente segura", Toast.LENGTH_LONG)
        toast.show()
    }

    override fun colorVerde(contraseña: Int) {
        val toast = Toast.makeText(applicationContext, "Contraseña segura", Toast.LENGTH_LONG)
        toast.show()
    }


}