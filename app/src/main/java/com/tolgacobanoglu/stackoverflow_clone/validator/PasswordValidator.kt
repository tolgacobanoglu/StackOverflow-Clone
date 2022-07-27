package com.tolgacobanoglu.stackoverflow_clone.validator

import android.util.Patterns

class PasswordValidator {

    fun validate(password: String): ValidateState {

        if (password.isBlank()) {
            return ValidateState(false, "Email can not be blank or empty")
        }
        val isObeyRules = password.any { c -> c.isDigit() } && password.any { c -> c.isLetter() }

        if (!isObeyRules) {
            return ValidateState(false, "Password must contain at least one digit and letter")
        }

        if (password.length <6){
            return ValidateState(false, "Password length can not be less than 6")
        }


        if (password.length > 16){
            return ValidateState(false, "Password length can not be greater than 16")
        }

        return ValidateState(true)
    }
}