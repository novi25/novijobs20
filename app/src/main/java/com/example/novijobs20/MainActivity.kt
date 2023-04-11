package com.example.novijobs20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.novijobs20.Kelas

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "maulida intan nur aini",
        "miftakul janah",
        "muh asa susilo",
        "m.haikal",
        "rifqil hanif",
        "nabhan aflahul syafiq",
        "natasya ayu lestanti",
        "novi indriyani",
        "nur hesty mugirahayu",
        "rika rahma aulia",
        "salma nadia agustina"
    )

    val listNis = arrayOf(
        "3008",
        "3010",
        "3011",
        "3013",
        "3015",
        "3017",
        "3019",
        "3021",
        "3023",
        "3025",
        "3028",
    )

    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i], listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}