package vista

import model.Usuario
import org.uqbar.arena.kotlin.extensions.*
import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.WindowOwner

/*class UserInformationWindows(owner: WindowOwner, model: Usuario?) : TransactionalDialog<Usuario>(owner, model) {
    override fun createFormPanel(mainPanel: Panel?) {
        Panel(mainPanel) with {
            asHorizontal()
            Label(it) with { text = "Nombre:" }
            TextBox(it) bindTo "nombre"
            Label(it) with { text = "Apellido:" }
            TextBox(it) bindTo "apellido"
            Label(it) with { text = "Email:" }
            TextBox(it) bindTo "email"
            Label(it) with { text = "Constraseña:" }
            TextBox(it) bindTo "constrasenia"
            Button(mainPanel) with {
                caption = "Aceptar"
                onClick { accept() }


            }

        }
    }
}*/
