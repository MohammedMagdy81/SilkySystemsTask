package com.example.silkysystemstask.data

import com.example.silkysystemstask.R
import com.example.silkysystemstask.models.ItemHomeModel

object DataSource {

    fun homeItemList(): List<ItemHomeModel>{

        return listOf(
            ItemHomeModel(
                title = "Total Sales",
                price = 4500.50,
                image = R.drawable.image_total_sales
            ),
            ItemHomeModel(
                title = "Net Sales",
                price = 3420.50,
                image = R.drawable.image_net_sales
            ),
            ItemHomeModel(
                title = "Electronic Payments",
                price = 1235.50,
                image = R.drawable.image_elec_payment
            ),
            ItemHomeModel(
                title = "Cash Payments",
                price = 1245.50,
                image = R.drawable.image_cash_payment
            ),
            ItemHomeModel(
                title = "Total Refund",
                price = 1135.50,
                image = R.drawable.image_total_refund
            ),
            ItemHomeModel(
                title = "Total",
                price = 12435.0,
                image = R.drawable.image_total
            )
        )
    }

}