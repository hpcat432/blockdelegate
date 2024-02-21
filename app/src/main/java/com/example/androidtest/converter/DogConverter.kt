package com.example.androidtest.converter

import com.example.androidtest.block.DogBlock
import com.example.androidtest.model.Dog

class DogConverter : Converter<Dog, DogBlock.Props> {
    override fun convert(data: Dog, old: DogBlock.Props?): DogBlock.Props {
        return DogBlock.Props().apply {
            this.sound = data.sound
        }
    }
}