package vista


import model.DigitalWalletController
import model.DigitalWalletFactory
import model.Usuario
import org.uqbar.arena.kotlin.extensions.*
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.ErrorsPanel
import org.uqbar.arena.windows.MainWindow


fun main()=AddUserWidows(DigitalWalletController(DigitalWalletFactory.get())).startApplication()

class AddUserWidows(digitalWallet: DigitalWalletController):MainWindow<DigitalWalletController>(digitalWallet) {
    override fun createContents(mainPanel: Panel) {
        title = "Agregar Usuario"
        Panel(mainPanel) with {
            asHorizontal()
            ErrorsPanel(mainPanel, "Algo salio mal")
            Label(it) with { text = "Filtrar:" }
            TextBox(it) bindTo ("filter")
            Button(it)
                    .setCaption("Agregar")
                    .onClick {
                    val newUser = Usuario()
                    InfoUser(this@AddUserWidows, newUser)
                            .onAccept { addUser(newUser) }
                    open()
                }

            Button(it).setCaption("Editar")
                    .onClick {
                    InfoUser(this@AddUserWidows, this@AddUserWidows.modelObject.selectedUser).open()

            }
            createUserTable(mainPanel)
        }
    }

    private fun createUserTable(mainPanel: Panel) {
        table<Usuario>(mainPanel) with {
            visibleRows = 5
            bindItemsTo("filteredUser")
            bindSelectionTo("selectedUser")
            column {
                title = "Nombre"
                fixedSize = 200
                bindContentsTo("nombre")
            }
            column {
                title = "Apellido"
                fixedSize = 150
                bindContentsTo("apellido")
            }
            column {
                title = "Correo electronico"
                fixedSize = 150
                bindContentsTo("email")
            }
        }

    }

    private fun addUser(user: Usuario) = modelObject.addUser(user)

}



