package com.nabila.foodmarketkotlinmobile.modul.home.recommended

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nabila.foodmarketkotlinmobile.R
import com.nabila.foodmarketkotlinmobile.model.dummy.HomeVerticalModel
import com.nabila.foodmarketkotlinmobile.modul.detail.DetailActivity
import com.nabila.foodmarketkotlinmobile.modul.home.newtaste.HomeNewtasteAdapter
import kotlinx.android.synthetic.main.fragment_home.*


class HomeRecommendedFragment : Fragment(), HomeNewtasteAdapter.ItemAdapterCallback {

    private var foodList : ArrayList<HomeVerticalModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_new_taste, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = HomeNewtasteAdapter(foodList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(activity)

        rcList.layoutManager = layoutManager
        rcList.adapter = adapter
    }

    fun initDataDummy(){
        foodList = ArrayList()
        foodList.add(HomeVerticalModel("Kol Goreng", "10000", "", 5f))
        foodList.add(HomeVerticalModel("Kebab Turki", "20000", "", 3f))
        foodList.add(HomeVerticalModel("Bakwan Jagung", "45000", "", 4.5f))
    }

    override fun onClick(v: View, data: HomeVerticalModel) {
        val detail = Intent(activity, DetailActivity::class.java)
        startActivity(detail)
    }
}