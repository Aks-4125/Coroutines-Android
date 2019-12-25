package com.aks4125

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aks4125.network.RetrofitModule
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        btnGet.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            tvSample.text = "Requesting..."
            CoroutineScope(Dispatchers.IO).launch {
                delay(2000)
                val response = RetrofitModule.getResponse()
                if (response.code() == 200) {
                    val token: JsonObject? = response.body()
                    withContext(Dispatchers.Main) {
                        progressBar.visibility = View.GONE
                        tvSample.setText(token.toString())
                        Toast.makeText(this@MainActivity, token.toString(), Toast.LENGTH_SHORT)
                            .show()
                    }
                    Log.v(this@MainActivity.javaClass.name, token.toString())
                } else {
                    withContext(Dispatchers.Main) {
                        tvSample.text = "Something went wrong..."
                        progressBar.visibility = View.GONE
                    }
                    Log.v(this@MainActivity.javaClass.name, response.message())
                }
            }
        }

    }

    private fun init() {
        btnGet.text = "non blocking UI call test"
    }
}
