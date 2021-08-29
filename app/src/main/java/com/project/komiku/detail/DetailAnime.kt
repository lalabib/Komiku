package com.project.komiku

object DetailAnime {
    private val animeName = arrayOf(
        "Black Clover",
        "Boku no Hero Academia",
        "Boruto",
        "Edens Zero",
        "Haikyu",
        "Jujutsu Kaisen",
        "Naruto",
        "One Piece",
        "Tensei Shitara Slime Datta Ken",
        "Tokyo Revengers")

    private val genreAnime = arrayOf(
        "Action Comedy Fantasy Magic Shounen",
        "Action Comedy School Life Shounen Super Power",
        "Action Adventure Martial Arts Shounen Super Power",
        "Action Adventure Comedy Fantasy Magic Shounen",
        "Comedy Drama School Life Shounen Sport",
        "Action Demons Fantasy Shounen Super natural",
        "Action Adventure Comedy Drama Fantasy Martial Arts Shounen",
        "Action Adventure Comedy Fantasy Shounen",
        "Fantasy Isekai Shounen",
        "Action Drama Romance School Life Shounen")

    private val sinopsisAnime = arrayOf(
        "Asta dan Yuno adalah anak yatim yang dibesarkan di pinggiran kota Kerajaan Clover. Di dunia di mana orang terlahir dengan kekuatan magis yang memungkinkan mereka menggunakan sihir, Asta lahir tanpa satupun dari mereka. Sebaliknya, Yuno terlahir sebagai anak sulung dengan kekuatan magis di atas rata-rata dan bakat untuk mengendalikannya. Selain itu, dalam upacara penyambutan di masa mendatang, Yuno menerima tipu muslihat langka yang sama dengan grimoire yang dimiliki oleh Kaisar Sihir asli, semanggi empat daun grimoire. Di sisi lain, Asta menerima grimoire yang compang-camping dimana Iblis terletak di dalam, semanggi semanggi lima daun.",
        "Manga ini menceritakan tentang Izuku Midoriyaya, seorang anak laki-laki lahir tanpa kekuatan super di dunia di mana kekuaan super adalah hal yang wajar, tetapi masih bercita-cita menjadi seorang pahlawan super, dan dibimbing oleh pahlawan terkuat di dunia yang memberikan kekuatanya kepada Izuku.",
        "Boruto adalah anak dari hokage ke 7 yang terkenal sangat luas. boruto menganggap kalo naruto gak peduli dengan boruto hanya karena naruto jadi hokage. dia juga marah besar dikala naruto hanya pake bunshin untuk menghadiri ultah nya dari adek boruto 'himawari'. selain itu disaat ujian chunin boruto melakukan kecurangan hanya untuk membuat naruto bangga, namun malah sebalik nya. Boruto sama seperti kehidupan naruto jaman dulu, dijauhi temen, dibully 5 desa sekaligus dan dianggap pengkhiatan terparah sepanjang sejarah konoha. Setelah memperbaiki hubungan dengan naruto, boruto mulai memahami sifat dan kelakuan naruto.",
        "Edens Zero berfokus pada kehidupan Shiki Granbell yang hidup bersama para robot di sebuah taman hiburan yang terbengkalai. Suatu hari penjelajah angkasa bernama Rebecca Bluegarden dan kucing robotnya yang bernama Happy datang ke taman itu dan berakhir menjadi kawan. lalu Shiki berkeinginan untuk menemunkan 4 bintang Raja iblis yang dahulu menjadi teman kakeknya sebagai raja iblis.",
        "Terinpirasi setelah menyaksikan permainan ace dari tim Karasuno yang dijuluki 'Raksasa Kecil', Hinata yang juga memiliki tubuh kecil ingin menghidupkan kembali klub bola voli di sekolah menengahnya. Hinata berhasil membentuk tim dan mencoba mengikuti turnamen. Namun apa daya, pertandingan perama mereka ternyata berakhir secara brutal dihacurkan oleh 'Raja Pengadilan', Tobio Kageyama. Hinata bersumpah untuk melampaui Kageyama dan setelah lulus dari sekolah menengahnya, ia akan masuk ke klub bola voli SMA Karasuno. Tak disangka sainganya yang dulu ia sumpahkan ternyata rekan timnya sendiri. Meski memiliki tubuh yang kecil, Hinata tidak berkecil hati. Ia terus mengasah kemampuan bola volinya sampai ia menemukan keunggulan dari dirinya yakni kekuatan lompatannya.",
        "Jujutsu Kaisen mengisahkan Yuuji Itadori, seorang siswa SMA berbakat, memiliki fisik yang kuat dan cocok untuk ikut klub olahraga di sekolahnya. Namun, alih-alih bergabung ke klub olahraga, ia justru bergabung ke klub penelitian gaib. Alasannya, Yuuji hanya ingin bersenang-senang dan mengisi waktu senggang.",
        "Dua belas tahun sebelum dimulainya seri, Siluman Rubah Berekor-Sembilan menyerang Konohagakure. Ia menghancurkan desa dan menewaskan banyak orang. Pemimpin desa saat itu, Hokage Keempat mengorbankan hidupnya untuk menyegel Ekor-Sembilan pada seorang bayi yang baru lahir, Naruto Uzumaki. Ia menjadi yatim piatu karena peristiwa itu. Naruto dijauhi oleh penduduk desa, yang takut dan marah, melihat dia sebagai Ekor-Sembilan itu sendiri. Meskipun Hokage Ketiga melarang berbicara tentang sesuatu yang berhubungan dengan Ekor-Sembilan, anak-anak — diberi isyarat oleh orang tua mereka — mewarisi kebencian yang sama terhadap Naruto. Karena ingin dirinya diakui, Naruto bersumpah suatu hari akan menjadi Hokage terbesar bagi desa yang pernah ada.",
        "One Piece menceritakan tentang petualangan seorang anak bernama Monkey D. Luffy yang bercita-cita menjadi raja bajak laut dan menemukan 'One Piece' setelah terinspirasi oleh Shanks. Sekitar 22 tahun sebelum cerita dimulai, seorang bajak laut bernama Gol D. Roger, atau lebih dikenal sebagai raja bajak laut dieksekusi mati di depan publik. Tepat sebelum kematiannya, ia mengumumkan kepada orang banyak tentang harta miliknya, One Piece, yang diklaim sebagai harta terbesar yang pernah ada. Kematian Roger memicu dimulainya era 'Zaman Keemasan Bajak Laut', ditandai turunnya banyak bajak laut hingga tak terhitung jumlahnya mencari harta karun. Luffy termasuk salah satu yang berniat menemukan One Piece dan menjadi raja bajak laut berikutnya, turun ke laut untuk memulai petualangannya serta mulai mengumpulkan beberapa kru sebagai teman seperjalanan.",
        "Satoru Mikami merupakan seorang karyawan berumur 37 tahun dan masih perjaka. Ia meninggal dunia ketika melindungi juniornya yang sedang memamerkan calon istrinya dari perampok. Namun, perjalanan hidupnya ternyata tidak berhenti di situ. Ia terlahir kembali di dunia lain dengan sebuah takdir besar yang menantinya. Ia terlahir kembali sebagai sebuah monster slime lemah yang kerap diburu oleh berbagai petualang level awal. Seperti apakah nasibnya ketika ia menggunakan tubuh barunya itu?",
        "Takemichi adalah seorang lelaki pengangguran berusia 26 tahun. Dia baru mengetahui bahwa gadis yang menjadi pacarnya ketika masih duduk di bangku SMP satu-satunya gadis yang pernah dikencaninya telah meninggal akibat ulah geng berandalan. Kemudian, setelah hampir mati tertabrak kereta, dia menyadari bahwa dirinya kembali ke masa lalu saat dia masih duduk di bangku SMP. Takemichi bersumpah untuk mengubah masa depan dan menyelamatkan gadis itu. Demi melakukannya, dia bertujuan untuk naik ke puncak geng berandalan paling brutal di wilayah Kanto."

    )

    private val imageAnime = intArrayOf(
        R.drawable.black_clover1,
        R.drawable.boku_no_hero1,
        R.drawable.boruto1,
        R.drawable.edens_zero1,
        R.drawable.haikyuu1,
        R.drawable.jujutsu_kaisen1,
        R.drawable.naruto1,
        R.drawable.one_piece1,
        R.drawable.slime1,
        R.drawable.tokyo_revengers1
    )

    val listData: ArrayList<Anime>
    get(){
        val list = arrayListOf<Anime>()
        for (position in animeName.indices){
            val anime = Anime()
            anime.name = animeName[position]
            anime.genre = genreAnime[position]
            anime.photo = imageAnime[position]
            anime.sinopsis = sinopsisAnime[position]
            list.add(anime)
        }
        return list
    }

}