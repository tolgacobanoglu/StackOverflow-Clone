package com.tolgacobanoglu.stackoverflow_clone.view

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.tolgacobanoglu.stackoverflow_clone.R
import com.tolgacobanoglu.stackoverflow_clone.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment()
{
    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        val view = binding.root

        val dialogFragment = DialogFragment(R.layout.about_pop_up)
        dialogFragment.show(childFragmentManager,"About")
        //TODO will might be cancelled

        return view
    }

}