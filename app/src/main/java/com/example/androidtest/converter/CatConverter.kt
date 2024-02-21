package com.example.androidtest.converter

import com.example.androidtest.block.CatBlock
import com.example.androidtest.model.Cat

class CatConverter : Converter<Cat, CatBlock.Props> {

    override fun convert(data: Cat, old: CatBlock.Props?): CatBlock.Props {
        return CatBlock.Props().apply {
            this.sound = data.sound
        }
    }

}