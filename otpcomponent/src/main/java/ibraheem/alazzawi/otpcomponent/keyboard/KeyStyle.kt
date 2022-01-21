package ibraheem.alazzawi.otpcomponent.keyboard

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import ibraheem.alazzawi.otpcomponent.Statics

data class KeyStyle(
    var height: Dp? = Statics.KEY_HEIGHT,
    var keyFontSize: TextUnit? = Statics.FONT_SIZE,
    var textColor: Color
)
