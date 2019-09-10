package login

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.arena.bindings.ValueTransformer
import org.uqbar.commons.model.annotations.Dependencies
import org.uqbar.commons.model.annotations.Observable


@Accessors
@Observable

class Login {
     var usuario: String=String()
     var password: String=String()
    var passwordValida: String

    constructor (unaPasword:String){
        passwordValida=unaPasword
    }
    @Dependencies("password")
         	fun getPasswordOk() {
        password !== null && password.equals(passwordValida)
    }

    }

