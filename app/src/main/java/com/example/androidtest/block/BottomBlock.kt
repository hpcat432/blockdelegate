package com.example.androidtest.block

import android.view.View
import com.example.androidtest.R

class BottomBlock : AbsBlock<BottomBlock.Props>() {
    override fun provideLayoutRes(): Int {
        return R.layout.bottom_block
    }

    override fun prepareViews(rootView: View) {
    }

    override fun onProps(props: Props) {
    }

    class Props {
        var name: String = ""
    }

}