package crabster.rudakov.sberschoollesson32hwk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var tankAdapter: TankAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.single_tank)
        recyclerView.layoutManager = LinearLayoutManager(this)

        tankAdapter = TankAdapter(TankImages.tankImages, this)
        recyclerView.adapter = tankAdapter
    }

}