package com.cindy.food.papuaa

import com.cindy.food.kalimantanutara.ListObjResep

class SumberData {
    companion object {
        fun buatSetData(): ArrayList<ListObjResep> {
            val list = ArrayList<ListObjResep>()
            list.add(
                    ListObjResep(
                            "Papeda tuna kuah kuning",
                            "Wadah\n" +
                                    "Panci",
                            "https://cdn-brilio-net.akamaized.net/news/2019/10/30/173135/1119416-resep-makanan-khas-papua.jpg",
                            "Bahan papeda:\n" +
                                    "- 250 gr tepung sagu\n" +
                                    "- 500 ml air mendidih\n" +
                                    "\n" +
                                    "Bahan tuna kuah kuning:\n" +
                                    "- 500 gr tuna fillet\n" +
                                    "- daun kemangi secukupnya\n" +
                                    "- 2 buah tomat\n" +
                                    "- minyak goreng secukupnya\n" +
                                    "- 1 liter air\n" +
                                    "- 1/2 sdt kaldu jamur bubuk\n" +
                                    "- garam, gula secukupnya\n" +
                                    "\n" +
                                    "Bumbu haluskan:\n" +
                                    "- 2 ruas kunyit\n" +
                                    "- 8 siung bawang merah\n" +
                                    "- 5 siung bawang putih\n" +
                                    "- 5 butir kemiri\n" +
                                    "- 1/2 sdt ketumbar\n" +
                                    "- 3 buah cabai merah\n",
                            "Cara memasak:\n" +
                                    "\n" +
                                    "Papeda\n" +
                                    "1. Campur tepung sagu dengan sedikit air (sekitar 50 ml). Didihkan air, masukkan tepung sagu, aduk terus jangan berhenti sampai berubah warna menjadi bening. Angkat, sisihkan.\n" +
                                    "\n" +
                                    "Kuah Ikan kuning:\n" +
                                    "1. Tumis bumbu halus sampai harum, sisihkan\n" +
                                    "2. Iris tuna sesuai selera, beri perasan jeruk nipis, diamkan sebentar, lalu cuci bersih, sisihkan\n" +
                                    "3. Panaskan air dalam panci, masukkan bumbu tumis tadi, aduk rata. Tunggu agak mendidih, masukkan tuna, daun kemangi, tomat. Jika sudah matang, angkat.\n" +
                                    "\n" +
                                    "Penyajian:\n" +
                                    "1. Ambil papeda dengan sumpit, pindahkan ke mangkok. Siram dengan tuna kuah kuning\n" +
                                    "2. Sajikan hangat.\n"
                    )
            )
            list.add(
                    ListObjResep(
                            "Tumis Kulit Melinjo Khas Banten",
                            "Kompor",
                            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.suara.com%2Flifestyle%2F2019%2F07%2F31%2F070000%2Ftumis-kulit-melinjo-teri-lembut-dan-gurih-kreasi-yang-bikin-makan-lahap&psig=AOvVaw35YhplqIqyM4g4mRZYVXAH&ust=1612027171925000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJj45KrTwe4CFQAAAAAdAAAAABAD",
                            "1 bungkus kulit melinjo\n" +
                                    "segenggam teri nasi\n" +
                                    "7 buah cabe hijau (atau sesuai selera)\n" +
                                    "3 sdm minyak sayur\n" +
                                    "3 buah bawang putih\n" +
                                    "5 buah bawah merah\n" +
                                    "3 lembar daun jeruk\n" +
                                    "1 ruas lengkuas (geprek)\n" +
                                    "100 ml air\n" +
                                    "secukupnya garam, gulput, merica bubuk dan penyedap\n",
                            "1. Cuci bersih kulit melinjo, belah 2 memanjang atau sesuai selera. Lalu rebus kurleb 5 menit supaya tidak langu. Angkat dan tiriskan.\n" +
                                    "2. Tumis teri yg sdh dicuci bersih (jangan terlalu kering), tambahkan irisan bawang merah, bawang putih, daun jeruk, lengkuas geprek dan cabe hijau yg sdh dipotong2.\n" +
                                    "3. Masukkan kulit melinjo, aduk rata. Tambahkan air, garam, gulput, merica bubuk dan penyedap.\n" +
                                    "4. Cek rasa, tumis kulit melinjo khas Banten siap dihidangkan."
                    )
            )
            return list
        }
    }
}