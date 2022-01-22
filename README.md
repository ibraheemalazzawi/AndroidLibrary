# Android Jetpack Compose - OTP Component
[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)

A simple library that provides an easy to use OTP component.


## Gradle
Step 1. Add the JitPack repository to your build file
```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
Step 2. Add the dependency
```groovy
dependencies {
    implementation 'com.github.ibraheemalazzawi:android-compose-otp:v1.0.0.alpha02'
}
```

## Usage
### Minimum Configurations
```kotlin
OtpComponent(
    onOtpComplete = { otp ->
        //The otp is complete and returned 
    },
    onEnableButtonStateChanged = { state ->
        //To attach the otp component with a button, you can use this status to
        //enable or disable the button
    }
)
```
### Customized Configurations
```kotlin
OtpComponent(
    onOtpComplete = { otp ->
        //The otp is complete and returned
    },
    onEnableButtonStateChanged = { state ->
        //To attach the otp component with a button, you can use this status to
        //enable or disable the button
    },
    numberOfInput = 4,
    keyStyle = KeyStyle(
        height = 30.dp,
        textColor = Primary,
        keyFontSize = 20.sp
    ),
    inputStyle = InputStyle(
        gradientEnabledColor = listOf(Primary, PrimaryDark),
        gradientDisabledColor = listOf(Accent, AccentLight),
        inputFontSize = 20.sp
    )
)
```


## License

[Apache License](https://github.com/ibraheemalazzawi/android-compose-otp/blob/master/LICENSE)
