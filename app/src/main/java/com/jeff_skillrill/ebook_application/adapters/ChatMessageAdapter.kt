package com.jeff_skillrill.ebook_application.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jeff_skillrill.ebook_application.databinding.MessageCardBinding
import com.jeff_skillrill.ebook_application.dataclasses.ChatMessage

class ChatMessageAdapter(  private val msgs: MutableList<ChatMessage>
) : RecyclerView.Adapter<ChatMessageAdapter.TaskViewHolder>() {

    class TaskViewHolder(val binding: MessageCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(
            MessageCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    fun addMessage(msg: ChatMessage) {
        msgs.add(msg)
        notifyItemInserted(msgs.size - 1)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val currentMsg = msgs[position]
        holder.binding.apply {
            if (currentMsg.src==1){
                userMessageText.text=currentMsg.msg
                robotLogoImage.visibility= View.INVISIBLE
                robotMessageText.visibility= View.INVISIBLE
            }else{
                robotMessageText.text=currentMsg.msg
                userMessageText.visibility= View.INVISIBLE
            }


        }
    }

    override fun getItemCount(): Int {
        return msgs.size
    }
}