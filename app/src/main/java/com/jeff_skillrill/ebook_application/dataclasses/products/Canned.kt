package com.jeff_skillrill.ebook_application.dataclasses.products

data class Canned(
    override var name: String,
    override var description: String,
    override var sku: String,
    override var price: Float,
    override var image: String
): Product()
