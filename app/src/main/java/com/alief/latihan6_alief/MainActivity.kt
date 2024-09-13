package com.alief.latihan6_alief

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var lv_item : ListView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        lv_item = findViewById(R.id.lvhewan)

        val namahewan = listOf("Sapi", "Kambing", "Semut", "Singa", "Koala", "Nyamuk", "Banteng")

        lv_item.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namahewan)

    }
}