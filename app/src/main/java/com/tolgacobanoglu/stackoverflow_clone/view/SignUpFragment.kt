package com.tolgacobanoglu.stackoverflow_clone.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import com.tolgacobanoglu.stackoverflow_clone.R
import com.tolgacobanoglu.stackoverflow_clone.databinding.FragmentSignUpBinding
import com.tolgacobanoglu.stackoverflow_clone.viewmodel.SignUpFragmentViewModel

class SignUpFragment : Fragment() {
    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!

    private val signUpFragmentViewModel: SignUpFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        val view = binding.root

        val dialogFragment = DialogFragment(R.layout.about_pop_up)
        dialogFragment.show(childFragmentManager, "About")

        binding.apply {
            emailTextListener()
            passwordTextListener()
            userNameTextListener()
            onClickSignUp()
        }

        return view
    }

    private fun onClickSignUp() {
        signUpFragmentViewModel.let {
            if (it.isUserCredentialsValid) {
                //todo
            } else {
                Toast.makeText(requireContext(), "Please check the fields.", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }


    private fun emailTextListener() {
        binding.let {
            it.etEmail.setOnFocusChangeListener { _, hasFocus ->
                if (!hasFocus) {
                    val email = it.etEmail.text.toString().trim()
                    it.layoutEmail.helperText = signUpFragmentViewModel.isEmailValid(email).message
                }
            }
        }
    }

    private fun passwordTextListener() {
        binding.let {
            it.etPassword.setOnFocusChangeListener { _, hasFocus ->
                if (!hasFocus) {
                    val password = it.etPassword.text.toString().trim()
                    it.layoutPassword.helperText =
                        signUpFragmentViewModel.isPasswordValid(password).message
                }
            }
        }
    }

    private fun userNameTextListener() {
        binding.let {
            it.etName.setOnFocusChangeListener { _, hasFocus ->
                if (!hasFocus) {
                    val userName = it.etName.text.toString().trim()
                    it.layoutName.helperText =
                        signUpFragmentViewModel.isUsernameValid(userName).message
                }
            }
        }
    }


}