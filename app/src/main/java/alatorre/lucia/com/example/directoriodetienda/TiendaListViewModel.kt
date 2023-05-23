package alatorre.lucia.com.example.directoriodetienda

//import android.os.Bundle
//import android.util.Log
//import androidx.fragment.app.Fragment
//import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import java.util.*


class TiendaListViewModel : ViewModel() {
    val tiendas = mutableListOf<Tienda>()
    init {
        for (i in 0 until 100) {
            val tienda= Tienda(
                id = UUID.randomUUID(),
                title ="Tienda #$i",
                telefono = "${i}",

            )
            tiendas += tienda
        }
    }
}
