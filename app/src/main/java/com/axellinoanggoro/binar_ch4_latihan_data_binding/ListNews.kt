package com.axellinoanggoro.binar_ch4_latihan_data_binding

data class ListNews(
    var judul: String,
    var tanggal: String,
    var penulis: String,
    var img: Int,
    var konten: String
) : java.io.Serializable
