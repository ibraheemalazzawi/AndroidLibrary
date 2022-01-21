package ibraheem.alazzawi.otpcomponent

import android.util.Log

class Logger {
    companion object {
        fun printHi(): String {
            return "Hi"
        }
        fun log(msg: String) {
            Log.d("Ibraheem Al-Azzawi", msg)
        }
    }
}