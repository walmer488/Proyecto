package com.example.insertarregistros;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorCategorias extends RecyclerView.Adapter<AdaptadorCategorias.CategoriasViewHolder> {

    private Context mCtx;
    private List<Modelo_Categorias> CategoriasList;

    public AdaptadorCategorias(Context mCtx, List<Modelo_Categorias> categoriasList) {
        this.mCtx = mCtx;
        this.CategoriasList = categoriasList;
    }
    @NonNull
    @Override
    public CategoriasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate = LayoutInflater.from(mCtx);
        View view = inflate.inflate(R.layout.list_categoria, null);
        return new CategoriasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorCategorias.CategoriasViewHolder holder, int position) {
        Modelo_Categorias dto = CategoriasList.get(position);

        holder.textViewNombreCategoria1.setText(dto.getNombre_categoria());
        holder.textViewEstado_Categoria1.setText(String.valueOf(dto.getEstado_categoria()));
    }

    @Override
    public int getItemCount() {
        return CategoriasList.size();
    }

    public static class CategoriasViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNombreCategoria1, textViewEstado_Categoria1;

        public CategoriasViewHolder(View itemView) {
            super(itemView);
            textViewNombreCategoria1 = itemView.findViewById(R.id.textViewNombreCategoria1);
            textViewEstado_Categoria1 = itemView.findViewById(R.id.textViewEstado_Categoria1);
        }
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
