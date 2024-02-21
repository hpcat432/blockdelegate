package com.example.androidtest.block

import android.view.View
import com.example.androidtest.converter.Converter

abstract class AbsBlock<P> {

    private val props: P? = null

    private var converter: Converter<Any, P>? = null

    abstract fun provideLayoutRes(): Int

    abstract fun onProps(props: P)

    abstract fun prepareViews(rootView: View)

    fun setConverter(converter: Converter<Any, P>) {
        this.converter = converter
    }

    fun updateData(item: Any) {
        onProps(converter!!.convert(item, this.props))
    }

}