package vista

import model.Usuario
import model.DigitalWalletFactory
import org.uqbar.arena.kotlin.extensions.*
import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.ErrorsPanel
import org.uqbar.arena.windows.WindowOwner


class InfoUser(owner: WindowOwner, model: Usuario?) : TransactionalDialog<Usuario>(owner, model) {
    override fun createFormPanel(mainPanel: Panel) {
        ErrorsPanel(mainPanel, "Hola")
        Panel(mainPanel) with {
            asHorizontal()
            Label(it) with { text = "Nombre:" }
            TextBox(it) bindTo "nombre"
        }
        Panel(mainPanel) with {
            Label(it) with { text = "Apellido:" }
            TextBox(it) bindTo "apellido"
        }
        Panel(mainPanel) with {
            Label(it) with { text = "Email:" }
            TextBox(it) bindTo "email"
        }
         /*   Label(it) with { text = "Constraseña:" }
            TextBox(it) bindTo "constrasenia"*/
            Button(mainPanel).setCaption("Aceptar")
                    .onClick {
                        accept() }
        }
    }


