package com.example.hw2_b11109024

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Spot(
    val id: Int,
    val name: String,
    val details: String,
    val address: String,
    @DrawableRes val imageResId: Int,
    val mapUrl: String
){
    companion object {
        val spotDetails = mapOf(
            1 to Spot(
                id = 1,
                name = "寶藏巖",
                details = "成立時間: 1940年代\n" +
                        "由戰後遷台的國軍退役官兵所建，現為文化藝術聚落，展現台北的歷史變遷和文化多樣性。",
                address = "臺北市中正區汀州路三段230巷14弄",
                imageResId = R.drawable.pic01,
                mapUrl = "https://maps.app.goo.gl/2KHSJ9t3BpqtFFRk6"
            ),
            2 to Spot(
                id = 2,
                name = "自來水博物館",
                details = "成立時間: 1993年\n" +
                        "原址為1908年建成的台北水道，展示自來水發展歷史，見證台北市政公共衛生的進步。",
                address = "台北市中正區思源街1號",
                imageResId = R.drawable.pic02,
                mapUrl = "https://maps.app.goo.gl/J9MicF9HYdL2xUqC7"
            ),
            3 to Spot(
                id = 3,
                name = "四四南村",
                details ="成立時間: 1948年\n" +
                        "國共內戰後的軍眷村，現為文化園區，保留了臺灣戰後初期的眷村文化。",
                address = "台北市信義區松勤街50號",
                imageResId = R.drawable.pic03,
                mapUrl = "https://maps.app.goo.gl/DZGXG8qNfoAFZs4Q6"
            ),
            4 to Spot(
                id = 4,
                name = "國父紀念館",
                details = "成立時間: 1972年\n" +
                        "紀念孫中山先生，展示其生平事蹟和革命歷程，是對臺灣而言相當重要的文化地標。",
                address = "台北市信義區仁愛路四段505號",
                imageResId = R.drawable.pic04,
                mapUrl = "https://maps.app.goo.gl/Hf4JtzKArHjLZoY18"
            ),
            5 to Spot(
                id = 5,
                name = "松山文創園區",
                details = "成立時間: 2011年\n" +
                        "由日治時期的松山菸廠改建而成，現為文化創意產業園區，融合歷史建築與現代藝術。",
                address = "台北市信義區光復南路133號",
                imageResId = R.drawable.pic05,
                mapUrl = "https://maps.app.goo.gl/kA5ZeKsFLYeqafQD7"
            ),
            6 to Spot(
                id = 6,
                name = "國家鐵道博物館籌備處",
                details = "成立時間: (尚未對外開放)\n" +
                        "前身是臺鐵的火車工廠。園區內展示各種列車、製作列車的設施，保留和傳承鐵道文化，成為重要的歷史教育場所。",
                address = "台北市大同區鄭州路一段2號",
                imageResId = R.drawable.pic06,
                mapUrl = "https://maps.app.goo.gl/kRmxEvGcY9T8QpP8A"
            ),
            7 to Spot(
                id = 7,
                name = "袖珍博物館",
                details = "成立時間: 1997年\n" +
                        "全世界最大的袖珍藝術展示館之一，展示世界各地的袖珍模型，推廣袖珍藝術。",
                address = "台北市中山區建國北路一段96號B1",
                imageResId = R.drawable.pic07,
                mapUrl = "https://maps.app.goo.gl/fxFP3HUpAdtRH4VP9"
            ),
            8 to Spot(
                id = 8,
                name = "大稻埕馬頭/迪化街商圈",
                details = "成立時間: 1850年代\n" +
                        "清朝開埠後的重要商業區，見證台北商業與文化的繁榮發展，現為兼具歷史文化意義級商業價值的觀光景點。",
                address = "台北市大同區延平北路一段",
                imageResId = R.drawable.pic08,
                mapUrl = "https://maps.app.goo.gl/dHiXFGvGDr9ntaU87"
            ),
            9 to Spot(
                id = 9,
                name = "臺北市立美術館",
                details = "成立時間: 1983年\n" +
                        "臺灣首座現代美術館，展覽內容涵蓋臺灣本地及國際現代藝術，推動台北藝術發展。",
                address = "台北市中山區中山北路三段181號",
                imageResId = R.drawable.pic09,
                mapUrl = "https://maps.app.goo.gl/NqNLCoKstpzpg22M7"
            ),
            10 to Spot(
                id = 10,
                name = "林安泰古厝",
                details = "成立時間: 原建築於1783年建造，後於1978年在現址重建\n" +
                        "原址在大龍峒，展示傳統閩南建築風格，是了解清代閩南移民生活的重要場所。現館內陳列林家的產業歷史，也舉辦許多傳統文化的體驗活動。",
                address = "台北市中山區濱江街5號",
                imageResId = R.drawable.pic10,
                mapUrl = "https://maps.app.goo.gl/RYXCUKi9o77GmL8m7"
            )
        )
    }
}

data class SpotDetail(
    val name: String,
    val detail: String
)
