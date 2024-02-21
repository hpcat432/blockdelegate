package com.example.androidtest.delegate

import com.example.androidtest.R
import com.example.androidtest.model.Dog
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun dogAdapterDelegate() = adapterDelegate<Dog, Any>(R.layout.dog_layout) {

    // This is the initializer block where you initialize the ViewHolder.
    // Its called one time only in onCreateViewHolder.
    // this is where you can call findViewById() and setup click listeners etc.

//    val name : TextView = findViewById(R.id.name)
//    name.setClickListener { itemClickedListener(item) } // Item is automatically set for you. It's set lazily though (set in onBindViewHolder()). So only use it for deferred calls like clickListeners.

    bind { diffPayloads -> // diffPayloads is a List<Any> containing the Payload from your DiffUtils
        // This is called anytime onBindViewHolder() is called
//        name.text = item.name // Item is of type Cat and is the current bound item.
    }
}