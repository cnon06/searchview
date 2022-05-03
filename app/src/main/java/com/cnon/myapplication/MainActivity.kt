package com.cnon.myapplication

import android.app.SearchManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() , SearchView.OnQueryTextListener {

   

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

       // recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        recyclerView.adapter = Adapter(getModels(),recyclerView)

        recyclerView.scrollToPosition(0);



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu,menu)

        val manager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchitem = menu?.findItem(R.id.app_bar_search)
        val searchView = searchitem?.actionView as  SearchView

        searchView.setSearchableInfo(manager.getSearchableInfo(componentName))

        searchView.setOnQueryTextListener(this)


        return super.onCreateOptionsMenu(menu)

    }


    override fun onQueryTextChange(newText: String?): Boolean {
        println(newText.toString()+"here")

        val queryList = mutableListOf<CountryModel>()
        val query = newText.toString()

        for(i in getModels())
        {
            if(i.countryName.lowercase().contains(query.lowercase())) queryList.add(i)
        }

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)



        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        recyclerView.adapter = Adapter(queryList,recyclerView)

        recyclerView.scrollToPosition(0);

        return true
    }


    override fun onQueryTextSubmit(query: String?): Boolean {
        TODO("Not yet implemented")
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