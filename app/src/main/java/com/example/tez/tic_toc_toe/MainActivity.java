package com.example.tez.tic_toc_toe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private Switch btnReset;
    private int turn=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnReset=(Switch)findViewById(R.id.reset);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
        b6=(Button)findViewById(R.id.btn6);
        b7=(Button)findViewById(R.id.btn7);
        b8=(Button)findViewById(R.id.btn8);
        b9=(Button)findViewById(R.id.btn9);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        btnReset.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");

                b1.setTextColor(Color.parseColor("#000000"));
                b2.setTextColor(Color.parseColor("#000000"));
                b3.setTextColor(Color.parseColor("#000000"));
                b4.setTextColor(Color.parseColor("#000000"));
                b5.setTextColor(Color.parseColor("#000000"));
                b6.setTextColor(Color.parseColor("#000000"));
                b7.setTextColor(Color.parseColor("#000000"));
                b8.setTextColor(Color.parseColor("#000000"));
                b9.setTextColor(Color.parseColor("#000000"));

                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(true);
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(true);
                b7.setEnabled(true);
                b8.setEnabled(true);
                b9.setEnabled(true);
            }
        });
    }


    @Override
    public void onClick(View v) {

        if(v==b1) {
            if (b1.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b1.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b1.setText("0");
                }
            }
            winner();
        }
       else if(v==b2) {
            if (b2.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b2.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b2.setText("0");
                }
            }
            winner();
        }
       else if(v==b3) {
            if (b3.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b3.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b3.setText("0");
                }
            }
            winner();
        }
       else if(v==b4) {
            if (b4.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b4.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b4.setText("0");
                }
            }
            winner();
        }
       else if(v==b5) {
            if (b5.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b5.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b5.setText("0");
                }
            }
            winner();
        }
        else if(v==b6) {
            if (b6.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b6.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b6.setText("0");
                }
            }
            winner();
        }
       else if(v==b7) {
            if (b7.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b7.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b7.setText("0");
                }
            }
            winner();
        }
        else if(v==b8) {
            if (b8.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b8.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b8.setText("0");
                }
            }
            winner();
        }
       else if(v==b9) {
            if (b9.getText().toString().equals("")) {
                if (turn == 1) {
                    turn = 2;
                    b9.setText("X");
                } else if (turn == 2) {
                    turn = 1;
                    b9.setText("0");
                }
            }
            winner();
        }

    }
    public void winner()
    {
        String a,b,c,d,e,f,g,h,i;
        boolean end=false;
        a=b1.getText().toString().trim();
        b=b2.getText().toString().trim();
        c=b3.getText().toString().trim();
        d=b4.getText().toString().trim();
        e=b5.getText().toString().trim();
        f=b6.getText().toString().trim();
        g=b7.getText().toString().trim();
        h=b8.getText().toString().trim();
        i=b9.getText().toString().trim();

        if((a.equals("X"))&&(b.equals("X"))&&(c.equals("X"))) {
            b1.setTextColor(Color.parseColor("#a02852"));
            b2.setTextColor(Color.parseColor("#a02852"));
            b3.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }
        if((d.equals("X"))&&(e.equals("X"))&&(f.equals("X"))) {
            b4.setTextColor(Color.parseColor("#a02852"));
            b5.setTextColor(Color.parseColor("#a02852"));
            b6.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }
        if((g.equals("X"))&&(h.equals("X"))&&(i.equals("X"))) {
            b7.setTextColor(Color.parseColor("#a02852"));
            b8.setTextColor(Color.parseColor("#a02852"));
            b9.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }

        if((a.equals("0"))&&(b.equals("0"))&&(c.equals("0"))) {
            b1.setTextColor(Color.parseColor("#a02852"));
            b2.setTextColor(Color.parseColor("#a02852"));
            b3.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }
        if((d.equals("0"))&&(e.equals("0"))&&(f.equals("0"))) {
            b4.setTextColor(Color.parseColor("#a02852"));
            b5.setTextColor(Color.parseColor("#a02852"));
            b6.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }
        if((g.equals("0"))&&(h.equals("0"))&&(i.equals("0"))) {
            b7.setTextColor(Color.parseColor("#a02852"));
            b8.setTextColor(Color.parseColor("#a02852"));
            b9.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }

        if((a.equals("X"))&&(e.equals("X"))&&(i.equals("X"))) {
            b1.setTextColor(Color.parseColor("#a02852"));
            b5.setTextColor(Color.parseColor("#a02852"));
            b9.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }
        if((a.equals("0"))&&(e.equals("0"))&&(i.equals("0"))) {
            b1.setTextColor(Color.parseColor("#a02852"));
            b5.setTextColor(Color.parseColor("#a02852"));
            b9.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }

        if((a.equals("X"))&&(d.equals("X"))&&(g.equals("X"))) {
            b1.setTextColor(Color.parseColor("#a02852"));
            b4.setTextColor(Color.parseColor("#a02852"));
            b7.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }
        if((a.equals("0"))&&(d.equals("0"))&&(g.equals("0"))) {
            b1.setTextColor(Color.parseColor("#a02852"));
            b4.setTextColor(Color.parseColor("#a02852"));
            b7.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }

        if((b.equals("X"))&&(e.equals("X"))&&(h.equals("X"))) {
            b2.setTextColor(Color.parseColor("#a02852"));
            b5.setTextColor(Color.parseColor("#a02852"));
            b8.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }
        if((b.equals("0"))&&(e.equals("0"))&&(h.equals("0"))) {
            b2.setTextColor(Color.parseColor("#a02852"));
            b5.setTextColor(Color.parseColor("#a02852"));
            b8.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }

        if((c.equals("X"))&&(e.equals("X"))&&(g.equals("X"))) {
            b3.setTextColor(Color.parseColor("#a02852"));
            b5.setTextColor(Color.parseColor("#a02852"));
            b7.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }
        if((c.equals("0"))&&(e.equals("0"))&&(g.equals("0"))) {
            b3.setTextColor(Color.parseColor("#a02852"));
            b5.setTextColor(Color.parseColor("#a02852"));
            b7.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }

        if((c.equals("X"))&&(f.equals("X"))&&(i.equals("X"))) {
            b3.setTextColor(Color.parseColor("#a02852"));
            b6.setTextColor(Color.parseColor("#a02852"));
            b9.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }
        if((c.equals("0"))&&(f.equals("0"))&&(i.equals("0"))) {
            b3.setTextColor(Color.parseColor("#a02852"));
            b6.setTextColor(Color.parseColor("#a02852"));
            b9.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }

        if((g.equals("X"))&&(h.equals("X"))&&(i.equals("X"))) {
            b7.setTextColor(Color.parseColor("#a02852"));
            b8.setTextColor(Color.parseColor("#a02852"));
            b9.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }
        if((g.equals("0"))&&(h.equals("0"))&&(i.equals("0"))) {
            b7.setTextColor(Color.parseColor("#a02852"));
            b8.setTextColor(Color.parseColor("#a02852"));
            b9.setTextColor(Color.parseColor("#a02852"));
            Toast.makeText(this, "Congrats...You are winner", Toast.LENGTH_SHORT).show();
            end=true;
        }

        if(end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }

    }
}
