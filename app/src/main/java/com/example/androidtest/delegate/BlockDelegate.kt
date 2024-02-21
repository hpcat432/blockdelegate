package com.example.androidtest.delegate

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.androidtest.R
import com.example.androidtest.block.AbsBlock
import com.example.androidtest.converter.Converter
import com.example.androidtest.viewholder.BlockHolder
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate

abstract class BlockDelegate : AbsListItemAdapterDelegate<Any, Any, BlockHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup): BlockHolder {
        val inflater = LayoutInflater.from(parent.context)
        val container = inflater.inflate(R.layout.block_delegate_container, parent, false) as LinearLayout
        val blocks = provideBlocks()
        blocks.forEach {
            val layoutRes = it.provideLayoutRes()
            val blockView = inflater.inflate(layoutRes, container, false)
            container.addView(blockView)
            it.prepareViews(container)
        }
        return BlockHolder(container, blocks)
    }

    override fun onBindViewHolder(
        item: Any,
        holder: BlockHolder,
        payloads: MutableList<Any>
    ) {
        holder.updateBlocks(item)
    }

    fun <P, T, B : AbsBlock<P>> getBlock(blockClz: Class<B>, converter: Converter<T, P>): B {
        val block = blockClz.newInstance()
        block.setConverter(converter as (Converter<Any, P>))
        return block
    }

    abstract fun provideBlocks(): List<AbsBlock<*>>

}