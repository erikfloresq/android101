package com.erikfloresq.recyclerviewdemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.user_item.view.*

class UserAdapter(private val userList :List<User>): RecyclerView.Adapter<UserAdapter.UserAdapterViewHolder>() {

    override fun getItemCount(): Int  = userList.size

    class UserAdapterViewHolder (view : View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): UserAdapterViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent,false)
        return UserAdapterViewHolder(v)
    }

    override fun onBindViewHolder(holder: UserAdapterViewHolder, position: Int) {
        val user = userList[position]
        holder.itemView.tvName.text = user.name
        holder.itemView.tvAge.text = user.age.toString()
    }
}