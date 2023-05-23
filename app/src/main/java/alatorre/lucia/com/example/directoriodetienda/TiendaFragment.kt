package alatorre.lucia.com.example.directoriodetienda

import alatorre.lucia.com.example.directoriodetienda.databinding.FragmentTiendaBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class TiendaFragment : Fragment() {

    private lateinit var tienda: Tienda
    private var _binding:FragmentTiendaBinding?=null
    private val binding
    get() = checkNotNull(_binding) {
            "No puedo acceder al binding por que es nulo"
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tienda = Tienda(
            UUID.randomUUID(),
            title = "",
            telefono = "",

            )
    }
//TiendaListFragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =
            FragmentTiendaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
             tiendaTitle.doOnTextChanged { text, _, _, _ ->
                 tienda = tienda.copy(title = text.toString())
             }
            telefonoTienda.doOnTextChanged { text, _, _, _ ->
                tienda = tienda.copy(telefono = text.toString())
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}



