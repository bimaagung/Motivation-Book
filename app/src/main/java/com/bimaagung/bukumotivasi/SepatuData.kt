package com.bimaagung.bukumotivasi

//https://www.snapdeal.com/product/nike-epic-react-flyknit-silver/684460913725?vendorCode=Sa451f&pa=true&fv=true&supc=SDL408063903&isSellerPage=true

object SepatuData {
    private val data = arrayOf(
        arrayOf(
            "Nike Pegasus 33 Black Red Black Running Shoes",
            "Nike",
            "5.4",
            "Rp. 500.000,-",
            "https://n2.sdlcdn.com/imgs/h/s/4/Nike_Air_zoom_33_pegasus_SDL003861472_1_cd854-dcff0.jpeg",
            "Lightweight",
            "7-10",
            "Vietnam",
            "Hitam",
            "Mesh/Textile"
        ),
        arrayOf(
            "Nike EPIC REACT FLYKNIT Grey Running Shoes",
            "Nike",
            "3.7",
            "Rp. 419,000,00",
            "https://n3.sdlcdn.com/imgs/h/5/g/Nike-EPIC-REACT-FLYKNIT-Grey-SDL408063903-2-db40e.jpg",
            "Lightweight",
            "7-10",
            "Vietnam",
            "Abu - Abu",
            "Mesh/Textile"
        ),
        arrayOf(
            "Reebok Gray Running Shoes",
            "Reebok",
            "3.5",
            "Rp. 537,000.00",
            "https://n4.sdlcdn.com/imgs/h/v/l/Reebok-Gray-Running-Shoes-SDL581669805-1-6cdf8.jpeg",
            "Lightweight",
            "8-10",
            "Hongkong",
            "Abu - Abu",
            "Mesh/Textile"
        ),
        arrayOf(
            "Adidas STARGON (CI9925) Red Running Shoes",
            "Adidas",
            "3.7",
            "Rp. 617,000.00",
            "https://n2.sdlcdn.com/imgs/i/n/l/Adidas-STARGON-CI9925-Red-Running-SDL875071060-1-5ef59.jpeg",
            "Lightweight",
            "7-10",
            "Amerika",
            "Merah",
            "Mesh/Textile"
        ),
        arrayOf(
            "Puma Ridge Gray Running Shoes",
            "Puma",
            "3.2",
            "Rp. 437,000.00",
            "https://n4.sdlcdn.com/imgs/i/e/o/Puma-Ridge-Gray-Running-Shoes-SDL260158134-1-ca5f9.jpg",
            "Lightweight",
            "7-8",
            "Vietnam",
            "Abu - Abu Mix Orange",
            "Mesh/Textile"
        ),
        arrayOf(
            "Lotto CITYRIDE AMF Navy Running Shoes",
            "Lotto",
            "3.0",
            "Rp. 298,000.00",
            "https://n3.sdlcdn.com/imgs/i/h/0/Lotto-CITYRIDE-AMF-Navy-Running-SDL054127293-1-2a618.jpg",
            "Lightweight",
            "7-9",
            "Vietnam",
            "Navy",
            "Mesh/Textile"
        ),
        arrayOf(
            "Lotto DONATO Black Running Shoes",
            "Lotto",
            "3.2",
            "Rp. 199,000.00",
            "https://n3.sdlcdn.com/imgs/i/j/8/Lotto-DONATO-Black-Running-Shoes-SDL555857494-1-b522e.jpg",
            "Lightweight",
            "7-10",
            "Vietnam",
            "Hitam",
            "Mesh/Textile"
        ),
        arrayOf(
            "Adidas Furio 1 Silver Running Shoes",
            "Adidas",
            "3.5",
            "Rp. 796,000.00",
            "https://n2.sdlcdn.com/imgs/i/d/k/Adidas-Furio-1-Silver-Running-SDL425528686-1-2c0b9.jpeg",
            "Lightweight",
            "7-10",
            "Amerika",
            "Silver",
            "Mesh/Textile"
        ),
        arrayOf(
            "Adidas ADISPREE 2.0 M Green Running Shoes",
            "Adidas",
            "5.0",
            "Rp. 361,000.00",
            "https://n2.sdlcdn.com/imgs/i/m/a/Adidas-ADISPREE-2-0-M-SDL048691897-1-dd39f.jpg",
            "Lightweight",
            "7-10",
            "Amerika",
            "Hitam mix Navy",
            "Mesh/Textile"
        ),
        arrayOf(
            "Asics Gray Running Shoes",
            "Asics",
            "5.3",
            "Rp. 935,000.00",
            "https://n1.sdlcdn.com/imgs/i/c/6/Asics-Gray-Running-Shoes-SDL629025011-1-00b78.jpeg",
            "Lightweight",
            "7-10",
            "Vietnam",
            "Abu - Abu",
            "Mesh/Textile"
        )
    )

    val listData: ArrayList<Sepatu>
        get() {
            val list = arrayListOf<Sepatu>()
            for (aData in data) {
                val sepatu = Sepatu()
                sepatu.nama = aData[0]
                sepatu.brand = aData[1]
                sepatu.rating = aData[2]
                sepatu.harga = aData[3]
                sepatu.foto = aData[4]
                sepatu.fitur = aData[5]
                sepatu.size = aData[6]
                sepatu.manufaktur = aData[7]
                sepatu.warna = aData[8]
                sepatu.bahan = aData[9]
                list.add(sepatu)
            }
            return list
        }
}