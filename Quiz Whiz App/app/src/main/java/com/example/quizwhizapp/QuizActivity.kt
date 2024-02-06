package com.example.quizwhizapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import com.example.quizwhizapp.databinding.ActivityQuizBinding
import com.example.quizwhizapp.databinding.ScoreDialogueBinding

// for option and next button to work-> seton click listener created
class QuizActivity : AppCompatActivity(), View.OnClickListener {
    companion object{
        //we can use questiomodellist in quizActivity as well as main actiity
        var questionModelList : List<QuestionModel> = listOf()
        var time:String=""
    }
    lateinit var binding: ActivityQuizBinding
    var currentQuestionIndex =0;
    var selectedAnswer=""
    var score=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //set on click listeners to buttons and options
        binding.apply {
            btnA.setOnClickListener(this@QuizActivity)
            btnB.setOnClickListener(this@QuizActivity)
            btnC.setOnClickListener(this@QuizActivity)
            btnD.setOnClickListener(this@QuizActivity)
            btnNext.setOnClickListener(this@QuizActivity)
        }
        loadQuestions() //to load questions and options in sequence
        startTimer()
    }

    private fun startTimer() {
        //we can use handler timer also, but here we are using countdown timer
        val totalTimeinMillis = time.toInt() *60 *1000L //*60 for sec and *1000 for milli sec
        object :CountDownTimer(totalTimeinMillis,1000L){
            override fun onTick(millisUnitilFinished: Long) {
                //this will be called every sec
                var seconds= millisUnitilFinished/1000 //converting from milli sec to sec
                val minutes = seconds/60 //converting sec to min
                val remainingSeconds = seconds % 60
                binding.timeIndicatorText.text = String.format("%02d:%02d",minutes,remainingSeconds)
            }

            override fun onFinish() {
                //Finish the quiz
            }
        }.start() //to start the timer start() is must
    }

    private fun loadQuestions(){
        selectedAnswer="" //selected answer is empty then it should not store score
        if(currentQuestionIndex== questionModelList.size){ //if it is last que.
            finishQuiz()
            return
        }

        //to get question model list in sequence: currentQuestionNo/TotalQuestions
        //to get progress indicator according to question num
        binding.apply {//loading current question
            quesitonIndicatorText.text = "Question ${currentQuestionIndex+1}/${questionModelList.size}" //to get current question index
            questionProgressIndicator.progress = (currentQuestionIndex.toFloat()/ questionModelList.size.toFloat()*100).toInt() //to get progress indicator
            questionTextView.text = questionModelList[currentQuestionIndex].question //to get questions
            btnA.text = questionModelList[currentQuestionIndex].options[0] //to get otpions
            btnB.text = questionModelList[currentQuestionIndex].options[1] //to get otpions
            btnC.text = questionModelList[currentQuestionIndex].options[2] //to get otpions
            btnD.text = questionModelList[currentQuestionIndex].options[3] //to get otpions
        }

    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun finishQuiz() {
        //made score_dialogue.xml
        val totalQuiestions= questionModelList.size
        val percentage = ((score.toFloat()/totalQuiestions.toFloat())*100).toInt()

        val dialogBinding = ScoreDialogueBinding.inflate(layoutInflater)
        dialogBinding.apply {
            scoreProgressIndicator.progress=percentage
            scoreProgressText.text ="$percentage %"
            if(percentage>60){
                scoreTitle.text="Congrats!! You have passed"
                scoreTitle.setTextColor(getColor(R.color.bluish_purple))
            }else{
                scoreTitle.text="OOPS!! You have failed"
                scoreTitle.setTextColor(getColor(R.color.magenta_pink))
                finishBtn.setBackgroundColor(getColor(R.color.magenta_pink))
                scoreProgressIndicator.setIndicatorColor(getColor(R.color.magenta_pink))
            }
            scoreSubtitle.text = "$score out of $totalQuiestions are correct"
            finishBtn.setOnClickListener{
                finish()
            }
        }
        //everything done now we have to show this as alert dialogue box
        AlertDialog.Builder(this)
            .setView(dialogBinding.root).setCancelable(false).show()
    }

    //for options and next button to work properly
    override fun onClick(view: View?) {
        val clickedBtn = view as Button

        binding.apply {
            btnA.setBackgroundColor(getColor(R.color.green))
            btnB.setBackgroundColor(getColor(R.color.green))
            btnC.setBackgroundColor(getColor(R.color.green))
            btnD.setBackgroundColor(getColor(R.color.green))
            if(clickedBtn.id==R.id.btnNext){
                //next button is clicked
                if(selectedAnswer== questionModelList[currentQuestionIndex].correct){
                    score++
                    Log.i("Score of quiz",score.toString())
                }
                currentQuestionIndex++
                loadQuestions()
            }else{
                //options button is clicked
                selectedAnswer = clickedBtn.text.toString()
                clickedBtn.setBackgroundColor(getColor(R.color.light_pink))
            }
        }


    }
}