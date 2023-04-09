package com.axellinoanggoro.binar_ch4_latihan_data_binding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.axellinoanggoro.binar_ch4_latihan_data_binding.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var detailData = arguments?.getSerializable("key") as ListNews
        binding.detailJudul.text = detailData.judul
        binding.detailImg.setImageResource(detailData.img)
        binding.detailTanggal.text = detailData.tanggal
        binding.detailPenulis.text = detailData.penulis
        binding.detailKonten.text = detailData.konten
    }

}