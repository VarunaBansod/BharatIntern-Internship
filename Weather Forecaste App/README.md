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
</br> </br>
## This application needs INTERNET permission to fetch data from api 
Add following in **AndroidManifest.xml** above *application* : </br>
` <uses-permission android:name="android.permission.INTERNET" /> `
</br> </br>

## To use lottie animation in you project
### make "raw" folder to store json files of animation
Follow these steps:<br>
1. Right click on **res** folder of your project
2. Go to **New**
3. Go to **Folder**
4. Click on **Raw resource folder**
5. Click on **Finish**
### Add following in you **.xml** file
```
<com.airbnb.lottie.LottieAnimationView
        android:id="@+id/lottieAnimationView"
        android:layout_width="150dp" //Adjust dimensions, padding, margin, and constraints as required.
        android:layout_height="100dp"
        app:lottie_autoPlay="true" //Lottie animation plays automatically upon view rendering
        app:lottie_loop="true" //Ensure animation loops indefinitely,even after animation duration completes.
        app:lottie_rawRes="@raw/sun_json" /> //replace @raw/sun_json with you file path
```






