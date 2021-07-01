package com.example.photographyguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class menu extends AppCompatActivity {

    GridLayout menu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menu = (GridLayout) findViewById(R.id.menu);

        setSingleEvent(menu);

    }

    private void setSingleEvent(GridLayout menu) {

        for(int i=0;i<menu.getChildCount();i++)
        {

            CardView cardView = (CardView)menu.getChildAt(i);
            final  int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI == 0)
                    {
                        Intent intent = new Intent(com.example.photographyguide.menu.this, introduction.class);
                        startActivity(intent);
                    }

                    else if (finalI == 1)
                    {
                        Intent intent = new Intent(com.example.photographyguide.menu.this, tips.class);
                        startActivity(intent);
                    }
                    else if (finalI == 2)
                    {
                        Intent intent = new Intent(com.example.photographyguide.menu.this, concept.class);
                        startActivity(intent);
                    }
                    else if (finalI == 3)
                    {
                        Intent intent = new Intent(com.example.photographyguide.menu.this, gallery.class);
                        startActivity(intent);
                    }
                    else if (finalI == 4)
                    {
                        Intent intent = new Intent(com.example.photographyguide.menu.this, edit.class);
                        startActivity(intent);
                    }
                    else if (finalI == 5)
                    {
                        Intent intent = new Intent(com.example.photographyguide.menu.this, conclusion.class);
                        startActivity(intent);
                    }

                }
            });
        }



    }
}