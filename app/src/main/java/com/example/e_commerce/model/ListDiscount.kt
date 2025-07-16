package  com.example.e_commerce.model

import com.example.e_commerce.R
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class ListDiscount(@DrawableRes val imgDiscount: Int, @StringRes val txtDiscount: Int)

val dummyListDiscount = listOf(
    R.drawable.ic_discount to R.string.txt_dummy_discount_10,
    R.drawable.ic_discount to R.string.txt_dummy_discount_20,
    R.drawable.ic_discount to R.string.txt_dummy_discount_30
).map { ListDiscount(it.first, it.second) }