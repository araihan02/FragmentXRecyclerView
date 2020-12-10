package com.ahmadraihan.fragmentxrecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fragment3 : Fragment() {
    private  lateinit var rvMakanan: RecyclerView
    private var list: ArrayList<Makanan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view= inflater.inflate(R.layout.fragment_3, container, false)
        rvMakanan = view.findViewById(R.id.rv_makanan)
        rvMakanan.setHasFixedSize(true)

        list.addAll(DataMakanan.listData)
        rvMakanan.layoutManager = LinearLayoutManager(view.context)
        val cardMakananAdapter = CardMakananAdapter(list)
        rvMakanan.adapter = cardMakananAdapter
        return view
    }

}