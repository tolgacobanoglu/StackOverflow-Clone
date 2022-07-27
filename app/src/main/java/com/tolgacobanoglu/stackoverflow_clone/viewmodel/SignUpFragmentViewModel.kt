package com.tolgacobanoglu.stackoverflow_clone.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tolgacobanoglu.stackoverflow_clone.validator.EmailValidator
import com.tolgacobanoglu.stackoverflow_clone.validator.PasswordValidator
import com.tolgacobanoglu.stackoverflow_clone.validator.UsernameValidator
import com.tolgacobanoglu.stackoverflow_clone.validator.ValidateState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flow


class SignUpFragmentViewModel(
    private val emailValidator: EmailValidator = EmailValidator(),
    private val passwordValidator: PasswordValidator = PasswordValidator(),
    private val usernameValidator: UsernameValidator = UsernameValidator()
) : ViewModel() {

    private var _emailState = false
    private var _passwordState = false
    private var _userNameState = false


    fun isEmailValid(email: String): ValidateState {
        val state = emailValidator.validate(email)
        _emailState = state.isSuccess
        return state
    }

    fun isPasswordValid(password: String): ValidateState {
        val state = passwordValidator.validate(password)
        _passwordState = state.isSuccess
        return state
    }

    fun isUsernameValid(userName: String): ValidateState {
        val state = usernameValidator.validate(userName)
        _userNameState = state.isSuccess
        return state
    }

    var isUserCredentialsValid = _emailState && _passwordState && _userNameState



}