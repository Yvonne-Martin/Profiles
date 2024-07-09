package com.example.myprofile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.myprofile.databinding.UserBlogBinding
import com.squareup.picasso.Picasso

class ProfilesAdapter (var userBlog : List<Profile>):
RecyclerView.Adapter<ProfilesViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfilesViewHolder {
        val binding = UserBlogBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return  ProfilesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfilesViewHolder, position: Int) {
        val profile = userBlog[position]
        holder.binding.tvAuthor.text = profile.author
        holder.binding.tvTitle.text = profile.title
        holder.binding.tvPreview.text = profile.articlePreview.substring(0,100)
        holder.binding.tvPublishDate.text = profile.publishingDate
        holder.binding.tvSeeMore.text = profile.viewFullPost
        
        Picasso
            .get()
            .load(profile.articlePhoto)
            .placeholder(R.drawable.pic)
            .resize(400, 160)
            .centerCrop()
            .into(holder.binding.ivArticlePhoto)

    }

    override fun getItemCount(): Int {
        return  userBlog.size

    }
}

class ProfilesViewHolder(val binding : UserBlogBinding)
    :RecyclerView.ViewHolder(binding.root)