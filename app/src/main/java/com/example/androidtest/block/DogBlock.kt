package com.example.androidtest.block

import android.view.View
import android.widget.TextView
import com.example.androidtest.R
import com.example.androidtest.converter.Converter
import com.example.androidtest.model.Dog

class DogBlock : AbsBlock<DogBlock.Props>() {

    private lateinit var tvName: TextView

    override fun provideLayoutRes(): Int {
        return R.layout.dog_block
    }

    override fun prepareViews(rootView: View) {
        tvName = rootView.findViewById(R.id.tv_dog)
    }

    override fun onProps(props: DogBlock.Props) {
        tvName.text = props.sound
    }

    class Props {
        var sound: String = ""
    }
}