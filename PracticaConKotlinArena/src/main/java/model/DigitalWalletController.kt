package model

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.annotations.Observable

@Accessors
@Observable
class DigitalWalletController(var digitalWallet: DigitalWallet){
    var filteredUser: MutableList<Usuario> = digitalWallet.users.toMutableList()
    var selectedUser: Usuario? = null
    var filter: String? = ""
        set(value) {
            field=value.toString().toLowerCase()
            search()
        }
    fun search() {
        filteredUser = digitalWallet.users
        .filter { it.nombre.toLowerCase().contains(filter.toString()) }.toMutableList()
    }
    fun addUser(user: Usuario) {
        digitalWallet.register(user)
        search()
    }

}