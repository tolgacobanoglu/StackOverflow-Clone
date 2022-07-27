package com.tolgacobanoglu.stackoverflow_clone.view

import android.animation.Animator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tolgacobanoglu.stackoverflow_clone.R
import com.tolgacobanoglu.stackoverflow_clone.database.locale.sharedpreferences.OnBoardingSharedPreferences
import com.tolgacobanoglu.stackoverflow_clone.databinding.FragmentSplashBinding
import com.tolgacobanoglu.stackoverflow_clone.util.network.NetworkState

class SplashFragment : Fragment()
{
    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)
        val view = binding.root
        
        binding.animationView.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator?) {

            }

            override fun onAnimationEnd(p0: Animator?)
            {
                if (NetworkState.checkConnection(requireContext()))
                {
                    if (OnBoardingSharedPreferences.isDone(requireActivity()))
                    {
                        findNavController().navigate(R.id.action_splashFragment_to_signInFragment)
                    }
                    else
                    {
                        findNavController().navigate(R.id.action_splashFragment_to_onBoardingViewPagerFragment)
                    }

                }
                else
                {
                    findNavController().navigate(R.id.action_splashFragment_to_noConnectionFragment)
                }

            }

            override fun onAnimationCancel(p0: Animator?) {

            }

            override fun onAnimationRepeat(p0: Animator?) {

            }
        })

        return view
    }

}