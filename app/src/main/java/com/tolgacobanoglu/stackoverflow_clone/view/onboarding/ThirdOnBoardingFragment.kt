package com.tolgacobanoglu.stackoverflow_clone.view.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.tolgacobanoglu.stackoverflow_clone.R
import com.tolgacobanoglu.stackoverflow_clone.database.locale.sharedpreferences.OnBoardingSharedPreferences
import com.tolgacobanoglu.stackoverflow_clone.databinding.FragmentFirstOnBoardingBinding
import com.tolgacobanoglu.stackoverflow_clone.databinding.FragmentThirdOnBoardingBinding


class ThirdOnBoardingFragment : Fragment()
{

    var _binding: FragmentThirdOnBoardingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        _binding = FragmentThirdOnBoardingBinding.inflate(inflater, container, false)
        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.btnFinish.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardingViewPagerFragment_to_signInFragment)
            OnBoardingSharedPreferences.done(requireActivity())
        }


        return view
    }

}