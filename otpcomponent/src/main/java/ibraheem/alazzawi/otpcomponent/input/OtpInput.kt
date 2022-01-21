package ibraheem.alazzawi.otpcomponent.input

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun OtpInput(
    otp: String,
    inputStyle: InputStyle? = InputStyle()
) {
    val otps = if (otp.length >= inputStyle!!.numberOfInput) otp.substring(0, inputStyle.numberOfInput) else otp
    Column(
        modifier = Modifier.fillMaxWidth(fraction = 0.8f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row {
            for (i in otps.indices) {
                OtpSingleInput(
                    input = otps.elementAt(i).toString(),
                    style = inputStyle
                )
            }
            for (i in 0 until inputStyle.numberOfInput - otps.length) {
                OtpSingleInput(
                    input = "",
                    style = inputStyle
                )
            }
        }
    }
}