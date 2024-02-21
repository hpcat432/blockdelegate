package com.example.androidtest.delegate

import com.example.androidtest.block.AbsBlock
import com.example.androidtest.block.BottomBlock
import com.example.androidtest.block.CatBlock
import com.example.androidtest.converter.BottomConverter
import com.example.androidtest.converter.CatConverter
import com.example.androidtest.model.Cat
import com.example.androidtest.viewholder.BlockHolder

class CatBlockDelegate : BlockDelegate() {

    override fun provideBlocks(): List<AbsBlock<*>> {
        return mutableListOf<AbsBlock<*>>().apply {
            add(getBlock(CatBlock::class.java, CatConverter()))
            add(getBlock(BottomBlock::class.java, BottomConverter()))
        }
    }

    override fun onBindViewHolder(item: Any, holder: BlockHolder, payloads: MutableList<Any>) {
        super.onBindViewHolder(item, holder, payloads)
    }



    override fun isForViewType(item: Any, items: MutableList<Any>, position: Int): Boolean {
        return item is Cat
    }
}