package com.tolgacobanoglu.stackoverflow_clone.validator

import android.util.Patterns

class EmailValidator {

    fun validate(email: String) : ValidateState{

        if (email.isBlank()){
            return ValidateState(false, "Email can not be blank or empty")
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            return ValidateState(false, "Please write an email address")
        }

        return ValidateState(true)
    }
}