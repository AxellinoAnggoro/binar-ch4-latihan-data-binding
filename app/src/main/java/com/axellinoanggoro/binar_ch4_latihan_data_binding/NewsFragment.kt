package com.axellinoanggoro.binar_ch4_latihan_data_binding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.axellinoanggoro.binar_ch4_latihan_data_binding.databinding.FragmentDetailBinding
import com.axellinoanggoro.binar_ch4_latihan_data_binding.databinding.FragmentNewsBinding

class NewsFragment : Fragment() {

    lateinit var binding: FragmentNewsBinding
    lateinit var adapterNews: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapterNews = NewsAdapter(
            arrayListOf(
                ListNews(
                    "Rencana Perang AS dan NATO di Ukraina Diduga Bocor di Internet",
                    "Sabtu, 8 April 2023",
                    "CNN Indonesia",
                    R.drawable.news,
                    "Kementerian Pertahanan AS atau yang biasa disebut Pentagon sedang menginvestigasi beberapa tangkapan layar (screenshots) yang diduga memuat informasi rahasia terkait Ukraina. Tangkapan layar milik AS dan NATO tersebut beredar di media sosial. CNN melaporkan, pejabat AS mengatakan dokumen tersebut merupakan bagian dari slide asli dan bagian dari dek intelijen harian yang lebih besar."
                ),
                ListNews(
                    "Geger Ilmuan China Sebut Virus Covid-19 Berasal dari Manusia",
                    "Minggu, 9 April 2023",
                    "CNBC Indonesia",
                    R.drawable.news2,
                    "Peneliti China mengklaim bahwa virus Covid-19 kemungkinan berasal dari manusia, bukan dari hewan seperti temuan penelitian sebelumnyaMengutip CNN Internasional, Tong Yigang dari Universitas Teknologi Kimia Beijing menjelaskan bahwa urutan genetik dari sampel virus yang diambil dari Pasar Makanan Laut Huanan di Wuhan, yang dianggap sebagai titik nol pandemi, \"hampir identik\" dengan pasien yang terinfeksi virus corona. Hal ini, menurut dia, menunjukkan bahwa Covid-19 mungkin berasal dari manusia."
                ),
                ListNews(
                    "Banyak Data Penting! Waspada, Salah Sedikit IHSG Bisa Ambruk",
                    "Minggu, 9 April 2023",
                    "CNBC Indonesia",
                    R.drawable.news3,
                    "Pasar keuangan Tanah Air pekan ini cenderung bergerak beragam. Indeks Harga Saham Gabungan (IHSG) menghentikan penguatan dua pekan beruntun, sementara rupiah melanjutkan kinerja impresifnya melawan dolar Amerika pekan ini. Lantas mampukah pasar keuangan melanjutkan kinerja positifnya pekan depan?"
                ),
                ListNews(
                    "Rencana Perang AS dan NATO di Ukraina Diduga Bocor di Internet",
                    "Sabtu, 8 April 2023",
                    "CNN Indonesia",
                    R.drawable.news,
                    "Kementerian Pertahanan AS atau yang biasa disebut Pentagon sedang menginvestigasi beberapa tangkapan layar (screenshots) yang diduga memuat informasi rahasia terkait Ukraina. Tangkapan layar milik AS dan NATO tersebut beredar di media sosial. CNN melaporkan, pejabat AS mengatakan dokumen tersebut merupakan bagian dari slide asli dan bagian dari dek intelijen harian yang lebih besar."
                ),
                ListNews(
                    "Rencana Perang AS dan NATO di Ukraina Diduga Bocor di Internet",
                    "Sabtu, 8 April 2023",
                    "CNN Indonesia",
                    R.drawable.news,
                    "Kementerian Pertahanan AS atau yang biasa disebut Pentagon sedang menginvestigasi beberapa tangkapan layar (screenshots) yang diduga memuat informasi rahasia terkait Ukraina. Tangkapan layar milik AS dan NATO tersebut beredar di media sosial. CNN melaporkan, pejabat AS mengatakan dokumen tersebut merupakan bagian dari slide asli dan bagian dari dek intelijen harian yang lebih besar."
                ),
            )
        )

        binding.newsRv.adapter = adapterNews
        binding.newsRv.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

}