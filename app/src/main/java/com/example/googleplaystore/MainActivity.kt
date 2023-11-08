package com.example.googleplaystore

import VerticalItem
import VerticalRecyclerViewAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val verticalRecyclerView = findViewById<RecyclerView>(R.id.vertical_recycler_view)
        verticalRecyclerView.layoutManager = LinearLayoutManager(this)

        val data = listOf(
            VerticalItem(
                header = "Category 1",
                horizontalItems = listOf(
                    HorizontalItem(imgUrl = "https://example.com/image1.jpg", text = "Item 1", rating = 4.5f),
                    HorizontalItem(imgUrl = "https://example.com/image2.jpg", text = "Item 2", rating = 3.5f),
                    HorizontalItem(imgUrl = "https://example.com/image3.jpg", text = "Item 3", rating = 5.0f),
                    HorizontalItem(imgUrl = "https://example.com/image4.jpg", text = "Item 4", rating = 4.0f),
                    HorizontalItem(imgUrl = "https://example.com/image5.jpg", text = "Item 5", rating = 4.5f)
                )
            ),
            VerticalItem(
                header = "Category 2",
                horizontalItems = listOf(
                    HorizontalItem(imgUrl = "https://example.com/image6.jpg", text = "Item 6", rating = 4.5f),
                    HorizontalItem(imgUrl = "https://example.com/image7.jpg", text = "Item 7", rating = 3.5f),
                    HorizontalItem(imgUrl = "https://example.com/image8.jpg", text = "Item 8", rating = 5.0f),
                    HorizontalItem(imgUrl = "https://example.com/image9.jpg", text = "Item 9", rating = 4.0f),
                    HorizontalItem(imgUrl = "https://example.com/image10.jpg", text = "Item 10", rating = 4.5f)
                )
            ),
            VerticalItem(
                header = "Category 3",
                horizontalItems = listOf(
                    HorizontalItem(imgUrl = "https://example.com/image11.jpg", text = "Item 11", rating = 4.5f),
                    HorizontalItem(imgUrl = "https://example.com/image12.jpg", text = "Item 12", rating = 3.5f),
                    HorizontalItem(imgUrl = "https://example.com/image13.jpg", text = "Item 13", rating = 5.0f),
                    HorizontalItem(imgUrl = "https://example.com/image14.jpg", text = "Item 14", rating = 4.0f),
                    HorizontalItem(imgUrl = "https://example.com/image15.jpg", text = "Item 15", rating = 4.5f)
                )
            ),
            VerticalItem(
                header = "Category 4",
                horizontalItems = listOf(
                    HorizontalItem(imgUrl = "https://example.com/image16.jpg", text = "Item 16", rating = 4.5f),
                    HorizontalItem(imgUrl = "https://example.com/image17.jpg", text = "Item 17", rating = 3.5f),
                    HorizontalItem(imgUrl = "https://example.com/image18.jpg", text = "Item 18", rating = 5.0f),
                    HorizontalItem(imgUrl = "https://example.com/image19.jpg", text = "Item 19", rating = 4.0f),
                    HorizontalItem(imgUrl = "https://example.com/image20.jpg", text = "Item 20", rating = 4.5f)
                )
            )
        )


        val adapter = VerticalRecyclerViewAdapter(data)
        verticalRecyclerView.adapter = adapter
    }
}
