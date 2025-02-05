package com.devspace.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Create Data Class
        // Create List From Data Class Type
        // Create Adapter
        // Set Adapter
        // Linear Layout Manager
        val rvList: RecyclerView = findViewById(R.id.rv_main)
    }
}

val contacts = listOf(
    Contact (
        "Marcelo",
        "(85) 99999-0000",
        R.drawable.sample10
    ),

    Contact (
        "Carlo",
        "(85) 98888-0000",
        R.drawable.sample9
    ),

    Contact (
        "Maria",
        "(85) 97777-0000",
        R.drawable.sample3
    ),

    Contact (
        "Julia",
        "(85) 96666-0000",
        R.drawable.sample4
    ),

    Contact (
        "Jorge",
        "(85) 95555-0000",
        R.drawable.sample2
    ),

    Contact (
        "Ana",
        "(85) 94444-0000",
        R.drawable.sample1
    ),

    Contact (
        "Carol",
        "(85) 93333-0000",
        R.drawable.sample16
    ),

    Contact (
        "Jose",
        "(85) 92222-0000",
        R.drawable.sample15
    ),

    Contact (
        "João",
        "(85) 95555-0000",
        R.drawable.sample12
    )
)