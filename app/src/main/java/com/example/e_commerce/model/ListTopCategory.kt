package  com.example.e_commerce.model

import com.example.e_commerce.R
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class ListCategory(@DrawableRes val imgTopCategory: Int, @StringRes val txtTopCategory: Int)

val dummyListTopCategory = listOf(
    R.drawable.cicil to R.string.txt_credit,
    R.drawable.cod to R.string.txt_cod,
    R.drawable.computer to R.string.txt_laptop,
    R.drawable.promo to R.string.txt_category_discount,
    R.drawable.official to R.string.txt_official_store,
    R.drawable.paylater to R.string.txt_pay_later
).map { ListCategory(it.first, it.second) }

