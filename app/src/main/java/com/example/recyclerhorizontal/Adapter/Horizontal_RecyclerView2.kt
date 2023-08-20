package com.example.recyclerhorizontal.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerhorizontal.R
import com.example.recyclerhorizontal.Adapter.Horizontal_RecyclerView2.MyViewHolder as MyViewHolder1

class Horizontal_RecyclerView2 : RecyclerView.Adapter<Horizontal_RecyclerView2.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Horizontal_RecyclerView2.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }



    override fun getItemCount(): Int {
        return 25
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    class MyViewHolder2(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}