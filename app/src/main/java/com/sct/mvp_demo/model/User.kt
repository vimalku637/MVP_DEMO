package com.sct.mvp_demo.model

data class User(
    var fullName: String = "",
    var email: String = ""
) {
    override fun toString(): String {
        return "Email : $email\nFullName : $fullName"
    }
}

