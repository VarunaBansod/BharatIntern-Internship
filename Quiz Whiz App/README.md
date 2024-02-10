# Quiz App Video and Implementions for this app.
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
### Links of important kt and xml files:
1. [MainActivity.kt](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Quiz%20Whiz%20App/app/src/main/java/com/example/quizwhizapp/MainActivity.kt)
2. [QuizActivity.kt](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Quiz%20Whiz%20App/app/src/main/java/com/example/quizwhizapp/QuizActivity.kt)
3. [QuizListAdapter.kt](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Quiz%20Whiz%20App/app/src/main/java/com/example/quizwhizapp/QuizListAdapter.kt)
4. [QuizModel.kt](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Quiz%20Whiz%20App/app/src/main/java/com/example/quizwhizapp/QuizListAdapter.kt)
5. [SplashActivity.kt](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Quiz%20Whiz%20App/app/src/main/java/com/example/quizwhizapp/SplashActivity.kt)
6. [activity_main.xml](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Quiz%20Whiz%20App/app/src/main/res/layout/activity_main.xml)
8. [activity_splash.xml](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Quiz%20Whiz%20App/app/src/main/res/layout/activity_splash.xml)
9. [activity_quiz.xml](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Quiz%20Whiz%20App/app/src/main/res/layout/activity_quiz.xml)
10. [quiz_item_recycler_row.xml](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Quiz%20Whiz%20App/app/src/main/res/layout/quiz_item_recycler_row.xml)
11. [score_dialogue.xml](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Quiz%20Whiz%20App/app/src/main/res/layout/score_dialogue.xml)
12. [AndroidManifest.xml](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Quiz%20Whiz%20App/app/src/main/AndroidManifest.xml)
13. [build.gradle](https://github.com/VarunaBansod/BharatIntern-Internship/blob/master/Quiz%20Whiz%20App/app/build.gradle)
