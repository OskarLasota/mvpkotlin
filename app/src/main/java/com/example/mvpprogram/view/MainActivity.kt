package com.example.mvpprogram.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpprogram.R
import com.example.mvpprogram.components.DaggerProductComponent
import com.example.mvpprogram.contract.ContractInterface
import com.example.mvpprogram.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), ContractInterface.View {

    private var presenter: ContractInterface.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // DaggerProductComponent.create().inject(this)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        clickButton.setOnClickListener { presenter?.incrementValue() }
    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()
    }
}