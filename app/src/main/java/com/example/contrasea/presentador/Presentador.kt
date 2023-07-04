package com.example.contrasea.presentador

import com.example.contrasea.modelo.Modelo

class presentador (private val view:Ipresentador){
    private val model: Modelo
    init {
        model = Modelo()
    }
    fun validarContraseña(contraseña:String){
        if (model.validarContraseña(contraseña)==1){
            view.colorRojo(model.validarContraseña(contraseña))
        }else  if (model.validarContraseña(contraseña)==2){
            view.colorAmarillo(model.validarContraseña(contraseña))
        }else{
            view.colorVerde(model.validarContraseña(contraseña))
        }
    }
}