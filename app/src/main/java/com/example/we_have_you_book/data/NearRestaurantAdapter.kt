package com.example.we_have_you_book.data

import com.example.we_have_you_book.R
import com.example.we_have_you_book.model.Restaurant

class NearRestaurantData {
    fun loadNearRestaurant() : List<Restaurant> {
        return listOf<Restaurant>(
            Restaurant(
                R.drawable.khoai,
                "Nhà Hàng Khoái - Món Ngon Nha Trang",
                "8.3"
            ),
            Restaurant(
                R.drawable.mandala,
                "Nhà Hàng Chay Mandala",
                "7.0"
            ),
            Restaurant(
                R.drawable.organic,
                "The Organic - Nhà Hàng Chay",
                "8.0"
            ),
            Restaurant(
                R.drawable.vajra,
                "Vajra - Nhà Hàng Chay",
                "7.1"
            ),
            Restaurant(
                R.drawable.wmc_group,
                "Hệ Thống WMC Group",
                "7.5"
            ),
            Restaurant(
                R.drawable.bistrot_de_saigon,
                "Nhà Hàng Bistrot De Saigon",
                "8.3"
            ),
        )
    }
}