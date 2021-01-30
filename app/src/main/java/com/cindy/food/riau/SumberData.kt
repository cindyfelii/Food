package com.cindy.food.riau

import com.cindy.food.riau.ListObjResep

class SumberData {
    companion object {
    fun buatSetData(): ArrayList<ListObjResep> {
        val list = ArrayList<ListObjResep>()
        list.add(
                ListObjResep(
                        "Lontong Medan",
                        "Wadah\n" +
                                "Panci",
                        "https://cookpad.com/id/recipe/images/7a1e2628b7423428",
                        "Bumbu halus (utk kuah sayur):\n" +
                                "Blender:\n" +
                                "12 siung Bawang putih\n" +
                                "4 biji Kemiri bulat\n" +
                                "4 sdm Ketumbar bubuk yg sdh di gongseng/sangrai\n" +
                                "1.5 sdm Jintan bubuk\n" +
                                "2 cm Lengkuas muda\n" +
                                "2 cm Jahe\n" +
                                "4 buah Cabe merah keriting\n" +
                                "Kunyit 12 ruas #atausesuaiselera tergantung kepekatan wrn kunyit\n" +
                                "Kapulaga 2 biji (isinya sj)\n" +
                                "5 sdm udang kecepe (udg rebon) yg sdh di goreng\n" +
                                "Bumbu kasar:\n" +
                                "3 cm Lengkuas geprek\n" +
                                "4 batang Sereh geprek\n" +
                                "8 lembar Daun jeruk\n" +
                                "10 lembar Daun salam\n" +
                                "2 lembar daun kunyit dirobek\n" +
                                "Lainnya:\n" +
                                "2000 ml Santan kental + cair (jumlah total)\n" +
                                "Labu jipang ukuran besar potong dadu 1 buah\n" +
                                "Wortel uk. Besar potong dadu kecil 2 buah\n" +
                                "1.5 ons Buncis di rawis\n" +
                                "50 ml Minyak utk menumis\n" +
                                "Pelengkap:\n" +
                                "Lontong\n" +
                                "Miehun goreng\n" +
                                "Sambal Tauco medan\n" +
                                "Keripik kentang balado\n" +
                                "Telur rebus #goreng\n" +
                                "Sambal goreng\n" +
                                "Bumbu rendang atau bisa diganti dgn serundeng\n" +
                                "Kerupuk merah",
                        "Langkah\n" +
                                "1. Tumis bumbu kasar sampai wangi dan layu kmudian masukkan bumbu halus, tumis.\n" +
                                "2. Masukkan sayur labu dan wortel, tumis +/- 10 menit dgn api sedang dan jgn lp tutup panci supaya cepat matang.\n" +
                                "3. Setelah warna tumisan terlihat lebih tua, masukkan santan, aduk rata jangan sampai mendidih.\n" +
                                "4. Terakhir Masukkan buncis\n" +
                                "5. Saat mulai mendidih baru masukkan garam 1 sdm munjung, gula 1.5 sdm, micin 0.5 sdt. Koreksi rasa\n" +
                                "6. Selesai.\n"
                )
        )
        list.add(
                ListObjResep(
                        "Mi gobak pedas",
                        "Kompor",
                        "https://cdn-brilio-net.akamaized.net/news/2019/10/22/172694/1115329-1000xauto-resep-makanan-khas-sumatera-utara.jpg",
                        "- 1/2 bungkus mi lidi rebus, tambah sedikit minyak lalu cuci bersih tiriskan\n" +
                                "- 200 gr kol cuci dan iris-iris\n" +
                                "- 100 gr wortel cuci dan iris-iris\n" +
                                "- Daun bawang, iris-iris\n" +
                                "- Seledri, iris-iris\n" +
                                "- 7 butir bawang merah, iris\n" +
                                "- Cabai secukupnya\n" +
                                "- Penyedap rasa\n" +
                                "- Garam\n" +
                                "- Gula\n" +
                                "- Kecap sesuai selera\n" +
                                "\n" +
                                "Bumbu halus:\n" +
                                "- 2 sdt merica atau sesuaikan selera\n" +
                                "- 2 buah kemiri\n" +
                                "- 5 siung bawang putih",
                        "- Tumis bawang merah sampai harum. Masukkan bumbu halus tumis sampai harum pula\n" +
                                "- Masukkan wortel kol daun bawang tumis sampai layu masukkan sedikit air cabai hijau, iris dan aduk\n" +
                                "- Masukkan mi lidinya tambahkan garam, gula, penyedap rasa dan kecap manis, lalu aduk rata\n" +
                                "- Setelah tanak tes rasa dan masukkan rawit utuh dan daun seledri, aduk dan sajikan."
                )
        )
        return list
    }
}
}