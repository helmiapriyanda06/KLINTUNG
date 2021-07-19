package com.helmi_18104036.klintung.data

import com.helmi_18104036.klintung.model.DataModel

object DataWisata{
    private val title = arrayOf(
        "Wisata Pagubugan",
        "The Village Purwokerto",
        "loka wisata baturaden",
        "Kebun Bunga Rempoah",
        "Bukit Pandang Munggang",
        "Sendang Bidadari",
        "Bukit Watu Meja",
        "Bukit Agaran",
        "Hutan Pinus Limpakuwus",
        "Bukit Tranggulasih",

        )

    private val image = arrayOf(
        "https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2019/09/18-1-by-@miftakhulmukhasin-@hengki_pamungkas-740x294.jpg",
        "https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2019/09/21-2-by-@The-Village-Purwokerto-740x740.jpg",
        "https://www.hargatiket.net/wp-content/uploads/2019/01/harga-tiket-lokawisata-baturraden.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2019/02/050502025050/1-1-Rempoah-By-instapurwokerto.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2019/02/050502020505/2-1-Munggang-By-fhm_atm.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2019/02/050502022323/3-1-SendangBidadari-By-asyrull.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2019/02/050502023434/4-1-BukitWatuMeja-By-ferdianh11man.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2019/02/050502023434/4-1-BukitWatuMeja-By-ferdianh11man.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2019/02/050502024848/5-3-BukitAgaran.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/09/070709092121/5-1-Limpakuwus-By-fia_hartono.jpg",

        )

    private val description = arrayOf(
        "JAM BUKA 07.00 WIB - 17.00 WIB\n" +
                "\n" +
                "HARGA TIKET Rp.10.000\n" +
                "\n" +
                "Berada di lereng Gunung Slamet, wisata Pagubugan akan membawa Anda merasakan betapa" +
                "tenang dan nyamannya berada di tengah persawahan dan bermain air di sungai. Eduwisata yang berada" +
                "di Desa Melung ini memiliki berbagai spot wisata menarik yang akan memanjakan Anda. Mulai dari trek" +
                "jogging, outbond, camping ground, sawah pelangi, taman kelinci, berbagai spot foto keren dan juga" +
                "Grujugan Bengkok.Di Grujugan Bengkok ini Anda bisa mandi sepuasnya dan airnya sangat jernih, lho!" +
                "Selain itu lintasan grujugan ini juga panjang, melewati persawahan dan tidak dalam, sehingga aman buat" +
                "si kecil. Selain itu ada juga wisata bercocok tanam bagi anak paud, TK maupun SD yang berkunjung. Dan" +
                "yang terbaru ada kolam renang di tengah persawahan yang aman untuk anak-anak.",

        "JAM BUKA 08.00 WIB - 17.30 WIB\n" +
                "\n" +
                "HARGA TIKET Rp.25.000\n" +
                "\n" +
        "Berlokasi tak terlalu jauh dengan pusat kota Purwokerto, The Village hadir dengan gaya unik\n" +
                "khas perkampungan Eropa. Bangunan tinggi besar menyerupai kastil dengan dinding bata langsung\n" +
                "mencuri perhatian begitu melangkahkan kaki ke sini. Ada beragam aktivitas yang bisa Anda lakukan di\n" +
                "sini: naik perahu mengitari kanal buatan di sekitar taman rekreasi, memberi makan aneka binatang\n" +
                "(burung, kelinci, sapi, domba), menunggang kuda, foto-foto dengan kostum Belanda, dan masih banyak\n" +
                "lagi!",

        " Lokawisata Baturradèn) terletak di sebelah selatan Gunung Slamet memiliki udara sejuk\n" +
                "            dan cenderung bertambah dingin di malam hari. Selain memiliki panorama alam yang cantik,\n" +
                "            Baturraden juga memiliki banyak legenda rakyat, salah satunya cerita lutung kasarung yang terkenal",

        " Yang tertarik menikmati warna-warna cerah bunga matahari dan marigold, kebun bunga ini\n" +
                "            adalah spot yang tepat dikunjungi. Kamu dipersilakan berburu foto yang Instagenik,\n" +
                "            tapi jangan sampai merusak kebun bunganya",

        "Bukit Pandang Munggang menjadi destinasi wisata di Banyumas yang harus kamu kunjungi\n" +
                "            jika ingin melihat keindahan alam dan lanskap yang keren dari kota ini. Tidak hanya itu saja,\n" +
                "            banyak spot berfoto kece yang bisa jadi pilihan background kamu, terutama saat malam hari!",

        "Banyumas memiliki Bukit Agaran yang tidak kalah menariknya. Tangan raksasa sebagai spot foto,\n" +
                "            dengan background alam yang keren, pun terdapat di sini, dan pastinya bisa menjadi salah satu alasan untuk datang ke sini.",

        "kamu akan mendapati lukisan alam dalam bentuk 3D yang luar biasa! Perpaduan perbukitan yang hijau di kejauhan,\n" +
                "            aliran sungai dan langit biru sebagai latar, sungguh view yang istimewa!",

        "Banyumas memiliki Bukit Agaran yang tidak kalah menariknya. Tangan raksasa sebagai spot foto " +
                "dengan background alam yang keren pun terdapat di sini dan pastinya bisa menjadi salah satu alasan untuk datang ke sini.",

        "Hutan Pinus Limpakuwus bisa menjadi alternatif yang pas. Suasananya masih alami, pun demikian dengan panoramanya yang asri. " +
                "Yang tertarik camping di sini juga asyik, lho!",

        "Salah satu destinasi wisata di Banyumas yang tidak boleh dilewatkan adalah Bukit Tranggulasih. Sempat ditutup untuk sementara waktu, " +
                "spot wisata ini menawarkan tempat yang mengesankan untuk menikmati pesona alam Purwokerto.",

        )

    private val lat = arrayOf(
        "-7.333797",
        "-7.374473",
        "-7.3132769",
        "-7.3660224",
        "-7.3171774",
        "-7.3189301",
        "-7.5190126",
        "-7.3397431",
        "-7.3049015",
        "-7.335357",
    )

    private val lang = arrayOf(
        "109.206959",
        "109.240532",
        "109.2268298",
        "109.2317504",
        "109.2171901",
        "109.241691",
        "109.2123145",
        "109.2056378",
        "109.2420843",
        "109.1990246",



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