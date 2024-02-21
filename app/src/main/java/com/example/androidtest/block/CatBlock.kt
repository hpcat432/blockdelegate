package com.example.androidtest.block

import android.view.View
import android.widget.TextView
import com.example.androidtest.R

class CatBlock : AbsBlock<CatBlock.Props>() {

    private lateinit var tvName: TextView

    override fun provideLayoutRes(): Int {
        return R.layout.cat_block
    }

    override fun prepareViews(rootView: View) {
        tvName = rootView.findViewById(R.id.tv_cat)
    }

    override fun onProps(props: Props) {
        tvName.text = props.sound
    }

    class Props {
        var sound: String = ""
    }

}

