package com.example.pelajaranipa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_list.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.biologi,"Biologi","Biologi merupakan ilmu hayat yang mana mengajarimu tentang kehidupan dan seluruh organisme","Biologi atau ilmu hayat adalah kajian tentang kehidupan, dan organisme hidup, termasuk struktur, fungsi, pertumbuhan, evolusi, persebaran, dan taksonominya." +
                "Ilmu biologi modern membahas pengetahuan yang sangat luas, eklektik, serta terdiri dari berbagai macam cabang dan subdisiplin." +
                "Secara umum, seluruh cabang keilmuan biologi disatukan oleh konsep dasar yang mengatur semua penelitian biologi, yaitu konsep tentang sel, gen, dan evolusi. Sel diakui sebagai satuan dasar kehidupan, gen diakui sebagai satuan dasar pewarisan, dan evolusi diasumsikan sebagai mekanisme yang mendorong terciptanya spesies baru. Selain itu, kelangsungan hidup dari makhluk hidup diyakini terjadi karena adanya perilaku konsumsi, perubahan energi serta dengan regulasi yang menjaga kestabiilan dan vitaltas keadaan dalam tubuh."))

        data?.add(DataModel(R.drawable.fisika,"Fisika","Fisika membahas tentang dasar-dasar pembentuk alam dan gaya yang mempengaruhinya", "Fisika adalah salah satu disiplin akademik paling tua, mungkin yang tertua melalui astronomi yang juga termasuk di dalamnya." +
                "Lebih dari dua milenia, fisika menjadi bagian dari Ilmu Alam bersama dengan kimia, biologi, dan cabang tertentu matematika, tetapi ketika munculnya revolusi ilmiah pada abad ke-17, ilmu alam berkembang sebagai program penelitian sendiri." +
                "Fisika berkembang dengan banyak spesialisasi bidang ilmu lain, seperti biofisika dan kimia kuantum, dan batasan fisiknya tidak didefinisikan dengan jelas. Ilmu baru dalam fisika terkadang digunakan untuk menjelaskan mekanisme dasar sains lainnya serta membuka jalan area penelitian lainnya seperti matematika dan filsafat"))

        data?.add(DataModel(R.drawable.kimia,"Kimia","Kimia mempelajari tentang sifat, struktur, dan susunan dari suatu materi yang ada di alam", "Kimia adalah cabang dari ilmu fisik yang mempelajari tentang susunan, struktur, sifat, dan perubahan materi." +
                " Ilmu kimia meliputi topik-topik seperti sifat-sifat atom, cara atom membentuk ikatan kimia untuk menghasilkan senyawa kimia, interaksi zat-zat melalui gaya antarmolekul yang menghasilkan sifat-sifat umum dari materi, dan interaksi antar zat melalui reaksi kimia untuk membentuk zat-zat yang berbeda."))

        data?.add(DataModel(R.drawable.matematika,"Matematika","Matematika adalah ilmu pasti yang mempelajari tentang besaran, ruang, struktur.", "dalah ilmu yang mempelajari besaran, struktur, ruang, dan perubahan." +
                "Para matematikawan merangkai dan menggunakan berbagai pola, kemudian menggunakannya untuk merumuskan konjektur baru, dan membangun kebenaran melalui metode deduksi yang ketat diturunkan dari aksioma-aksioma dan definisi-definisi yang bersesuaian."))

        data?.add(DataModel(R.drawable.ekologi,"Ekologi","Ekologi mempelajari tentang lingkungan dan interaksi organisme di dalamnya", "Ekologi adalah cabang ilmu biologi yang mempelajari interaksi antara makhluk hidup dengan makhluk hidup lain dan juga dengan lingkungan sekitarnya." +
                "Dalam ilmu lingkungan, ekologi dijadikan sebagai ilmu dasar untuk memahami interaksi di dalam lingkungan. " +
                "Komponen yang terlibat dalam interaksi ini dapat dibagi menjadi komponen biotik (hidup) dan abiotik (tak hidup)."))

        data?.add(DataModel(R.drawable.astronomi,"Astronomi","merupakan sebuah cabang ilmu dalam IPA yang berguna untuk meneliti benda langit dan fenomena-fenomena lainnya di alam semesta yang ada di luar atmosfer bumi.", "Astronomi, kadang disebut sebagai ilmu bintang atau ilmu falak, adalah cabang ilmu alam yang meneliti benda langit (seperti bintang, planet, komet, dll) serta fenomena-fenomena alam yang terjadi di luar atmosfer Bumi (misalnya radiasi latar belakang kosmik)." +
                " Ilmu ini secara pokok mempelajari berbagai sisi dari benda-benda langit seperti asal usul, sifat fisika/kimia, meteorologi, dan gerak dan bagaimana pengetahuan akan benda-benda tersebut menjelaskan pembentukan dan perkembangan alam semesta."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("judul", item?.pelajaran)
                intent.putExtra("singkat", item?.singkat)
                intent.putExtra("penjelasan", item?.penjelasan)
                startActivity(intent)


            }


        })

    }

}