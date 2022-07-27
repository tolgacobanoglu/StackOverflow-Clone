package com.tolgacobanoglu.stackoverflow_clone.view.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tolgacobanoglu.stackoverflow_clone.R
import com.tolgacobanoglu.stackoverflow_clone.adapter.OnBoardingViewPagerAdapter
import com.tolgacobanoglu.stackoverflow_clone.databinding.FragmentOnBoardingViewPagerBinding

class OnBoardingViewPagerFragment : Fragment()
{

    private var _binding:FragmentOnBoardingViewPagerBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        _binding =  FragmentOnBoardingViewPagerBinding.inflate(inflater, container, false)
        val view = binding.root

        val fragmentList = arrayListOf<Fragment>(
            FirstOnBoardingFragment(),SecondOnBoardingFragment(),ThirdOnBoardingFragment()
        )

        val adapter = OnBoardingViewPagerAdapter(fragmentList,requireActivity().supportFragmentManager,lifecycle)

        binding.viewPager.adapter = adapter

        return view
    }

}