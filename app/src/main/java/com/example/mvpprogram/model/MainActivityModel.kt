package com.example.mvpprogram.model

import com.example.mvpprogram.contract.ContractInterface

class MainActivityModel: ContractInterface.Model {

    private var mCounter = 0

    override fun getCounter()= mCounter

    override fun incrementCounter() {
        mCounter++
    }
}