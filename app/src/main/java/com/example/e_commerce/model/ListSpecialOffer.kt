package  com.example.e_commerce.model

import com.example.e_commerce.R

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class ListSpecialOffer(@DrawableRes val image: Int, @StringRes val title: Int)

val dummyListSpecialOffer = listOf(
    (R.drawable.ic_electronic to R.string.txt_official_store),
    (R.drawable.ic_camera to R.string.txt_cod),
    (R.drawable.ic_smartphone to R.string.txt_pay_later)
).map { ListSpecialOffer(it.first, it.second) }