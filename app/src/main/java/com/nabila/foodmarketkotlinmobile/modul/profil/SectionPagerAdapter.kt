package com.nabila.foodmarketkotlinmobile.modul.profil

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nabila.foodmarketkotlinmobile.modul.home.newtaste.HomeNewTasteFragment
import com.nabila.foodmarketkotlinmobile.modul.home.popular.HomePopularFragment
import com.nabila.foodmarketkotlinmobile.modul.home.recommended.HomeRecommendedFragment
import com.nabila.foodmarketkotlinmobile.modul.profil.account.ProfileAccountFragment
import com.nabila.foodmarketkotlinmobile.modul.profil.soedmarket.ProfileSoedmarketFragment

class SectionPagerAdapter(fm:FragmentManager) :FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Account"
            1 -> "SoedMarket"
            else -> ""
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        var fragment : Fragment
        return when(position){
            0 -> {
                fragment = ProfileAccountFragment()
                return fragment
            }
            1 -> {
                fragment = ProfileSoedmarketFragment()
                return fragment
            }
            else -> {
                fragment = ProfileAccountFragment()
                return fragment
            }

        }
    }
}