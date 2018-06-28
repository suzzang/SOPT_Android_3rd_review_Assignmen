package com.sujeong.thirdseminar_review

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mainItems : ArrayList<MainData>
    lateinit var mainAdapter: MainAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainItems = ArrayList()

        mainItems.add(MainData("5515","[서울]지선버스","#00fc00"))
        mainItems.add(MainData("720","[서울]간선버스","#0000fe"))
        mainItems.add(MainData("3100","[서울]광역버스","#fd0000"))
        mainItems.add(MainData("3600","[서울]광역버스","#fd0000"))
        mainItems.add(MainData("172","[서울]간선버스","#0000fe"))
        mainItems.add(MainData("1221","[서울]지선버스","#00fc00"))
        mainItems.add(MainData("1224","[서울]지선버스","#00fc00"))
        mainItems.add(MainData("1131","[서울]지선버스","#00fc00"))
        mainItems.add(MainData("1141","[서울]지선버스","#00fc00"))
        mainItems.add(MainData("1000","[서울]광역버스","#fd0000"))
        mainItems.add(MainData("1345","[서울]광역버스","#fd0000"))
        mainItems.add(MainData("400","[서울]지선버스","#00fc00"))



        mainAdapter = MainAdapter(mainItems)

        main_rv.layoutManager = LinearLayoutManager(this)
        main_rv.adapter = mainAdapter

    }
}
