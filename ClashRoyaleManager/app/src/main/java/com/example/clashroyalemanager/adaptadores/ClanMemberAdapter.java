package com.example.clashroyalemanager.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.clashroyalemanager.R;
import com.example.clashroyalemanager.clases.Item;

import java.util.List;

public class ClanMemberAdapter extends RecyclerView.Adapter<ClanMemberAdapter.ClanMemberHolder>{

    /*Arraylist donde almaceno los datos que se van a mostrar en el RecylerView*/
    private List<Item> datos;

    private final OnItemClickListener listener;

    public void setDatos(List<Item> datos) {
        this.datos = datos;
    }

    /* Defino un interface con el OnItemClickListener*/
    public interface OnItemClickListener {
        void onItemClick(Item item);
    }

    /* Incluyo el Viewholder en el Adapter */
    public static class ClanMemberHolder
            extends RecyclerView.ViewHolder {
        /* Como atributos se incluyen los elementos que van a referenciar a los elementos de la vista*/
        private TextView tvPositionClan;
        private TextView tvMemberName;
        private TextView tvMemberRole;

        /*constructor con parámetro de la vista*/
        public ClanMemberHolder(View itemView) {
            super(itemView);
            // Asocia los atributos a los widgets del layout de la vista
            tvPositionClan = itemView.findViewById(R.id.tvPositionClan);
            tvMemberName = itemView.findViewById(R.id.tvMemberName);
            tvMemberRole = itemView.findViewById(R.id.tvMemberRole);
        }

        /*Muestra los datos de jugador en el item*/
        public void bindMembers (Item j, int pos, final OnItemClickListener listener) {
            pos = pos + 1;
            String position = Integer.toString(pos) + "º";

            tvPositionClan.setText(position);
            tvMemberName.setText(j.getName());
            tvMemberRole.setText(j.getRole());

            /* Coloco el listener a la vista*/
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(j);
                }
            });
            }
        }


    /* Constructor con parámetros*/
    public ClanMemberAdapter(List<Item> datos, OnItemClickListener listener) {
        this.datos = datos;
        this.listener = listener;
    }

    @Override
    public ClanMemberHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.clan_members_item, viewGroup, false);
        ClanMemberHolder clanMemberVH = new ClanMemberHolder(itemView);
        return clanMemberVH;
    }

    @Override
    public void onBindViewHolder(ClanMemberHolder viewHolder, int pos) {
        Item j = datos.get(pos);
        viewHolder.bindMembers(j, pos, listener);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
}
