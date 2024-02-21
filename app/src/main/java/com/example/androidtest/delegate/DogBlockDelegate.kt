package com.example.androidtest.delegate

import com.example.androidtest.block.AbsBlock
import com.example.androidtest.block.BottomBlock
import com.example.androidtest.block.DogBlock
import com.example.androidtest.converter.BottomConverter
import com.example.androidtest.converter.DogConverter
import com.example.androidtest.model.Dog

class DogBlockDelegate : BlockDelegate() {

    override fun provideBlocks(): List<AbsBlock<*>> {
        return mutableListOf<AbsBlock<*>>().apply {
            add(getBlock(DogBlock::class.java, DogConverter()))
            add(getBlock(BottomBlock::class.java, BottomConverter()))
        }
    }


    override fun isForViewType(item: Any, items: MutableList<Any>, position: Int): Boolean {
        return item is Dog
    }
}