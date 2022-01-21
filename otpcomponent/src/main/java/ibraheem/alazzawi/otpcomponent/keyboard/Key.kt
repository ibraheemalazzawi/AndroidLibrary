package ibraheem.alazzawi.otpcomponent.keyboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RowScope.Key(
    number: String,
    onKeyPressed: (String) -> Unit,
    isNumber: Boolean = true,
    isEmpty: Boolean = false,
    textColor: Color? = Color.Black,
    style: KeyStyle? = KeyStyle(textColor = textColor!!)
) {
    if(textColor == null && style == null){
        throw IllegalArgumentException("Either TextColor Or KeyStyle Must Be Provided")
    }
    if (isEmpty) {
        Spacer(
            modifier = Modifier
                .weight(1f)
                .height(style!!.height!!)
        )
    } else {
        Button(
            onClick = {onKeyPressed(number)},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
            contentPadding = PaddingValues(0.dp),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 0.dp,
                pressedElevation = 0.dp
            ),
            modifier = Modifier
                .background(Color.Transparent)
                .weight(1f)
                .height(style!!.height!!)
        ) {
            if (isNumber) {
                Text(
                    text = number,
                    color = style.textColor,
                    fontSize = style.keyFontSize!!
                )
            } else {
                Icon(
                    Icons.Default.ArrowBackIosNew,
                    tint = style.textColor,
                    contentDescription = "",
                    modifier = Modifier.size((style.keyFontSize!!.value-2).dp)
                )
            }
        }
    }
}