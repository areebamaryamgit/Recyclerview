package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var binding:ActivityMainBinding
    var List:ArrayList<GridModel> =ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recyclerView = binding.recyclerview

        List.add(GridModel(R.drawable.hm,"Home"))
        List.add(GridModel(R.drawable.prf,"Profile"))
        List.add(GridModel(R.drawable.baseline_chat_24,"chat"))
        List.add(GridModel(R.drawable.lag,"Language"))
        List.add(GridModel(R.drawable.info,"Info"))
        List.add(GridModel(R.drawable.cd,"About"))

        recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.adapter=AdpaterGrid(List,this)

        }
    }
