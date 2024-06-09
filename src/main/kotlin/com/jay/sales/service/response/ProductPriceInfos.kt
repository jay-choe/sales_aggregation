package com.jay.sales.service.response

import java.io.Serializable

data class ProductPriceInfos(
    val vendorNames: List<ProductPrice>
) : Serializable

data class ProductPrice(
    val vendor: String,
    val price: Long
)