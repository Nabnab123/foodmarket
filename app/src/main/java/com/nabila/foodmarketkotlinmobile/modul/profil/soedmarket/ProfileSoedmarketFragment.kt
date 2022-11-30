package com.nabila.foodmarketkotlinmobile.modul.profil.soedmarket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nabila.foodmarketkotlinmobile.R
import com.nabila.foodmarketkotlinmobile.model.dummy.ProfileMenuModel
import com.nabila.foodmarketkotlinmobile.modul.profil.ProfileMenuAdapter
import kotlinx.android.synthetic.main.fragment_profile_account.*

class ProfileSoedmarketFragment : Fragment(), ProfileMenuAdapter.ItemAdapterCallback{

    private var menuArrayList: ArrayList<ProfileMenuModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_account, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()

        var adapter = ProfileMenuAdapter(menuArrayList, this)
        var layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(activity)
        rcList.layoutManager = layoutManager
        rcList.adapter = adapter
    }

    fun initDataDummy(){
        menuArrayList = ArrayList()
        menuArrayList.add(ProfileMenuModel("Rate Aplikasi"))
        menuArrayList.add(ProfileMenuModel("Pusat Bantuan"))
        menuArrayList.add(ProfileMenuModel("Syarat & Ketentuan"))

    }

    override fun onClick(v: View, data: ProfileMenuModel) {
        Toast.makeText(context, "ini menu yg diklik"+data.title, Toast.LENGTH_SHORT).show()
    }
}