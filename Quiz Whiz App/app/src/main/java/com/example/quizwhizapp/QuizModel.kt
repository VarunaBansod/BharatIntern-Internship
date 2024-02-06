package com.example.quizwhizapp

data class QuizModel(
    val id: String,
    val title: String,
    val subtitle: String,
    val time: String,
    val question: List<QuestionModel>
){

    constructor():this("","","","", emptyList())
}

data class QuestionModel(
    val question : String,
    val options: List<String>,
    val correct: String,
) {
    constructor() : this("", emptyList(), "")
}
