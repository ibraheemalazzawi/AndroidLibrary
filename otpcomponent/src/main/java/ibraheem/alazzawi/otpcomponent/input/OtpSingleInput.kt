package ibraheem.alazzawi.otpcomponent.input

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ibraheem.alazzawi.otpcomponent.advancedShadow

@Composable
fun RowScope.OtpSingleInput(
    input: String,
    style: InputStyle
) {
    Surface(
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .weight(1f)
            .height(50.dp)
            .padding(start = 2.dp, end = 2.dp)
            .advancedShadow()
    ) {
        var solid: Color? = null
        var gradient: Brush? = null

        if (style.solidDisabledColor != null && style.solidEnabledColor != null) {
            solid =
                if (input.isNotEmpty()) style.solidEnabledColor else style.solidDisabledColor
        }
        if (!style.gradientDisabledColor.isNullOrEmpty() && !style.gradientEnabledColor.isNullOrEmpty()) {
            gradient = Brush.horizontalGradient(
                (if (input.isNotEmpty())
                    style.gradientEnabledColor
                else
                    style.gradientDisabledColor)!!
            )
        }
        if (solid == null && gradient == null) {
            throw IllegalArgumentException("Either Solid Color Or Gradient Color Must Be Provided")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier =
            if (gradient != null)
                Modifier.background(gradient).weight(1f)
            else
                Modifier.background(solid!!).weight(1f)
        ) {
            Text(
                text = input,
                color = Color.White,
                fontSize = style.inputFontSize
            )
        }
    }
}