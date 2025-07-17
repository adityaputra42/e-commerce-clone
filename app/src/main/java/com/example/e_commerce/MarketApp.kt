package com.example.e_commerce

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.e_commerce.component.BottomBar
import com.example.e_commerce.component.MainBannerVertical
import com.example.e_commerce.component.MainBottomCategory
import com.example.e_commerce.component.MainCardCategory
import com.example.e_commerce.component.MainImageCategory
import com.example.e_commerce.component.MainTopBar
import com.example.e_commerce.component.MainTopCategory
import com.example.e_commerce.component.TopMenu
import com.example.e_commerce.model.dummyListBanner
import com.example.e_commerce.model.dummyListBottomCategory
import com.example.e_commerce.model.dummyListCardForYou
import com.example.e_commerce.model.dummyListTopCategory
import com.example.e_commerce.model.dummyListTopMenus
import com.example.e_commerce.ui.theme.E_commerceTheme

@Composable
fun MarketApp(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { MainTopBar(onMenuClick = {}) },
        bottomBar = { BottomBar() })
    { paddingValues ->
        Column(
            modifier = modifier
                .verticalScroll(rememberScrollState())
                .padding(paddingValues)
        ) {
//        your code compose here
            MainTopMenu()
            MainCategoryTop()
            MainCategoryCard()
            MainCategoryBottom()
            MainImageCategory()
            MainVerticalBanner()
        }
    }

}


@Composable
fun MainCategoryCard() {
    LazyRow {
        items(dummyListBanner) {
            MainCardCategory(listBanner = it)
        }
    }
}

@Composable
fun MainCategoryTop() {
    LazyRow {
        items(dummyListTopCategory) {
            MainTopCategory(listTopCategory = it)
        }
    }
}

@Composable
fun MainVerticalBanner() {
    LazyRow {
        items(dummyListCardForYou) {
            MainBannerVertical(listBanner = it)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainCategoryTopPreview() {
    E_commerceTheme {
        MainCategoryTop()
    }
}

@Composable
fun MainCategoryBottom() {
    LazyRow {
        items(dummyListBottomCategory) {
            MainBottomCategory(listBottomCategory = it)
        }
    }
}


@Composable
fun MainTopMenu() {
    LazyRow {
        items(dummyListTopMenus) {
            TopMenu(listTopMenu = it)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainTopMenuPreview() {
    E_commerceTheme {
        MainTopMenu()
    }
}

@Preview(device = Devices.DEFAULT, showBackground = true)
@Composable
fun MarketAppPreview() {
    E_commerceTheme {
        MarketApp()
    }
}