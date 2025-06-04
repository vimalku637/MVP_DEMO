package com.sct.mvp_demo.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sct.mvp_demo.R
import com.sct.mvp_demo.databinding.ActivityMainBinding
import com.sct.mvp_demo.presenter.PresenterMA

class MainActivity : AppCompatActivity(), PresenterMA.View {
    private lateinit var binding : ActivityMainBinding

    private lateinit var presenter: PresenterMA
    private lateinit var fullName: String
    private lateinit var email: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        presenter = PresenterMA(this)


        binding.etUserName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                fullName = s.toString()
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })

        binding.etEmail.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                email = s.toString()
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })

        binding.btnSubmit.setOnClickListener {
            presenter.submit(fullName, email)
        }
    }

    override fun updateUserInfoTextView(info: String) {
        binding.myTextView.text = info
    }

    override fun showProgressBar() {
        //TODO
    }

    override fun hideProgressBar() {
        //TODO
    }
}