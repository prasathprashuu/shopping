package com.hybris.shopping.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hybris.shopping.Adapter.CategoryAdapter
import com.hybris.shopping.Model.Category
import com.hybris.shopping.R
import com.hybris.shopping.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter:CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter= CategoryAdapter(this,DataService.categores)
        CategoryListview.adapter=adapter
    }
}
