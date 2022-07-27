package com.tolgacobanoglu.stackoverflow_clone.view.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.tolgacobanoglu.stackoverflow_clone.R
import com.tolgacobanoglu.stackoverflow_clone.databinding.FragmentFirstOnBoardingBinding

class FirstOnBoardingFragment : Fragment()
{

    var _binding: FragmentFirstOnBoardingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        _binding = FragmentFirstOnBoardingBinding.inflate(inflater, container, false)
        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.twFirstFragmentNext.setOnClickListener{
            viewPager?.currentItem = 1
        }


        return view
    }

}