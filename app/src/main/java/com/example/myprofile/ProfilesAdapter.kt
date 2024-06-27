package com.example.myprofile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ProfilesAdapter (var userBlog : List<Profile>):
RecyclerView.Adapter<ProfilesViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfilesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_blog,parent,false)
        return  ProfilesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProfilesViewHolder, position: Int) {
        val profile = userBlog[position]
        holder.tvAuthor.text = profile.author
        holder.tvTitle.text = profile.title
        holder.tvPreview.text = profile.articlePreview
        holder.tvPublish.text = profile.publishingDate
        holder.tvSeeMore.text = profile.viewFullPost

    }

    override fun getItemCount(): Int {
        return  userBlog.size

    }
}

class ProfilesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
    var tvSeeMore = itemView.findViewById<TextView>(R.id.tvSeeMore)
    var tvPublish = itemView.findViewById<TextView>(R.id.tvPublishDate)




}