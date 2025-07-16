package com.example.e_commerce.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.e_commerce.R
import com.example.e_commerce.model.ListBanner
import com.example.e_commerce.ui.theme.E_commerceTheme

@Composable
fun MainCardCategory(modifier: Modifier = Modifier, listBanner: ListBanner) {
    Card(
        modifier = modifier
            .widthIn(200.dp)
            .padding(16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
            .heightIn(48.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Image(
            painter = painterResource(id = listBanner.imgBanner),
            contentDescription = null
        )
    }
}

@Preview
@Composable
fun MainCardCategoryPreview() {
    E_commerceTheme {
        MainCardCategory(listBanner = ListBanner(R.drawable.banner1))
    }
}