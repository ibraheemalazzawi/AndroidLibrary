package ibraheem.alazzawi.otpcomponent.input

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import ibraheem.alazzawi.otpcomponent.Statics

data class InputStyle (
    var numberOfInput: Int = Statics.NUMBER_OF_INPUT,
    var solidEnabledColor: Color? =  Statics.PRIMARY_COLOR,
    var solidDisabledColor: Color? = Statics.PRIMARY_COLOR,
    var gradientEnabledColor: List<Color>? = null,
    var gradientDisabledColor: List<Color>? = null,
    var inputFontSize: TextUnit = Statics.FONT_SIZE
)