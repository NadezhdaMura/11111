package com.example.tvshow.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tvshow.R
import com.example.tvshow.data.TvShowAdapter
import com.example.tvshow.data.TvShowItem
import kotlinx.android.synthetic.main.first_fragment.*

class FirstFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.first_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var tvShowList = listOf(TvShowItem(R.drawable.show1,"Midsomer Murders","Detective",1997),
        TvShowItem(R.drawable.show2,"Criminal Minds","criminal",2005)
        )

        recyclerView.adapter = TvShowAdapter(tvShowList)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
    }
}