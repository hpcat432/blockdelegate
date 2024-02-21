package com.example.androidtest.converter

import com.example.androidtest.block.BottomBlock

class BottomConverter : Converter<Any, BottomBlock.Props> {
    override fun convert(data: Any, old: BottomBlock.Props?): BottomBlock.Props {
        return BottomBlock.Props().apply {
            this.name = "bottom"
        }
    }
}