package com.example.basicstep3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.basicstep3.javainterlop.javaActivity
import com.example.basicstep3.step3.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doTest(LambdasTest(::WriteLn))
        doTest(ExtFunctionTest(::WriteLn))
        doTest(ClosureTest(::WriteLn))
        doTest(DslTest(::WriteLn))
        doTest(CurringTest(::WriteLn))
        doTest(InfixTest(::WriteLn))
        doTest(MultiReturnTest(::WriteLn))
        doTest(LazyLateTest(::WriteLn))
        doTest(PropertiesTest(::WriteLn))

        btnTest.setOnClickListener{
            var I = Intent(this, javaActivity::class.java)
            startActivity(I)
        }
    }

    private fun doTest(o : TestClass){
        o.doTest()
    }

    fun WriteLn( any : Any){
        txtMessage.text = "${txtMessage.text}${any.toString()}\n"
    }
}
