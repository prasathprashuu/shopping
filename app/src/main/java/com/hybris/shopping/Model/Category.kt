package com.hybris.shopping.Model

class Category (title:String, image:String) {
    val title=title
    val image=image
    override fun toString(): String {
        return title
    }
}