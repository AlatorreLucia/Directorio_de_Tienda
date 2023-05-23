package alatorre.lucia.com.example.directoriodetienda


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.catalogodetiendas.databinding.ListItemTiendaBinding

class TiendaHolder(val binding:ListItemTiendaBinding) : RecyclerView.ViewHolder(binding.root)
class TiendaListAdapter(private val tiendas:List<Tienda>):RecyclerView.Adapter<TiendaHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TiendaHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemTiendaBinding.inflate(inflater,parent,false)

        return TiendaHolder(binding)
    }

    override fun onBindViewHolder(holder: TiendaHolder, position: Int) {
        val tienda = tiendas[position]
        holder.apply {
            binding.tvNombreTienda.text = tienda.title
        }
    }

    override fun getItemCount()=tiendas.size
}