package com.nabila.foodmarketkotlinmobile.modul.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nabila.foodmarketkotlinmobile.R


/**
 * A simple [Fragment] subclass.
 * Use the [SignupSuccessFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SignupSuccessFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup_success, container, false)
    }
}