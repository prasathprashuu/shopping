package com.hybris.shopping.Adapter

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.hybris.shopping.Model.Category
import com.hybris.shopping.R
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.BaseAdapter as BaseAdapter

class CategoryAdapter(context:Context, categories: List<Category>) : BaseAdapter() {
    val categories=categories
    val context=context

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView:View
        val holder : ViewHolder

        if(convertView==null){
            categoryView=LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
            holder=ViewHolder()
            holder.categoryImageView= categoryView.findViewById(R.id.categoryImageView)
            holder.categoryTextView= categoryView.findViewById(R.id.CategoryTextView)
            categoryView.tag= holder
        }else {
            holder=convertView.tag as ViewHolder
            categoryView=convertView
        }

        val category= categories[position]
        val resourceID= context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImageView?.setImageResource(resourceID)
        holder.categoryTextView?.text  = category.title

        return categoryView

    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {

        return categories.count()
    }

    private class ViewHolder {
        var categoryImageView: ImageView? = null
        var categoryTextView: TextView? = null
    }

}