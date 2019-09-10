package vista
import login.Login
import org.uqbar.arena.kotlin.extensions.*
import org.uqbar.arena.widgets.*
import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.layout.ColumnLayout



fun main()= VentanaDeLogin(Login("Ale")).startApplication()

class VentanaDeLogin(model: Login):MainWindow<Login>(model) {
    override fun createContents(mainPanel: Panel?) {
            val searchFormPanel = Panel(mainPanel)
            searchFormPanel.setLayout(ColumnLayout(2))
            Label(searchFormPanel) with {

                text = "Correo electronico"
                width = 200
                //height=200
                fontSize = 16
                align = "center"


            }
            TextBox(searchFormPanel) with {
                align = "center"
                width = 100
                setWidth(20)
                bindTo("usuario")
            }

            Label(searchFormPanel) with {
                text = "Constraseña"
                width = 200
                //height=200
                fontSize = 16
                alignCenter()
            }
            PasswordField(searchFormPanel) with {
                width = 100
                bindTo("password")
            }
           /* Button(mainPanel) with {
                caption = "Inicio"
                alignCenter()
            }*/
            Label(searchFormPanel) with {
                 bindTo("password")//.setTransformer(PasswordTransformer())
            }

        }
    }








