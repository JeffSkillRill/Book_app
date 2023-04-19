package com.jeff_skillrill.ebook_application.dataclasses

data class Item(val name: String?, val price: Float, val image: String?,var quantity: Int=1, var totalPrice:Float=quantity*price)
