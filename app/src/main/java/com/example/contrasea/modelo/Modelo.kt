package com.example.contrasea.modelo

class Modelo {

    fun validarContraseña(pwd: String): Int {
        var rtn = true
        var seguidos = 0
        var ultimo = 0xFF.toChar()
        var minuscula = 0
        var mayuscula = 0
        var numero = 0
        var especial = 0
        val espacio = false
        if (pwd.length < 5 ){ return 1}else{ return 0}

        if (pwd.length >= 5 ) {
            for (i in 0 until pwd.length) {
                val c = pwd[i]


                if (c >= 'A' && c < '[') mayuscula++

                if (mayuscula == 0) {
                    return 2
                }else{return 3}
            }
        }else{ return 0}

    }
}