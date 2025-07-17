package com.example.e_commerce.utils

import com.example.e_commerce.model.ListCategory
import kotlin.random.Random

val keys = mutableListOf<Int>()
fun itemKey(index: ListCategory): Int {
    while (true) {
        val key = Random.nextInt()
        if (!keys.contains(key)) {
            keys.add(key)
            return key
        }
    }
}