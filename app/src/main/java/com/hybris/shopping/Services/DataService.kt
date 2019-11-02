package com.hybris.shopping.Services

import com.hybris.shopping.Model.Catogory
import com.hybris.shopping.Model.Product
import java.util.*

object DataService {
    val categores = listOf(
        Catogory("Shoe","shoeimage"),
        Catogory("Bat","batimage"),
        Catogory("Helmet","helmetimage")
    )

    val shoe= listOf(
        Product("Nike","1200","shoe01"),
        Product("Adidas","1000","shoe02"),
        Product("Puma","1300","shoe03")
    )

    val bat= listOf(
        Product("Nike","1200","bat01"),
        Product("Adidas","1000","bat022"),
        Product("Puma","1300","bat03")
    )

    val helmet= listOf(
        Product("Nike","1200","helmet01"),
        Product("Adidas","1000","helmet02"),
        Product("Puma","1300","helmet03")
    )
}