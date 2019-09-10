package model
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.Entity
import org.uqbar.commons.model.annotations.Observable
import org.uqbar.commons.model.annotations.Transactional

@Accessors
@Observable
@Transactional
class Usuario(val nombre: String="", var apellido: String = "",
              /*var dni: String =0,*/ var email:String=""/*,*/
              /*var contrasenia:String=String(), var esAdministrador: Boolean=false*/): Entity()




