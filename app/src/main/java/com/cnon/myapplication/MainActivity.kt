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
        recyclerView.adapter = Adapter(getModels(),recyclerView)

        recyclerView.scrollToPosition(0);



    }

    fun getModels(): MutableList<CountryModel> {

        val models = mutableListOf(
            CountryModel(R.drawable.animal3, "Squirrel", "Sciuridae"),
            CountryModel(R.drawable.animal4, "Red Panda", "Kahire"),
            CountryModel(R.drawable.animal5, "Mirket", "Berlin"),
            CountryModel(R.drawable.animal6, "Dog", "Ankara"),
            CountryModel(R.drawable.animal7, "Penguin", "Moskova"),
            CountryModel(R.drawable.animal8, "Deer", "Londra"),
            CountryModel(R.drawable.animal9, "Jackal", "Kiev"),
            CountryModel(R.drawable.animal10, "Panda", "Tokyo"),
            CountryModel(R.drawable.animal11, "Armadillo", "Tokyo"),
            CountryModel(R.drawable.animal14, "Cheetah", "Tokyo"),
            CountryModel(R.drawable.animal15, "Lama", "Tokyo"),
            CountryModel(R.drawable.animal16, "A weird animal", "Tokyo"),
            CountryModel(R.drawable.animal17, "Duck", "Tokyo"),
            CountryModel(R.drawable.animal18, "Toucan", "Tokyo"),
            CountryModel(R.drawable.animal19, "Japonya", "Tokyo"),

        )
        return models
    }

}