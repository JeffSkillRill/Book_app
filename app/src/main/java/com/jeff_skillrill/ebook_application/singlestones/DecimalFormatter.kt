package com.jeff_skillrill.ebook_application.singlestones

object DecimalFormatter {
    fun format(num :Float?): String{
        return String.format("%.2f", num)
    }
}