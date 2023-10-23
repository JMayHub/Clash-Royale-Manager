package com.example.clashroyalemanager.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.clashroyalemanager.R;
import com.example.clashroyalemanager.adaptadores.ClanMemberAdapter;
import com.example.clashroyalemanager.api.RoyaleAPI;
import com.example.clashroyalemanager.clases.ClanMembers;
import com.example.clashroyalemanager.clases.Item;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EditText etClanTag;
    private Button bBuscar;
    private RecyclerView rvPlayerList;
    public List<Item> members;

    public void loadClanMembers(){
        etClanTag = findViewById(R.id.etClanTag);
        bBuscar = findViewById(R.id.bBuscar);
        rvPlayerList = findViewById(R.id.rvPlayerList);

        bBuscar.setOnClickListener(bBuscarListener);

        //Inicializa la lista de miembros del clan a 0.
        members = new ArrayList<>();

        //Crea el adaptador, pasándole como parámetro los datos
        final ClanMemberAdapter adaptador = new ClanMemberAdapter(members, new ClanMemberAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item j) {
                Intent intent = new Intent(MainActivity.this, ClanMemberActivity.class);

                intent.putExtra("id", j.getTag());
                startActivity(intent);
            }
        });

        //Asocia a recylerView el adaptador
        rvPlayerList.setAdapter(adaptador);

        //Fija un layout linear al recyclerview
        rvPlayerList.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        //Pone una división entre items
        rvPlayerList.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        // Pone la animación por defecto
        rvPlayerList.setItemAnimator(new DefaultItemAnimator());

        //TODO: (7) Creo una instancia de la clase Retrofit, a la que le indico la URL de la API
        //y el conversor que vamos a usar
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RoyaleAPI.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //TODO: (8) Crea un objeto del servicio RoyaleAPI
        RoyaleAPI royaleAPI = retrofit.create(RoyaleAPI.class);

        //TODO: (9) Crea que un objeto de llamada a la función
        Call<ClanMembers> callMembers = royaleAPI.getClanMembers(etClanTag.getText().toString());
        //etClanTag.setText(callMembers.request().toString());
        //TODO: (10) Ese objeto se encola, para que se ejecute de forma asíncrona
        callMembers.enqueue(new Callback<ClanMembers>() {
            @Override
            public void onResponse(Call<ClanMembers> call, Response<ClanMembers> response) {
                switch(response.code()) {
                    case 200:
                        //TODO: (11) En caso de que haya éxito en la respuesta, extraigo el campo result, mediante getItems
                        ClanMembers resultado = response.body();
                        members = resultado.getItems();
                        //TODO: (12) Cambio los datos del adaptador, que hasta ahora eran vacíos, y notifico que han cambiado
                        //para que vuelva a renderizar el RecyclerView
                        adaptador.setDatos(members);
                        adaptador.notifyDataSetChanged();
                        break;
                    case 401:
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onFailure(Call<ClanMembers> call, Throwable t) {
            }
        });
    }

    // Create an anonymous implementation of OnClickListener
    private View.OnClickListener bBuscarListener = new View.OnClickListener() {
        public void onClick(View v) {
            loadClanMembers();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadClanMembers();
    }
}