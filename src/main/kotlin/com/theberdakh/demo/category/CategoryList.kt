package com.theberdakh.demo.category

object CategoryList {
    fun getAll(): List<Category> {
        return listOf(
            Category(
                id = 1,
                name = "Kompyuter klublar"
            ),
            Category(
                id = 2,
                name = "Futbol"
            ),
            Category(
                id = 3,
                name = "Play-station"
            ),
            Category(
                id = 4,
                name = "Billiard"
            ),
            Category(
                id = 5,
                name = "Restoran"
            ),
        )
    }
}