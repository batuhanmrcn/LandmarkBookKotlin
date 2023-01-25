package com.batuhanmercan.landmarkbookkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import com.batuhanmercan.landmarkbookkotlin.databinding.ActivityDetailsBinding
import com.batuhanmercan.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList:  ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        //Data
        val eiffel = Landmark("Eiffel","France",R.drawable.eiffel)
        val venice = Landmark("Venice","Italy",R.drawable.venice)
        val colosseum = Landmark("Colosseum","Italy",R.drawable.colosseum)
        val galata = Landmark("Galata Tower","Turkiye",R.drawable.galata)

        landmarkList.add(eiffel)
        landmarkList.add(colosseum)
        landmarkList.add(galata)
        landmarkList.add(venice)


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter



        /*
        //Adapter : Layout & Data

        // Mapping

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name })
        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->  }
        val intent = Intent(MainActivity@this,DetailsActivity::class.java)
        intent.putExtra("landmark",)
        startActivity(intent)

         */
    }

}