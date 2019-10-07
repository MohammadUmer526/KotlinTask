package com.muhammadumer.kotlintask.ui.post

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.muhammadumer.kotlintask.R
import com.muhammadumer.kotlintask.databinding.ItemPostBinding

import com.muhammadumer.kotlintask.model.Post



class PostListAdapter(var clickListener: (Post) -> Unit): RecyclerView.Adapter<PostListAdapter.ViewHolder>() {
    private lateinit var postList:List<Post>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemPostBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_post, parent, false)
        return ViewHolder(binding)
    }

    // binding the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(postList[position],clickListener)
    }

    override fun getItemCount(): Int {
        return if(::postList.isInitialized) postList.size else 0
    }



    fun updatePostList(postList:List<Post>){
        this.postList = postList
        notifyDataSetChanged()
    }

    class ViewHolder( private val binding: ItemPostBinding ):RecyclerView.ViewHolder(binding.root){
        private val viewModel = PostViewModel()

        fun bind(post: Post, clickListener: (Post)->Unit){
            viewModel.bind(post)
            binding.viewModel = viewModel
            binding.root.setOnClickListener {
                (clickListener(post))
            }

        }

        }

}