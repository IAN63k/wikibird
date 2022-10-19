package com.uniajc.wiki_bird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity{

    private int[] imgArr = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10, R.drawable.img11};    private int count=0;
    private int[] player = {R.raw.player1, R.raw.player2, R.raw.player3, R.raw.player4, R.raw.player5, R.raw.player6, R.raw.player7, R.raw.player8, R.raw.player9, R.raw.player10, R.raw.player11};
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_card);

    }

    public void newBird (View view){
        MainActivity mnt = new MainActivity();
        mnt.agregarAves();
            Ave ave = (Ave) mnt.getAve().get(getCount());
            TextView name = (TextView) findViewById(R.id.name);
            TextView fami = (TextView) findViewById(R.id.family);
            TextView descrp = (TextView) findViewById(R.id.descp);
            TextView origin = (TextView) findViewById(R.id.origen);
            ImageView img = (ImageView) findViewById(R.id.img);
            name.setText(ave.getNombre());
            fami.setText(ave.getFamilia());
            descrp.setText(ave.getDescrip());
            origin.setText(ave.getOrigen());
            img.setImageResource(imgArr[getCount()]);
            ImageView btnSonido = (ImageView) findViewById(R.id.btn);
            mp = MediaPlayer.create(this,player[getCount()]);
            btnSonido.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                }
            });
//        Intent intent  = new Intent(this, ExplorerActivity.class);
//        try {startActivity(intent);} catch (Exception e){
//            System.out.println("Error -> "+e);
//        }
        setCount(count+1);
        if (count == 11){ setCount(0);};
    }

    public void onClick (View view){
        Intent intent  = new Intent(this, ExplorerActivity.class);
        try {startActivity(intent);} catch (Exception e){
            System.out.println("Error -> "+e);
        }
    }

    /**
     * @return the arrC
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the Count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

}
