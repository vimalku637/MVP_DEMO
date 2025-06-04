package com.sct.mvp_demo.presenter

import com.sct.mvp_demo.model.User

class PresenterMA(private val view: View) {

    private val user = User()

    fun submit(fullName: String, email: String){
        user.fullName = fullName
        user.email = email
        view.updateUserInfoTextView(user.toString())
    }

    interface View {
        fun updateUserInfoTextView(info: String)
        fun showProgressBar()
        fun hideProgressBar()
    }
}
