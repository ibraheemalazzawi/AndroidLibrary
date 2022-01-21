package ibraheem.alazzawi.otpcomponent.keyboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import ibraheem.alazzawi.otpcomponent.Statics


@Composable
fun Keyboard(
    onKeyPressed: (String) -> Unit,
    onDeletePressed: () -> Unit,
    textColor: Color? = Statics.PRIMARY_COLOR,
    keyStyle: KeyStyle? = KeyStyle(textColor = textColor!!)
) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Key(
                    number = "1",
                    onKeyPressed = onKeyPressed,
                    textColor = textColor,
                    style = keyStyle
                )
                Key(
                    number = "2",
                    onKeyPressed = onKeyPressed,
                    textColor = textColor,
                    style = keyStyle
                )
                Key(
                    number = "3",
                    onKeyPressed = onKeyPressed,
                    textColor = textColor,
                    style = keyStyle
                )
            }
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Key(
                    number = "4",
                    onKeyPressed = onKeyPressed,
                    textColor = textColor,
                    style = keyStyle
                )
                Key(
                    number = "5",
                    onKeyPressed = onKeyPressed,
                    textColor = textColor,
                    style = keyStyle
                )
                Key(
                    number = "6",
                    onKeyPressed = onKeyPressed,
                    textColor = textColor,
                    style = keyStyle
                )
            }
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Key(
                    number = "7",
                    onKeyPressed = onKeyPressed,
                    textColor = textColor,
                    style = keyStyle
                )
                Key(
                    number = "8",
                    onKeyPressed = onKeyPressed,
                    textColor = textColor,
                    style = keyStyle
                )
                Key(
                    number = "9",
                    onKeyPressed = onKeyPressed,
                    textColor = textColor,
                    style = keyStyle
                )

            }
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Key(
                    number = "",
                    onKeyPressed = onKeyPressed,
                    textColor = textColor,
                    style = keyStyle,
                    isEmpty = true
                )
                Key(
                    number = "0",
                    onKeyPressed = onKeyPressed,
                    textColor = textColor,
                    style = keyStyle
                )
                Key(
                    number = "<",
                    onKeyPressed = { onDeletePressed() },
                    textColor = textColor,
                    style = keyStyle,
                    isNumber = false
                )
            }
        }
    }
}