package com.tolgacobanoglu.stackoverflow_clone.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tolgacobanoglu.stackoverflow_clone.R
import com.tolgacobanoglu.stackoverflow_clone.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        _binding = FragmentSignInBinding.inflate(inflater, container, false)
        val view = binding.root


        with(binding) {

            twSignup.setOnClickListener{
                findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
            }

            twForgotPassword.setOnClickListener{
                findNavController().navigate(R.id.action_signInFragment_to_forgotPasswordFragment)
            }
        }



        return view
    }

}