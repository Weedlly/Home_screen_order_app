package com.example.we_have_you_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.we_have_you_book.adapter.NearRestaurantAdapter
import com.example.we_have_you_book.data.NearRestaurantData

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val myDataset = NearRestaurantData().loadNearRestaurant()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = NearRestaurantAdapter(this,myDataset)
        recyclerView.setHasFixedSize(true)
    }
}