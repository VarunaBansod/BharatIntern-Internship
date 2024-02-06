package com.example.quizwhizapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizwhizapp.databinding.QuizItemRecyclerRowBinding

class QuizListAdapter(private val quizModelList:List<QuizModel>):
    RecyclerView.Adapter<QuizListAdapter.MyViewHolder>() {
    class MyViewHolder (private val binding: QuizItemRecyclerRowBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(model:QuizModel){
            //here we'll bind the views
            binding.apply {
                quizTitle.text = model.title
                quizSubtitle.text= model.subtitle
                quizTimeText.text = model.time +" min"
                root.setOnClickListener{
                    val intent=Intent(root.context,QuizActivity::class.java)
                    QuizActivity.questionModelList = model.question //to get question for each list
                    QuizActivity.time= model.time //showing dynamic time on App
                    root.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding=QuizItemRecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return quizModelList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(quizModelList[position])
    }
}