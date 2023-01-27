package com.example.composedeneme.dessert.data

import com.example.composedeneme.R
import com.example.composedeneme.dessert.model.Dessert


/**
 * [Datasource] generates a list of [Dessert]
 */
object Datasource {
    val dessertList = listOf(
        Dessert(R.drawable.image1, 5, 0),
        Dessert(R.drawable.image2, 10, 5),
        Dessert(R.drawable.image3, 15, 20),
        Dessert(R.drawable.image4, 30, 50),
        Dessert(R.drawable.image5, 50, 100),
        Dessert(R.drawable.image6, 100, 200),
        Dessert(R.drawable.image7, 500, 500),
        Dessert(R.drawable.image8, 1000, 1000),
        Dessert(R.drawable.image9, 2000, 2000),
        Dessert(R.drawable.image10, 3000, 4000),
        Dessert(R.drawable.image1, 4000, 8000),
        Dessert(R.drawable.image2, 5000, 16000),
        Dessert(R.drawable.image3, 6000, 20000)
    )
}