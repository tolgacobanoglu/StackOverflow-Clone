package com.tolgacobanoglu.stackoverflow_clone.validator

data class SignUpFormState(
    var nameState: ValidateState?,
    var emailState: ValidateState?,
    var passwordState: ValidateState?
)
