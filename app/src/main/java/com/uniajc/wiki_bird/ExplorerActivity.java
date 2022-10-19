package com.uniajc.wiki_bird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class ExplorerActivity extends AppCompatActivity {

    private int[] titleName = {R.id.name1, R.id.name2, R.id.name3, R.id.name4, R.id.name5, R.id.name6 , R.id.name7 , R.id.name8 , R.id.name9 , R.id.name10, R.id.name11};
    private int[] family = {R.id.family1, R.id.family2, R.id.family3, R.id.family4, R.id.family5, R.id.family6, R.id.family7, R.id.family8, R.id.family9, R.id.family10, R.id.family11};
    private int[] descp = {R.id.descrp1, R.id.descrp2, R.id.descrp3, R.id.descrp4, R.id.descrp5, R.id.descrp6, R.id.descrp7, R.id.descrp8, R.id.descrp9, R.id.descrp10, R.id.descrp11};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        referenceById();

    }


    public void referenceById (){
        MainActivity mnt = new MainActivity();
        mnt.agregarAves();
        for (int i = 0; i < mnt.getAve().size(); i++) {
            Ave ave = (Ave) mnt.getAve().get(i);
            TextView name = (TextView) findViewById(getTitleName()[i]);
            TextView fami = (TextView) findViewById(getFamily()[i]);
            TextView descrp = (TextView) findViewById(getDescp()[i]);
            name.setText(ave.getNombre());
            fami.setText(ave.getFamilia());
            descrp.setText(ave.getDescrip());
        }

    }


    public void onClick(View view) {
        MainActivity mnt = new MainActivity();
        mnt.agregarAves();
        InfoActivity info = new InfoActivity();
        Intent intent = new Intent(this, InfoActivity.class);
        try {
            startActivity(intent);
        } catch (Exception e) {
            System.out.println("Error -> " + e);
        }
    }

    /**
     * @return the title
     */
    public int[] getTitleName() {
        return titleName;
    }

    /**
     * @param titleName the title to set
     */
    public void setTitleName(int[] titleName) {
        this.titleName = titleName;
    }

    /**
     * @return the family
     */
    public int[] getFamily() {
        return family;
    }

    /**
     * @param family the family to set
     */
    public void setFamily(int[] family) {
        this.family = family;
    }

    /**
     * @return the descp
     */
    public int[] getDescp() {
        return descp;
    }

    /**
     * @param descp the descp to set
     */
    public void setDescp(int[] descp) {
        this.descp = descp;
    }


}
