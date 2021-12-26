package com.example.scalarmultiplication

import android.util.Log

data class ScalarMultiplication (val firstVector: List<Int>, val secondVector: List<Int>) {
    fun getScalarMultiplication() : Int {
        return firstVector.mapIndexed { index, i -> i * secondVector[index] }.sum()
    }
}