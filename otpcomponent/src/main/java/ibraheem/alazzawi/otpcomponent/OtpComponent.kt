package ibraheem.alazzawi.otpcomponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import ibraheem.alazzawi.otpcomponent.input.InputStyle
import ibraheem.alazzawi.otpcomponent.input.OtpInput
import ibraheem.alazzawi.otpcomponent.keyboard.KeyStyle
import ibraheem.alazzawi.otpcomponent.keyboard.Keyboard

@Composable
fun OtpComponent(
    onOtpComplete: (String) -> Unit,
    onEnableButtonStateChanged: (Boolean) -> Unit,
    keyTextColor: Color? = Statics.PRIMARY_COLOR,
    numberOfInput: Int? = Statics.NUMBER_OF_INPUT,
    inputStyle: InputStyle? = InputStyle(numberOfInput = numberOfInput?: Statics.NUMBER_OF_INPUT),
    keyStyle: KeyStyle? = KeyStyle(textColor = keyTextColor!!)
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        var otp = remember { mutableStateOf("") }
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Ltr) {
            OtpInput(
                otp = otp.value,
                inputStyle = inputStyle
            )

            Spacer(modifier = Modifier.height(Statics.SPACER_HEIGHT))

            Keyboard(
                keyStyle = keyStyle,
                textColor = keyTextColor,
                onKeyPressed = {
                    if (otp.value.length < numberOfInput!!) {
                        otp.value = "${otp.value}$it"
                        if (otp.value.length == numberOfInput) {
                            onOtpComplete(otp.value)
                            onEnableButtonStateChanged(true)
                        } else {
                            onEnableButtonStateChanged(false)
                        }
                    }
                },
                onDeletePressed = {
                    if (otp.value != "") {
                        otp.value = otp.value.substring(0, otp.value.length - 1)
                    }
                    if (otp.value.length == numberOfInput!!) {
                        onOtpComplete(otp.value)
                    } else {
                        onEnableButtonStateChanged(false)
                    }
                }
            )
        }
    }
}