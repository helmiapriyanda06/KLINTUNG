package com.helmi_18104036.klintung.data

import com.helmi_18104036.klintung.model.DataModel

object DataPenginapan{
    private val title = arrayOf(
        "Green Valley Resort",
        "Hotel Teratai Putih",
        "Atrium Resort Hotel",
        "Queen Garden Hotel",
        "RedDoorz Plus near UNSOED Purwokerto",
        "Hotel Legen 2 Baturaden",
        "laqosta farm",
        "Purwosari guest house",
        "Menggala Cottage",
        "Hotel Puriwisata Baturraden"
    )

    private val image = arrayOf(
        "https://media-cdn.tripadvisor.com/media/photo-s/09/ca/33/65/photo0jpg.jpg",
        "https://cf.bstatic.com/images/hotel/max1024x768/240/240362729.jpg",
        "https://cf.bstatic.com/images/hotel/max1024x768/257/257933657.jpg",
        "https://media-cdn.tripadvisor.com/media/photo-s/0d/a9/6c/77/kolam-renang.jpg",
        "https://cf.bstatic.com/images/hotel/max1024x768/231/231134215.jpg",
        "https://origin.pegipegi.com/jalan/images/pictL/Y9/Y961689/Y961689003.jpg",
        "https://cf.bstatic.com/images/hotel/max1024x768/260/260751965.jpg",
        "https://cf.bstatic.com/images/hotel/max1024x768/261/261903447.jpg",
        "https://static.tiket.photos/image/upload/t_htl-dskt/v1589851758/tix-hotel/images-web/2020/05/19/79897c8a-1df9-429c-ada7-b31985d111af-1589851757296-d41d8cd98f00b204e9800998ecf8427e.png",
        "https://pix10.agoda.net/hotelImages/649/6492170/6492170_19012310280071597157.jpg"
    )

