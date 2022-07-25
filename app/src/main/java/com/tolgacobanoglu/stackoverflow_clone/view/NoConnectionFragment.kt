package com.tolgacobanoglu.stackoverflow_clone.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tolgacobanoglu.stackoverflow_clone.R
import com.tolgacobanoglu.stackoverflow_clone.databinding.FragmentForgotPasswordBinding
import com.tolgacobanoglu.stackoverflow_clone.databinding.FragmentNoConnectionBinding

class NoConnectionFragment : Fragment()
{
    var _binding : FragmentNoConnectionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        _binding = FragmentNoConnectionBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }

}