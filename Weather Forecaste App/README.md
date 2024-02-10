# Weather Forecast Video and Implementions for this app.
https://github.com/VarunaBansod/BharatIntern-Internship/assets/65997106/4b0309ec-23ef-4e9b-a3c8-846690a5e609

## Gradle Build implementation:
Add these in `build.gradle(:app)` inside `dependencies` block
### 1. to use lottie animation:  
` implementation 'com.airbnb.android:lottie:6.1.0' `
### 2. to fetch data from api:
` implementation 'com.squareup.retrofit2:retrofit:2.9.0' `
### 3. to get json data in list form and to use it in app:
` implementation 'com.squareup.retrofit2:converter-gson:2.9.0' `
</br> </br>
Add this inside `android` block to use **_view binding_**
```
buildFeatures {
        viewBinding = true
        dataBinding = true
    }
```
## This application needs INTERNET permission to fetch data from api 
Add following in **AndroidManifest.xml** above *application* : </br>
` <uses-permission android:name="android.permission.INTERNET" /> `

## To use lottie animation in you project
### 1. make "raw" folder to store json files of animation
Follow these steps:<br>
1. Right click on **res** folder of your project
2. Go to **New**
3. Go to **Folder**
4. Click on **Raw resource folder**
5. Click on **Finish**
### 2. Add following in you **.xml** file
```
<com.airbnb.lottie.LottieAnimationView
        android:id="@+id/lottieAnimationView"
        android:layout_width="150dp" //Adjust dimensions, padding, margin, and constraints as required.
        android:layout_height="100dp"
        app:lottie_autoPlay="true" //Lottie animation plays automatically upon view rendering
        app:lottie_loop="true" //Ensure animation loops indefinitely,even after animation duration completes.
        app:lottie_rawRes="@raw/sun_json" /> //replace @raw/sun_json with you file path
```

## To use api of Open Weather:
### In Open Weather Site
Follow these steps: </br>
1. Go to [open weateher site](https://openweathermap.org/)
2. Signup, (after 20-30min your api key will get activated)
4. Now toggle down *your name* from top navigation bar
5. Click on **My API Key**
6. There you'll get key, copy it
7. Paste `https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}` in another tab
8. replace {API key} with your key and {city name} with your favourite city name, press enter 
10. data will be shown copy that data (this will be used in your application)
### In you Android studio
Follow these steps: </br>
1. click on ![image](https://github.com/VarunaBansod/BharatIntern-Internship/assets/65997106/96918ea0-7eb1-4a8c-b2f1-2ac2632c86c3) or ![image](https://github.com/VarunaBansod/BharatIntern-Internship/assets/65997106/0ce89a3b-cb1c-406b-be16-24be39bc539d)
 icon, [on right top side]
2. click on `Plugins`
3. in **MarketPlace** type `js` , install `JSON to Kotlin Class`
4. Now right click `com.eg.appName`
5. Go to `New`
6. Click on `Kotlin data class from JSON`
7. A popup will open, paste the `openweatherAPI data` that you got from site after entering city and api key
8. type class name as `WeatherApp` and click on Generate
9. Few kotlin files will  get created automatically
10. Now make *interface class* named `ApiInterface` and *data class* named `WeatherApp`
### Links of important kt and xml files:
1. [MainActivity.kt](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Weather%20Forecaste%20App/app/src/main/java/com/example/weatherapp/MainActivity.kt)
2. [activity_main.xml](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Weather%20Forecaste%20App/app/src/main/res/layout/activity_main.xml)
3. [SplashActivity.kt](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Weather%20Forecaste%20App/app/src/main/java/com/example/weatherapp/SplashActivity.kt)
4. [activity_splash.xml](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Weather%20Forecaste%20App/app/src/main/res/layout/activity_splash.xml)
5. [ApiInterface.kt](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Weather%20Forecaste%20App/app/src/main/java/com/example/weatherapp/ApiInterface.kt)
6. [WeatherApp.kt](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Weather%20Forecaste%20App/app/src/main/java/com/example/weatherapp/WeatherApp.kt)
7. [AndroidManifest.xml](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Weather%20Forecaste%20App/app/src/main/AndroidManifest.xml)
8. [build.gradle](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Weather%20Forecaste%20App/app/build.gradle)






