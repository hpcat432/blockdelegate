package com.example.androidtest.converter

interface Converter<D, P> {

    fun convert(data :D, old: P?): P

}