package com.tolgacobanoglu.stackoverflow_clone.validator

class UsernameValidator {

    fun validate(username: String): ValidateState {

        if (username.isBlank()) {
            return ValidateState(false, "Username can not be blank or empty")
        }


        if (username.length <6){
            return ValidateState(false, "Username length can not be less than 6")
        }


        if (username.length > 16){
            return ValidateState(false, "Username length can not be greater than 16")
        }

        return ValidateState(true)
    }
}