package com.example.e_commerce.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.e_commerce.model.ListCardForYou
import com.example.e_commerce.ui.theme.E_commerceTheme
import com.example.e_commerce.R


@Composable
fun MainBannerVertical(modifier: Modifier = Modifier,listBanner: ListCardForYou) {
    Card (  modifier = modifier.padding(start = 16.dp, bottom = 8.dp, end = 8.dp, top = 8.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ){

        Image(
            painter = painterResource(id = listBanner.imgCard),
            contentDescription = stringResource(id = listBanner.txtDesc)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MainBannerVerticalPreview() {
    E_commerceTheme {
        MainBannerVertical(
            listBanner = ListCardForYou(
                R.drawable.banner_vertikal1,
                R.string.txt_desc_first_banner
            )
        )
    }

}