    private val description = arrayOf(
        "Green Valley Resort adalah pilihan yang populer di kalangan wisatawan di Purwokerto, baik untuk menjelajahinya atau hanya sekedar transit. Hotel ini memiliki segala yang dibutuhkan untuk menginap dengan nyaman. Tempat parkir mobil, antar-jemput bandara, fasilitas rapat, restoran, layanan binatu (laundry) ada dalam daftar hal-hal yang para tamu dapat nikmati. Semua kamar dirancang dan didekorasi untuk membuat tamu merasa seperti di rumah dan beberapa kamar dilengkapi dengan televisi layar datar, AC, meja tulis, bar mini, balkon/teras. Hibur diri Anda dengan fasilitas rekreasi di hotel, termasuk kolam renang luar ruangan, taman. Suasana yang ramah dan pelayanan yang istimewa bisa Anda harapkan selama menginap di Green Valley Resort.",
        "Terletak di Baturaden, 22 km dari Gunung Slamet, Hotel Teratai Putih memiliki lounge bersama, taman, dan teras. Akomodasi ini menyediakan resepsionis 24 jam dan layanan kamar untuk Anda.",
        "Atrium Resort Hotel adalah pilihan yang populer di kalangan wisatawan di Purwokerto, baik untuk menjelajahinya atau hanya sekedar transit. Menawarkan berbagai fasilitas dan layanan, hotel menyediakan semua yang Anda butuhkan untuk bermalam dengan nyaman. Staf yang siap melayani akan menyambut dan memandu Anda di Atrium Resort Hotel. Bersantailah di kamar Anda yang nyaman dan beberapa kamar dilengkapi dengan fasilitas seperti televisi layar datar, akses internet WiFi (gratis), AC, layanan bangun pagi, meja tulis. Untuk meningkatkan kualitas pengalaman menginap para tamu, hotel ini menawarkan fasilitas rekreasi seperti kolam renang luar ruangan, taman. Dengan layanan handal dan staf profesional, Atrium Resort Hotel memenuhi kebutuhan Anda.",
        "Terletak strategis di area Baturaden, Queen Garden Hotel menjanjikan kunjungan yang santai dan mengagumkan. Baik pebisnis maupun wisatawan, keduanya dapat menikmati fasilitas dan layanan dari properti ini. Layanan kamar 24 jam, WiFi gratis di semua kamar, Wi-fi di tempat umum, tempat parkir mobil, layanan kamar ada dalam daftar hal-hal yang dapat dinikmati oleh para tamu. Dirancang untuk memberikan kenyamanan, beberapa kamar memiliki televisi layar datar, akses internet WiFi (gratis), AC, layanan bangun pagi, meja tulis untuk memastikan kenyamanan istirahat malam Anda. Pulihkan diri Anda setelah berkeliling seharian dalam kenyamanan kamar Anda atau manfaatkan fasilitas seperti kolam renang luar ruangan, taman bermain anak, kolam renang anak, lapangan tenis, taman. Dengan layanan handal dan staf profesional, Queen Garden Hotel memenuhi kebutuhan Anda.",
        "RedDoorz Plus near UNSOED Purwokerto terletak di Purwokerto, 18 km dari Owabong. Guest house ini menawarkan akomodasi dengan Wi-Fi gratis dan parkir pribadi gratis. Kamar-kamar di guest house ini dilengkapi dengan TV layar datar.",
        "Hotel Legen 2 Baturaden berbintang 1 ini menawarkan kenyamanan kepada Anda baik untuk keperluan bisnis maupun berwisata di Purwokerto. Menawarkan berbagai fasilitas dan layanan, hotel menyediakan semua yang Anda butuhkan untuk bermalam dengan nyaman. Layanan kamar 24 jam, WiFi gratis di semua kamar, resepsionis 24 jam, check-in/check-out cepat, Wi-fi di tempat umum hanyalah beberapa dari berbagai fasilitas yang ditawarkan. Setiap kamar didesain dengan elegan dan dilengkapi dengan fasilitas yang berguna. Suasana tenang di hotel ini meluas hingga fasilitas rekreasinya yang meliputi taman. Dengan layanan handal dan staf profesional, Hotel Legen 2 Baturaden memenuhi kebutuhan Anda.",
        "Laqosta farm terletak di Rempawah, dan menawarkan akomodasi dengan bar dan Wi-Fi gratis. Akomodasi ini menyajikan sarapan prasmanan setiap hari. Anda dapat bersantai di taman akomodasi. Holiday park ini berjarak 6 km dari Baturaden dan Purwokerto.",
        "Purwosari guest house di Banyumas menawarkan akomodasi dengan teras dan pemandangan taman. Setiap unit menawarkan dapur lengkap, TV layar datar, ruang bersama, kamar mandi pribadi, dan mesin cuci.",
        "Menggala Cottage terletak di Wangon dan memiliki restoran, lounge bersama, taman, dan teras. Akomodasi ini menawarkan resepsionis 24 jam dan layanan kamar. Kamar-kamar di hotel ini memiliki meja kerja, TV, dan kamar mandi pribadi.",
        "Selain restoran, bed & breakfast ini juga menawarkan resepsionis 24 jam dan WiFi gratis di area umum."
    )

    private val lat = arrayOf(
        "-7.3375753",
        "7.3248299",
        "-7.4521482",
        "-7.3123891",
        "-7.3805715",
        "-2.4762576",
        "-7.3693205",
        "-7.3650426",
        "-7.3160675",
        "-7.3235681"
    )
    private val lang = arrayOf(
        "109.2291336",
        "109.2261168",
        "109.2794371",
        "109.2358833",
        "109.2489156",
        "108.9646441",
        "109.2315791",
        "110.3128586",
        "109.2369295",
        "109.2260361"
    )

    val listData:ArrayList<DataModel> get(){
        var list = arrayListOf<DataModel>()
        for (position in title.indices){
            val data = DataModel(title[position],image[position],description[position],lat[position],
                lang[position])
            list.add(data)
        }
        return  list
    }
}