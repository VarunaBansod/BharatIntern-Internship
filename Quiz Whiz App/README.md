# Weather Forecast Video and Implementions for this app.
https://github.com/VarunaBansod/BharatIntern-Internship/assets/65997106/2965afdc-486a-4850-b4e4-53b3c6f2dd86

## Gradle Build implementation:
Add these in `build.gradle(:app)` inside `dependencies` block
### to use lottie animation:  
` implementation 'com.airbnb.android:lottie:6.1.0' `
</br> </br>
Add this inside `android` block to use **_view binding_**
```
buildFeatures {
        viewBinding = true
        dataBinding = true
    }
``` 
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
