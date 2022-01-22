# Android Jetpack Compose - OTP Component
[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)

A simple library that provides an easy to use OTP component.

## Screenshots
![image](https://user-images.githubusercontent.com/9570828/150615542-48c20519-1dbe-4585-8afb-7f7a93f046d0.png)
<br/>
<img src="https://user-images.githubusercontent.com/9570828/150615780-b0f8c6c7-e12c-44fd-9e40-7fc3fd409110.gif" height="650"/>


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
