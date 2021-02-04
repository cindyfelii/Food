package com.cindy.food.jawatenggah

import com.cindy.food.jawatenggah.ListObjResep

class SumberData {
    companion object {
        fun buatSetData(): ArrayList<ListObjResep> {
            val list = ArrayList<ListObjResep>()
            list.add(
                ListObjResep(
                    "Brekecek ikan",
                    "Wadah\n" +
                            "Panci",
                    "https://cdn-brilio-net.akamaized.net/news/2019/10/21/172627/1114523-15-resep-makanan-khas-jawa-tengah-terkenal-enak-dan-mudah.jpg",
                    "Bahan:\n" +
                            "- 1 batang sereh\n" +
                            "- 2 lembar daun jeruk\n" +
                            "- 1 tangkai daun bawang\n" +
                            "- 3 lembar daun salam\n" +
                            "- gula merah secukupnya\n" +
                            "- 1 tomat\n" +
                            "- 2 cabai merah besar\n" +
                            "- Royko sapi\n" +
                            "- air secukupnya\n" +
                            "\n" +
                            "Bumbu halus:\n" +
                            "- 1 sdt garam\n" +
                            "- 3 biji kemiri\n" +
                            "- 7 cabai rawit\n" +
                            "- 1 cabai merah\n" +
                            "- 4 siung bawang merah\n" +
                            "- sejumput lada\n" +
                            "- 3 siung bawang putih\n" +
                            "- 2 cm kunyit\n" +
                            "- 2 cm jahe\n",
                    "Cara memasak:\n" +
                            "a. Goreng ikan. Sisihkan\n" +
                            "b. Sangrai kemiri, kunyit, bawang putih, dan jahe.\n" +
                            "c. Tumis bumbu halus, masukan gula merah dan tomat. Aduk hingga bumbu matang. Tuang air secukupnya.\n" +
                            "d. Masukkan daun jeruk, daun bawang, irisan cabai merah besar, dan daun bawang.\n" +
                            "e. Masukan ikan, aduk sampai mendidih. Tambahkan Royko sapi.\n"
                )
            )
            list.add(
                ListObjResep(
                    "Soto Kudus",
                    "Kompor",
                    "https://cdn-brilio-net.akamaized.net/news/2019/10/21/172627/1114525-1000xauto-15-resep-makanan-khas-jawa-tengah-terkenal-enak-dan-mudah.jpg",
                    "Bahan:\n" +
                            "- 1 ekor ayam kampung, potong-potong\n" +
                            "- 3 lembar daun jeruk\n" +
                            "- 2 sdm gula merah, sisir\n" +
                            "- air secukupnya\n" +
                            "- 2 batang serai, memarkan\n" +
                            "- 3 lembar daun salam\n" +
                            "- 2 batang daun bawang, potong-potong\n" +
                            "- garam dan merica bubuk secukupnya\n" +
                            "\n" +
                            "Bumbu halus:\n" +
                            "- 5 siung bawang putih\n" +
                            "- 2 ruas kunyit\n" +
                            "- 1/2 sdt ketumbar\n" +
                            "- 10 siung bawang merah\n" +
                            "- 4 butir kemiri\n" +
                            "- 2 ruas jahe\n" +
                            "- sejumput jinten\n" +
                            "\n" +
                            "Bahan pelengkap:\n" +
                            "- tauge rebus\n" +
                            "- sambal rawit\n" +
                            "- bawang goreng\n" +
                            "- emping atau keripik kentang\n" +
                            "- seledri, iris tipis\n" +
                            "- jeruk nipis\n",
                    "Cara memasak:\n" +
                            "a. Rebus ayam sampai matang, tiriskan. Ganti air, rebus lagi ayam hingga empuk.\n" +
                            "b. Tumis bumbu halus, masukkan daun salam, daun bawang, daun jeruk, dan serai.\n" +
                            "c. Tuang 2 sendok sayur kaldu ayam, beri daun bawang. Masak lagi hingga mendidih.\n" +
                            "d. Masukkan tumisan ke panci ayam yang sedang direbus, aduk rata. Beri gula merah, garam, dan merica bubuk secukupnya.\n" +
                            "e. Tiriskan ayam, suwir-suwir secukupnya.\n" +
                            "f. Tata nasi dengan suwiran ayam dan tauge rebus, tuang kuah soto kudus. Beri bahan pelengkap di atasnya.\n"
                )
            )
            list.add(
                ListObjResep(
                    "Nasi gandul",
                    "Kompor",
                    "https://cdn-brilio-net.akamaized.net/news/2019/10/21/172627/1114522-1000xauto-15-resep-makanan-khas-jawa-tengah-terkenal-enak-dan-mudah.jpg",
                    "Bahan:\n" +
                            "- 500 gram daging sapi\n" +
                            "- 2 batang serai\n" +
                            "- garam dan kecap manis secukupnya\n" +
                            "- 2 cm lengkuas\n" +
                            "- 2 lembar salam\n" +
                            "- jeruk nipis\n" +
                            "- kaldu jamur secukupnya\n" +
                            "- 1 sdm gula jawa\n" +
                            "- 1,5 liter santan kelaoa\n" +
                            "- bawang goreng\n" +
                            "\n" +
                            "Bumbu halus:\n" +
                            "- 10 butir bawang merah\n" +
                            "- 6 butir kemiri\n" +
                            "- 1/2 sdt merica bubuk\n" +
                            "- 4 siung bawang putih\n" +
                            "- 2 buah kluwak\n" +
                            "- 1/4 sdt jinten\n" +
                            "- 2 cm kencur\n" +
                            "- 1/2 sdt ketumbar sangrai\n",
                    "Cara memasak:\n" +
                            "a. Rebus daging sampai empuk.\n" +
                            "b. Tumis bumbu halus, masukkan serai, lengkuas, dan daun salam.\n" +
                            "c. Masukkan daging, masak hingga daging berubah warna.\n" +
                            "d. Tuang air 2 liter dan santan kelapa.\n" +
                            "e. Beri gula jawa, garam, kaldu jamur, dan kecap manis. Masak dengan api kecil hingga bumbu meresap.\n"
                )
            )
            list.add(
                ListObjResep(
                    "Garang asem",
                    "Kompor",
                    "https://cdn-brilio-net.akamaized.net/news/2019/10/21/172627/1114521-1000xauto-15-resep-makanan-khas-jawa-tengah-terkenal-enak-dan-mudah.jpg",
                    "Bahan:\n" +
                            "- 1 kg ayam\n" +
                            "- 5 siung bawang putih, geprek halus\n" +
                            "\n" +
                            "Bumbu:\n" +
                            "- 4 buah cabe ijo plompong, potong-potong\n" +
                            "- 2 lembar daun salam\n" +
                            "- 7 buah cabe rawit\n" +
                            "- 5 buah tomat hijau, potong-potong\n" +
                            "- 3 cm lengkuas\n" +
                            "- santan cair secukupnya\n",
                    "Cara memasak:\n" +
                            "a. Rebus ayam hingga cukup empuk.\n" +
                            "b. Masukkan semua bumbu. Masak hingga ayam setengah matang.\n" +
                            "c. Tuang santan cair, beri gula dan garam secukupnya. Masak sampai matang dan siap disajikan.\n"
                )
            )
            return list
        }
    }
}