package com.example.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvTacGia;
    ArrayList<TacGiaActivity> arrayTacGia;
    TacGiaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter = new TacGiaAdapter(this, R.layout.activity_tac_gia, arrayTacGia);
        lvTacGia.setAdapter(adapter);

        lvTacGia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showlistviewTacPham(i);
            }
        });
    }

    private void  AnhXa() {
        lvTacGia = (ListView) findViewById(R.id.ListviewTacGia);
        arrayTacGia = new ArrayList<>();

        arrayTacGia.add(new TacGiaActivity("Xuân Diệu", "sinh ngày 2 – 2 – 1916. Quê ở Bình Định. " +
                "Ông là một nhà thơ nổi lên từ phong trào Thơ Mới, " +
                "và được mệnh danh là “Nhà thơ mới nhất trong những nhà thơ Mới”" , R.drawable.nhatho_xuandieu, "5"));
        arrayTacGia.add(new TacGiaActivity("Hàn Mặc Tử", "sinh ngày 22 – 9 – 1912. Quê ở Quảng Bình. " +
                "Ông có một cuộc đời đau khổ, lắm truân chuyên và phải chịu đựng căn bệnh nan y. " +
                "Dù là vậy, với tài năng của mình, ông vẫn trở thành một nhà thơ nổi tiếng, mang hồn thơ uất, nhưng không kém lãng mạn. " +
                "Ông đã đóng góp rất nhiều bài thơ hay cho phong trào Thơ Mới." , R.drawable.nhatho_hanmactu, "5"));
        arrayTacGia.add(new TacGiaActivity("Thế Lữ", "sinh ngày 6 – 10 – 1907. Quê ở Hà Nội. " +
                "Ông hoạt động sáng tác sôi nổi nhất vào những năm 30 của thế kỉ XX, là thành viên của Tự lực văn đoàn. " +
                "Hồn thơ của ông được Hoài Thanh ví như “chốn bồng lai”. Trong tất cả những tác phẩm, Nhớ rừng là bài thơ nổi tiếng nhất, " +
                "đã được đưa vào giảng dạy và học tập trong nhà trường." , R.drawable.nhatho_thelu, "5"));
        arrayTacGia.add(new TacGiaActivity("Nguyễn Bính", "sinh năm 1918. Quê ở Nam Định. " +
                "Ông là một nhà thơ theo trường phái lãng mạn nổi tiếng Việt Nam. Tuy nhiên, nếu như Xuân Diệu hướng đến tình yêu hiện đại, " +
                "“Tây hóa”, thì thơ Nguyễn Bính lại quay về với tình yêu giản dị, mộc mạc, chân chất ở thôn quê. " +
                "Vì vậy, ông được coi là nhà thơ của làng quê." , R.drawable.nhatho_nguyenbinh, "5"));
        arrayTacGia.add(new TacGiaActivity("Chế Lan Viên", "sinh ngày 20 – 10 – 1920. Quê ở Quảng Trị. " +
                "Thơ ông đi theo Trường Thơ Loạn, trường phái thơ của Hàn Mặc Tử. Thơ của Chế Lan Viên đậm chất trữ tình triết luận, " +
                "với những triết lý, những siêu hình, bí ẩn. Còn từ khi tham gia Việt Minh, hoạt động Cách mạng, " +
                "ông chuyển sang làm thơ về kháng chiến. Các tác phẩm tiêu biểu: Điêu tàn, Ánh sáng và phù sa, Hoa ngày thường – Chim báo bão,…" , R.drawable.nhatho_xuandieu, "5"));
    }

    private void showlistviewTacPham(int i){

        Intent intent = new Intent(this, ListviewTacPham.class);
        startActivity(intent);
    }
}