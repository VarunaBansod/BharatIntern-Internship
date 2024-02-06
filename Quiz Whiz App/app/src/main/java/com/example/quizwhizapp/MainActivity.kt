package com.example.quizwhizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizwhizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var quizModelList : MutableList<QuizModel>
    lateinit var adapter: QuizListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        quizModelList= mutableListOf()
        getDataFromFirebase()
    }
    private fun setUpRecyclerView(){
        //for this we need to create row UI
        adapter = QuizListAdapter(quizModelList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }
    private  fun getDataFromFirebase(){
        //dummy data: to pass this data to UI we have to make companion oject in QuizActivity.kt
        val listQuestionModel1 = mutableListOf<QuestionModel>()
        listQuestionModel1.add(QuestionModel("What is android?", mutableListOf("Language","OS","Product","None"),"OS"))
        listQuestionModel1.add(QuestionModel("Who owns android?", mutableListOf("Apple","Google","Samsung","Microsoft"),"Google"))
        listQuestionModel1.add(QuestionModel("Which assistant android uses?", mutableListOf("Siri","Cortana","Google Assistant","Alexa"),"Google Assistant"))

        val listQuestionModel2 = mutableListOf<QuestionModel>()
        listQuestionModel2.add(QuestionModel("What is the full form of DBMS?", mutableListOf("Data of Binary Management System","Database Management System","Database Management Service","Data Backup Management System"),"Database Management System"))
        listQuestionModel2.add(QuestionModel("What is DBMS?", mutableListOf("Collection of queries","High-level language","Programming language","Stores, modifies and retrieves data"),"Stores, modifies and retrieves data"))
        listQuestionModel2.add(QuestionModel("Who created the first DBMS?", mutableListOf("Edgar Frank Codd","Charles Bachman","Charles Babbage","Sharon B. Codd"),"Charles Bachman"))
        listQuestionModel2.add(QuestionModel("Which type of data can be stored in the database?", mutableListOf("Image oriented data","Text, files containing data","Data in the form of audio or video","All of the above"),"All of the above"))
        listQuestionModel2.add(QuestionModel("Which normalization form is based on the transitive dependency?", mutableListOf("1NF","2NF","3NF","BCNF"),"3NF"))

        val listQuestionModel3 = mutableListOf<QuestionModel>()
        listQuestionModel3.add(QuestionModel("What does SQL stand for?", mutableListOf("Structured Question Language","Strong Question Language","Structured Query Language","None"),"Structured Query Language"))
        listQuestionModel3.add(QuestionModel("Which SQL function is used to count the number of rows in a SQL query?", mutableListOf("COUNT()","NUMBER()","SUM()","COUNT(*)"),"COUNT(*)"))
        listQuestionModel3.add(QuestionModel("Which SQL keyword is used to retrieve a maximum value?", mutableListOf("MOST","TOP","MAX","UPPER"),"MAX"))
        listQuestionModel3.add(QuestionModel("Which of the following SQL clauses is used to DELETE tuples from a database table?", mutableListOf("DELETE","REMOVE","DROP","CLEAR"),"DELETE"))
        listQuestionModel3.add(QuestionModel("Which of the following is not a DDL command?", mutableListOf("UPDATE","TRUNCATE","ALTER","NONE"),"UPDATE"))
        listQuestionModel3.add(QuestionModel("Which of the following are TCL commands?", mutableListOf("TCL","SCL","DCL","DDL"),"SCL"))
        listQuestionModel3.add(QuestionModel("Which SQL statement is used to extract data from a database?", mutableListOf("OPEN","SELECT","GET","EXTRACT"),"EXTRACT"))
        listQuestionModel3.add(QuestionModel("Which SQL statement is used to delete data from a database?", mutableListOf("DELETE","COLLAPSE","REMOVE","All of the above"),"EXTRACT"))

        val listQuestionModel4 = mutableListOf<QuestionModel>()
        listQuestionModel4.add(QuestionModel("What is Kotlin?", mutableListOf("A new version of Java"," A JavaScript framework","A statically-typed programming language for the JVM, Android, and browser","A database management system"),"A statically-typed programming language for the JVM, Android, and browser"))
        listQuestionModel4.add(QuestionModel("Which platform does Kotlin primarily target?", mutableListOf("Python Bytecode","JavaScript","JVM (Java Virtual Machine) Bytecode, Android, and browser","PHP"),"JVM (Java Virtual Machine) Bytecode, Android, and browser"))
        listQuestionModel4.add(QuestionModel("What paradigm(s) does the Kotlin programming language follow?", mutableListOf("Only Object-Oriented","Procedural","Only Functional","Both Object-Oriented and Functional"),"Both Object-Oriented and Functional"))
        listQuestionModel4.add(QuestionModel("How do you declare a variable in Kotlin?", mutableListOf("let myVariable = 10;","val myVariable: Int = 10","const myVariable = 10;","var myVariable: Int = 10"),"var myVariable: Int = 10"))
        listQuestionModel4.add(QuestionModel("How do you define a variable in Kotlin that cannot be reassigned?", mutableListOf("var","val","const","final"),"val"))

        val listQuestionModel5 = mutableListOf<QuestionModel>()
        listQuestionModel5.add(QuestionModel("Who invented Java Programming?",mutableListOf("Guido van Rossum","James Gosling","Dennis Ritchie","Bjarne Stroustrup"),"James Gosling"))
        listQuestionModel5.add(QuestionModel("Which one of the following is not a Java feature?",mutableListOf("Object-oriented","Use of pointers","Portable","Dynamic and Extensible"),"Use of pointers"))
        listQuestionModel5.add(QuestionModel("Which of these cannot be used for a variable name in Java?",mutableListOf("identifier & keyword","identifier","keyword","none of the mentioned"),"keyword"))


        quizModelList.add(QuizModel("1","Android","Basics of Android","10",listQuestionModel1))
        quizModelList.add(QuizModel("2","DBMS","Basics of DBMS","15",listQuestionModel2))
        quizModelList.add(QuizModel("3","SQL","Basic to moderate questions of SQL","20",listQuestionModel3))
        quizModelList.add(QuizModel("4","Kotlin","Basic questions of Kotlin","10",listQuestionModel4))
        quizModelList.add(QuizModel("4","Java","Questions related to JAVA","5",listQuestionModel5))
        setUpRecyclerView()
    }
}