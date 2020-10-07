package com.example.insertarregistros;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.Toast;
import java.util.List;

import static android.media.CamcorderProfile.get;

public class AdaptadorUsuarios extends RecyclerView.Adapter<AdaptadorUsuarios.UsuariosViewHolder> {


    private Context mCtx;
    private List<Modelo_Usuario> UsuariosList;

    public AdaptadorUsuarios(Context mCtx, List<Modelo_Usuario> usuariosList) {
        this.mCtx = mCtx;
        this.UsuariosList = usuariosList;
    }

    @NonNull
    @Override
    public UsuariosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate = LayoutInflater.from(mCtx);
        View view = inflate.inflate(R.layout.list_usuario, null);
        return new UsuariosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorUsuarios.UsuariosViewHolder holder, int position) {
            Modelo_Usuario dto = UsuariosList.get(position);

            holder.textViewNombre1.setText(dto.getNombre_usuario());
            holder.textViewApellido1.setText(dto.getApellido_usuario());
            holder.textViewCorreo1.setText(dto.getCorreo_usuario());
            holder.textViewUsuario1.setText(dto.getClave_usuario());
            holder.textViewClave1.setText(dto.getClave_usuario());
            holder.textViewTipo1.setText(dto.getTipo_usuario());
            holder.textViewEstado1.setText(String.valueOf(dto.getEstado_usuario()));
            holder.textViewPregunta1.setText(dto.getPregunta_usuario());
            holder.textViewRespuesta1.setText(dto.getRespuesta_usuario());

    }

    @Override
    public int getItemCount() {
        return UsuariosList.size();
    }

    public static class UsuariosViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNombre1, textViewApellido1, textViewCorreo1, textViewUsuario1
                ,textViewClave1,textViewTipo1,textViewPregunta1,textViewRespuesta1,textViewEstado1,textViewOtro;

        public UsuariosViewHolder(View itemView) {
            super(itemView);
            textViewNombre1 = itemView.findViewById(R.id.textViewNombre1);
            textViewApellido1 = itemView.findViewById(R.id.textViewApellido1);
            textViewCorreo1 = itemView.findViewById(R.id.textViewCorreo1);
            textViewUsuario1 = itemView.findViewById(R.id.textViewUsuario1);
            textViewClave1 = itemView.findViewById(R.id.textViewClave1);
            textViewTipo1 = itemView.findViewById(R.id.textViewTipo1);
            textViewEstado1 = itemView.findViewById(R.id.textViewEstado1);
            textViewPregunta1 = itemView.findViewById(R.id.textViewPregunta1);
            textViewRespuesta1 = itemView.findViewById(R.id.textViewRespuesta1);
        }
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
