package com.example.androidtest.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.androidtest.block.AbsBlock

class BlockHolder(private val itemView: View,
                  private val blocks: List<AbsBlock<*>>) : ViewHolder(itemView) {
    fun updateBlocks(item: Any) {
        blocks.forEach {
            it.updateData(item)
        }
    }
}