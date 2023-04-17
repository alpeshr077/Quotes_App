package com.alpesh1.quotes_app;

import static com.alpesh1.quotes_app.R.drawable.back1;
import static com.alpesh1.quotes_app.R.drawable.back10;
import static com.alpesh1.quotes_app.R.drawable.back2;
import static com.alpesh1.quotes_app.R.drawable.back3;
import static com.alpesh1.quotes_app.R.drawable.back4;
import static com.alpesh1.quotes_app.R.drawable.back5;
import static com.alpesh1.quotes_app.R.drawable.back6;
import static com.alpesh1.quotes_app.R.drawable.back7;
import static com.alpesh1.quotes_app.R.drawable.back8;
import static com.alpesh1.quotes_app.R.drawable.back9;


import android.graphics.ColorSpace;
import android.os.Bundle;
import android.provider.ContactsContract;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.alpesh1.quotes_app.Adapter.DataAdapter;
import com.bumptech.glide.load.model.Model;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String PhotoImage[] = {"आपके विचार आपके जीवन का निर्माण करते हैं. यहाँ संग्रह किये गए महान विचारकों के हज़ारों प्रेरक कथन आपके जीवन में एक सकारात्मक बदलाव ला सकते हैं |",
                            "समय और जरुरत बलदते ही सब के चेहरे बेनकाब हो जाते है पता नहीं या तो हम में कुछ कमी आ जाती है या वो Acting अच्छी करने लगते है |",
                            "खुदा ने बहुत सी अच्छी चीज बनाई है उस में एक हमारा दिमाग भी है बस उसे Use करने के लिए बता देता तो हम भी करोड़पति बन जाते |",
                            "िंदगी और Swimming में एक चीज Common है तैर गए तो पार नहीं तो बीच मझदार |",
                            "किसान की भी क्या दुविधा छत टपकी है उसकी फिर भी बारिश की दुआ करता है |",
                            "दर्द तब होती है, जब खुद को ठोकर लगती वरना दूसरों के तो सिर्फ लहू ही नजर आते दर्द नहीं |",
                            "बातें में भी आम ही करता हूँ बस समझने वाले इसे खास बना देते है |",
                            "कोई आपको छोड़ के चला गया तो क्या हुआ I अब जो वो मिले उसकी दुनियां ठहर जानी चाहिए |",
                            "कभी कभी हम अनजाने में वक्त पर पावं रख देते है इसीलिए ज़िंदगी मुहं के बल गिर जाती है |",
                            "लोग कहते है ज़िंदगी मिली है अपने हिसाब से जीने के लिए, लेकिन वही लोग सुबह होते ही किसी और के हिसाब से जीने चले जाते है |"};

    int FitnessImage[] = {back1,back3,back4,back5,back6,back2,back7,back8,back9,back10};
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        DataAdapter adapter = new DataAdapter(PhotoImage,FitnessImage);
        recycler.setLayoutManager(manager);
        recycler.setAdapter(adapter);


    }
}