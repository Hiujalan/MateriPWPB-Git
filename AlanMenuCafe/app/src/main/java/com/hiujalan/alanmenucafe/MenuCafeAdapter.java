package com.hiujalan.alanmenucafe;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MenuCafeAdapter extends RecyclerView.Adapter<MenuCafeAdapter.MenuCafeViewHolder> {

    public class MenuCafeViewHolder extends RecyclerView.ViewHolder {
        private ConstraintLayout containerView;
        private TextView menuNama,menuHarga, menuRating;
        private ImageView menuImage;

//        public static final String EXTRA_NAMA = "com.hiujalan.alanmenucafe.extra.NAMA";
//        public static final String EXTRA_DETAIL = "com.hiujalan.alanmenucafe.extra.DETAIL";
//        public static final String EXTRA_HARGA = "com.hiujalan.alanmenucafe.extra.HARGA";
//        public static final String EXTRA_IMG = "com.hiujalan.alanmenucafe.extra.IMG";

        public MenuCafeViewHolder(@NonNull View itemView) {
            super(itemView);

            containerView = itemView.findViewById(R.id.menu_cafe_layout);
            menuNama = itemView.findViewById(R.id.menu_cafe_nama);
            menuHarga = itemView.findViewById(R.id.menu_cafe_harga);
            menuImage = itemView.findViewById(R.id.menu_image);
            menuRating = itemView.findViewById(R.id.menu_cafe_rating);

            containerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MenuCafe menus = (MenuCafe) containerView.getTag();
                    Intent intent = new Intent(view.getContext(),DetailMenu.class);
                    intent.putExtra("nama", menus.getNama());
                    intent.putExtra("detail", menus.getDetail());
                    intent.putExtra("harga", String.valueOf(menus.getHarga()));
                    intent.putExtra("img", menus.getImg());
                    intent.putExtra("rating",String.valueOf(menus.getRating()));
                    view.getContext().startActivity(intent);
                }
            });
        }
    }



    @NonNull
    @Override
    public MenuCafeAdapter.MenuCafeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_cafe_row,parent, false);
        return new MenuCafeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuCafeAdapter.MenuCafeViewHolder holder, int position) {
        MenuCafe current = menus.get(position);
        holder.menuNama.setText(current.getNama());
        holder.menuHarga.setText("Rp " + String.valueOf(current.getHarga()));
        holder.menuImage.setImageResource(current.getImg());
        holder.menuRating.setText(String.valueOf(current.getRating()));

        holder.containerView.setTag(current);
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    private List<MenuCafe> menus = Arrays.asList(
            new MenuCafe("Americano",11000,R.drawable.americano,4,"Americano adalah minuman kopi yang sederhana dan lezat. Ini terbuat dari espresso yang diencerkan dengan air panas. Gampangnya, bayangkan espresso yang lebih ringan dan lebih besar. Rasa Amerikano umumnya memiliki sentuhan ringan yang segar dengan aroma kopi yang khas, tanpa kekentalan espresso. Ini adalah pilihan yang baik jika Anda ingin menikmati rasa kopi yang otentik, tetapi tidak terlalu kuat seperti espresso murni. Bagi banyak orang, Americano adalah cara yang sempurna untuk memulai hari dengan penuh semangat atau untuk menikmati kopi yang menenangkan di tengah hari."),
            new MenuCafe("Cappuccino ", 15000,R.drawable.cappucino,5,"Cappuccino adalah minuman kopi yang lezat dan klasik. Ini adalah kombinasi sempurna antara espresso, susu, dan busa susu yang menggoda. Bayangkan espresso yang kuat dan kaya dicampur dengan susu yang lembut, lalu dihiasi dengan lapisan tipis busa susu yang lezat. Ini adalah minuman yang sempurna untuk memulai pagi atau menikmati di tengah hari. Cappuccino memiliki cita rasa yang seimbang antara kopi yang penuh karakter dan kelembutan dari susu, menciptakan pengalaman yang memanjakan lidah Anda. Dalam setiap tegukan, Anda akan merasakan sentuhan espresso yang kuat dan aroma kopi yang menggugah selera, dilengkapi dengan kelembutan dan kelezatan susu. Cappuccino adalah teman sempurna untuk menikmati momen istirahat Anda dengan kenikmatan kopi yang tak tertandingi."),
            new MenuCafe("Expresso", 11000,R.drawable.expresso,3,"Espresso adalah minuman kopi pendek yang dibuat dengan menyeduh biji kopi yang telah digiling sangat halus dan dikompres dengan tekanan tinggi. Hasilnya adalah cairan kopi kecil yang memiliki rasa yang sangat konsentrat dan intens. Espresso biasanya disajikan dalam cangkir kecil dan memiliki lapisan krima berwarna cokelat di atasnya."),
            new MenuCafe("Lemon Tea", 9000,R.drawable.lemon_tea,5,"Lemon tea adalah minuman segar yang terbuat dari campuran teh dengan perasan lemon. Ini adalah kombinasi yang menyegarkan antara teh hangat dan kesegaran citrus dari lemon. Ketika teh yang sudah diseduh perlahan disatukan dengan aroma dan rasa asam lemon yang khas, hasilnya adalah minuman yang seimbang dan menghidrasi yang cocok untuk menikmati kapan saja, terutama saat cuaca panas. Lemon tea dapat diminum dengan es untuk sensasi yang lebih menyegarkan atau panas saat cuaca dingin. Rasanya yang menyegarkan dan aroma lemon yang menggoda menjadikannya pilihan yang populer bagi banyak orang untuk menikmati saat bersantai atau beraktivitas sehari-hari."),
            new MenuCafe("Tea", 5000,R.drawable.tea,3,"Teh adalah minuman yang diseduh dari daun-daunan tanaman teh (Camellia sinensis) yang telah dikeringkan. Proses pembuatan teh dimulai dengan mengumpulkan daun-daunan segar yang kemudian diolah, baik melalui pengeringan atau fermentasi, tergantung jenis teh yang diinginkan. Ada beberapa jenis teh yang populer, seperti teh hitam, teh hijau, teh putih, dan teh oolong. Setiap jenis teh memiliki karakteristik unik yang mencakup rasa, aroma, dan kandungan nutrisi yang berbeda."),
            new MenuCafe("Chocolate Milk", 14000,R.drawable.chocolate,4,"Minuman coklat susu adalah perpaduan sempurna antara kelembutan susu yang hangat dan cita rasa cokelat yang menggoda. Ini adalah minuman yang menyenangkan dan cocok untuk semua usia.\n" +
                    "Dalam setiap gelas, Anda akan menemukan kebaikan susu yang meluluhkan hati, memberikan rasa lembut dan kenyamanan. Cokelat yang dicampur dengan sempurna memberikan sentuhan manis dan gurih yang Anda inginkan, tanpa terlalu berlebihan."),
            new MenuCafe("Milkshake", 21000,R.drawable.milkshake,5,"Milkshake adalah minuman lezat yang terbuat dari campuran es krim yang lembut dan susu segar. Ini adalah minuman yang sempurna untuk mereka yang menginginkan kombinasi manis dan segar dalam setiap tegukan. Ketika Anda memesan milkshake, Anda akan menikmati rasa krimi, manis, dan sejuk yang menyegarkan tenggorokan Anda."),
            new MenuCafe("Matcha Latte",15000,R.drawable.matcha_latte,4,"Matcha Latte, minuman yang memesona dan menggugah selera. Ini adalah kombinasi harmonis antara matcha, bubuk teh hijau Jepang yang kaya akan antioksidan, dengan susu yang lembut dan krim. Ketika matcha yang segar dan beraroma campur dengan susu yang hangat, terciptalah minuman yang menghadirkan kesegaran alami dan rasa yang lembut. Matcha Latte adalah teman sempurna untuk dimiliki setiap hari. Ini tidak hanya menghidrasi, tetapi juga memberikan dorongan energi sehat yang akan memulai pagi Anda dengan semangat. Nikmati sentuhan Jepang dalam setiap tegukan, dengan warna hijau yang menenangkan dan cita rasa yang memukau. Jadikan Matcha Latte pilihan Anda untuk memulai hari dengan baik."),
            new MenuCafe("Latte",15000,R.drawable.latte,4,"Latte adalah minuman kopi yang penuh dengan kesederhanaan yang menenangkan dan cita rasa yang memanjakan. Bayangkan cangkir hangat berisi espresso yang lembut, dihiasi dengan susu yang kaya dan berbusa. Ini adalah harmoni antara kekuatan dan kelembutan dalam sebuah minuman."),
            new MenuCafe("Mochachino",15000,R.drawable.mochachino,5,"Mochaccino adalah minuman kopi yang lezat dan menggugah selera. Ini adalah perpaduan sempurna antara espresso yang kuat, cokelat lembut, dan susu creamy. Ketika Anda memesan Mochaccino, Anda akan merasakan sensasi kopi yang kaya dan cokelat yang manis bercampur dalam satu gelas.")
    );

}


