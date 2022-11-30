package com.nabila.foodmarketkotlinmobile.modul.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.nabila.foodmarketkotlinmobile.R
import com.nabila.foodmarketkotlinmobile.modul.auth.AuthActivity
import kotlinx.android.synthetic.main.fragment_signup_address.*
import kotlinx.android.synthetic.main.fragment_signup_success.*


/**
 * A simple [Fragment] subclass.
 * Use the [SignupAddressFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SignupAddressFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup_address, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnDaftarSkrg.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_signup_success, null)

            (activity as AuthActivity).toolbarSignUpSuccess()
        }
    }
}