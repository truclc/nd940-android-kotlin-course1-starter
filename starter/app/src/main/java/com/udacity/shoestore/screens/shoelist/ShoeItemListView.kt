package com.udacity.shoestore.screens.shoelist

import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import com.udacity.shoestore.R
import com.udacity.shoestore.models.Shoe

class ShoeItemListView(context: Context, shoe: Shoe): LinearLayout(context) {

    var binding: ShoeItemListBinding =
        DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.shoe_list_item, this, true)

    init {
        binding.shoeItem = shoe
    }
}