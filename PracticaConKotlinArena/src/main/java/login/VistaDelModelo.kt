package login


import model.DigitalWallet
import model.Usuario
import org.uqbar.commons.model.annotations.Observable

@Observable
class VistaDelModelo(var digitalWallet: DigitalWallet) {


    fun estaLoguiado(){

    }


    fun agregarUsuario(nombre: String, apellido: String,
                       email:String/*, constrasenia:String, esAdministrador: Boolean*/){

        var usuario= Usuario(nombre, apellido, email)
        digitalWallet.register(usuario)

    }

}








