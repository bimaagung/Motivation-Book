package com.bimaagung.bukumotivasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail_sepatu.*

class DetailSepatu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_sepatu)


        detailToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)

        detailToolbar.setNavigationOnClickListener{
            onBackPressed()
        }

        tx_nama_produk.text = intent.getStringExtra("nama")
        tx_brand_produk.text = intent.getStringExtra("brand")
        tx_rating_produk.text = intent.getStringExtra("rating")
        tx_harga_produk.text = intent.getStringExtra("harga")
        tx_fitur_produk.text = intent.getStringExtra("fitur")
        tx_size_produk.text = intent.getStringExtra("size")
        tx_manufaktur.text = intent.getStringExtra("manufaktur")
        tx_warna.text = intent.getStringExtra("warna")
        tx_bahan.text = intent.getStringExtra("bahan")
        var foto = intent.getStringExtra("foto")

        Glide.with(this)
            .load(foto)
            .apply(RequestOptions().override(130, 150))
            .into(imageView)

    }
}
