package com.example.soundboard1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button btnBeastRoar;

    Button btnArrowWhoosh;

    Button btnTunnelReverb;

    Button btnWhooshTransition;

    Button btnClassicAlarm;

    Button btnCrowdLaugh;

    Button btnDogBarking;

    Button btnRocketWhoosh;

    Button btnSmallSweep;

    Button btnAstonishedGasp;

    Button btnArcadeRetro;

    Button btnHeartBeat;


    //Button
    btnBeastRoar = findViewById(R.id.btn_beastroar);

    btnArrowWhoosh = findViewById(R.id.btn_arrowhoosh);

    btnTunnelReverb = findViewById(R.id.btn_tunnelreverb);

    btnWhooshTransition = findViewById(R.id.btn_whooshtransition);

    btnClassicAlarm = findViewById(R.id.btn_classicalarm);

    btnCrowdLaugh = findViewById(R.id.btn_crowdlaugh);

    btnDogBarking = findViewById(R.id.btn_dogbarking);

    btnRocketWhoosh = findViewById(R.id.btn_rocketwhoosh);

    btnSmallSweep = findViewById(R.id.btn_smallsweep);

    btnAstonishedGasp = findViewById(R.id.btn_astonishedgasp);

    btnArcadeRetro = findViewById(R.id.btn_arcaderetro);

    btnHeartBeat = findViewById(R.id.btn_heartbeat);




    }
}