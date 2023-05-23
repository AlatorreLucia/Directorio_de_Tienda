package alatorre.lucia.com.example.directoriodetienda

import alatorre.lucia.com.example.directoriodetienda.databinding.FragmentTiendaBinding
import alatorre.lucia.com.example.directoriodetienda.databinding.FragmentTiendaListBinding
import android.content.ContentValues.TAG
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings.LayoutAlgorithm
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.viewModels
import java.util.zip.Inflater

private const val TAG = "TiendaListFragment"

class TiendaListFragment: Fragment() {

        private val TiendaListViewModel: TiendaListViewModel by viewModels()
        private var  _binding: FragmentTiendaBinding? = null
       private val binding
       get() =  checkNotNull(_binding) {
           "No se puede acceder al binding"
       }


    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            Log.d(TAG, "Existen:"+TiendaListViewModel.tiendas.size+"tiendas")
        }
    }

    override fun onCreateView(
        inflanter: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        _binding = FragmentTiendaListBinding.inflate(Inflater, container, false)
        val tiendas = tiendaListModel.tiendas
        val adapter = TiendaListAdapter(tiendas)

        binding.tiendaRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.tiendaRecyclerView.adapter = adapter
        return binding.root
    }

override fun onDestroy() {
    super.onDestroy()
    _binding = null
}
}
