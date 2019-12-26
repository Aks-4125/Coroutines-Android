package com.aks4125

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aks4125.network.WebService
import com.google.gson.JsonObject
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val webService: WebService by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        Log.v(this@MainActivity.javaClass.name, webService.hashCode().toString())


        btnGet.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            tvSample.text = getString(R.string.request)
            CoroutineScope(Dispatchers.IO).launch {
                delay(2000)
                val response = webService.getResponse()
                if (response.code() == 200) {
                    val token: JsonObject? = response.body()
                    withContext(Dispatchers.Main) {
                        progressBar.visibility = View.GONE
                        tvSample.text = token.toString()
                        Toast.makeText(this@MainActivity, token.toString(), Toast.LENGTH_SHORT)
                            .show()
                    }
                    Log.v(this@MainActivity.javaClass.name, token.toString())
                } else {
                    withContext(Dispatchers.Main) {
                        tvSample.text = getString(R.string.api_error)
                        progressBar.visibility = View.GONE
                    }
                    Log.v(this@MainActivity.javaClass.name, response.message())
                }
            }
        }

    }

    private fun init() {
        btnGet.text = getString(R.string.non_block)
    }
}
