package com.tolgacobanoglu.stackoverflow_clone.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tolgacobanoglu.stackoverflow_clone.R
import com.tolgacobanoglu.stackoverflow_clone.databinding.FragmentForgotPasswordBinding
import com.tolgacobanoglu.stackoverflow_clone.databinding.FragmentSignInBinding

class ForgotPasswordFragment : Fragment()
{
    var _binding : FragmentForgotPasswordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        _binding = FragmentForgotPasswordBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_forgotPasswordFragment_to_noConnectionFragment)
        }

        return view
    }

}