package com.jeff_skillrill.ebook_application.singlestones

import java.util.*

object Capitalizer {
    fun capitalized(str:String): String {
        return str.replaceFirstChar {
            if (it.isLowerCase())
                it.titlecase(Locale.getDefault())
            else it.toString()
        }
    }
}