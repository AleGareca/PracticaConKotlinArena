package login

import org.uqbar.arena.bindings.ValueTransformer
import java.awt.Color

class PasswordTransformer(): ValueTransformer<Boolean, Color> {
    override fun viewToModel(valueFromView: Color?): Boolean {
        return false
    }

    override fun getModelType()=Boolean::class.java



    override fun modelToView(valueFromModel: Boolean?): Color {
        return if(valueFromModel!!) Color.GREEN else Color.ORANGE
    }

    override fun getViewType(): Class<Color>? = String::class.java as Class<Color>?

}