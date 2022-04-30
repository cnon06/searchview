package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = Adapter(getModels())

    }

    fun getModels(): MutableList<CountryModel> {

        val models = mutableListOf(
            CountryModel(R.drawable.animal3, "Çin", "Pekin"),
            CountryModel(R.drawable.animal4, "Mısır", "Kahire"),
            CountryModel(R.drawable.animal5, "Almanya", "Berlin"),
            CountryModel(R.drawable.animal6, "Türkiye", "Ankara"),
            CountryModel(R.drawable.animal7, "Rusya", "Moskova"),
            CountryModel(R.drawable.animal8, "İngiltere", "Londra"),
            CountryModel(R.drawable.animal9, "Ukrayna", "Kiev"),
            CountryModel(R.drawable.animal10, "Japonya", "Tokyo"),
            CountryModel(R.drawable.animal11, "Japonya", "Tokyo"),
            CountryModel(R.drawable.animal14, "Japonya", "Tokyo"),
            CountryModel(R.drawable.animal15, "Japonya", "Tokyo"),
            CountryModel(R.drawable.animal16, "Japonya", "Tokyo"),
            CountryModel(R.drawable.animal17, "Japonya", "Tokyo"),
            CountryModel(R.drawable.animal18, "Japonya", "Tokyo"),
            CountryModel(R.drawable.animal19, "Japonya", "Tokyo"),


        )
        return models
    }

}