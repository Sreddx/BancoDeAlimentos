package tec.mx.bancodecomida.Feed.repository
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.callbackFlow
import tec.mx.bancodecomida.R
import tec.mx.bancodecomida.Feed.model.New

/*class NewRepository {
    fun getAllData(): List <New>{
        return listOf(*/

class NewRepository{
    private val firestore  = FirebaseFirestore.getInstance()

    fun getNewDetails() = callbackFlow {
        val collection = firestore.collection("New")
        val snapshotListener = collection.addSnapshotListener{ value, error ->
            offer(value)
        }
        awaitClose{
            snapshotListener.remove()
        }
    }
}

object NewsList {
    val new = listOf(
            New(
                id = 0,
                title = "Nueva Comunidad",
                author = "Erick Calderón",
                description = "Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico",
                imageId = R.drawable.presentation_background,
                year = 2021
            ),
            New(
                id = 1,
                title = "Nueva Comunidad 2",
                author = "Rafita Marquez",
                description = "Pepa",
                imageId = R.drawable.presentation_background,
                year = 2021
            ),
            New(
                id = 2,
                title = "Nueva Comunidad",
                author = "Erick Calderón",
                description = "said1",
                imageId = R.drawable.comida,
                year = 2021
            ),
            New(
                id = 3,
                title = "Nueva Comunidad",
                author = "Erick Calderón",
                description = "powqikdpoqwjdpnqmwdponqmd",
                imageId = R.drawable.bancomx_logo_color,
                year = 2021
            ),
            New(
                id = 4,
                title = "Nueva Comunidad",
                author = "Erick Calderón",
                description = "Nueva comunidad se suma al Banco de Alimentos de Mexico",
                imageId = R.drawable.bancomx_logo_color,
                year = 2021
            ),
            New(
                id = 5,
                title = "Nueva Comunidad",
                author = "Erick Calderón",
                description = "Nueva comunidad se suma al Banco de Alimentos de Mexico",
                imageId = R.drawable.bancomx_logo_color,
                year = 2021
            ),
            New(
                id = 6,
                title = "Nueva Comunidad",
                author = "Erick Calderón",
                description = "Nueva comunidad se suma al Banco de Alimentos de Mexico",
                imageId = R.drawable.bancomx_logo_color,
                year = 2021
            ),
            New(
                id = 7,
                title = "Nueva Comunidad",
                author = "Erick Calderón",
                description = "Nueva comunidad se suma al Banco de Alimentos de Mexico",
                imageId = R.drawable.bancomx_logo_color,
                year = 2021
            ),
            New(
                id = 8,
                title = "Nueva Comunidad",
                author = "Erick Calderón",
                description = "Nueva comunidad se suma al Banco de Alimentos de Mexico",
                imageId = R.drawable.bancomx_logo_color,
                year = 2021
            ),
            New(
                id = 9,
                title = "Nueva Comunidad",
                author = "Erick Calderón",
                description = "Nueva comunidad se suma al Banco de Alimentos de Mexico",
                imageId = R.drawable.bancomx_logo_color,
                year = 2021
            ),
        )
    }

object NewsList2 {
    val new = listOf(
        New(
            id = 0,
            title = "Nueva Comunidad",
            author = "Erick Calderón",
            description = "Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico Nueva comunidad se suma al Banco de Alimentos de Mexico",
            imageId = R.drawable.presentation_background,
            year = 2021
        ),
        New(
            id = 1,
            title = "Nueva Comunidad 2",
            author = "Rafita Marquez",
            description = "Pepa",
            imageId = R.drawable.presentation_background,
            year = 2021
        ),
        New(
            id = 2,
            title = "Nueva Comunidad",
            author = "Erick Calderón",
            description = "said1",
            imageId = R.drawable.presentation_background,
            year = 2021
        ),
        New(
            id = 3,
            title = "Nueva Comunidad",
            author = "Erick Calderón",
            description = "powqikdpoqwjdpnqmwdponqmdpowqikdpoqwjdpnqmwdponqmdpowqikdpoqwjdpnqmwdponqmdpowqikdpoqwjdpnqmwdponqmdpowqikdpoqwjdpnqmwdponqmdpowqikdpoqwjdpnqmwdponqmdpowqikdpoqwjdpnqmwdponqmdpowqikdpoqwjdpnqmwdponqmdpowqikdpoqwjdpnqmwdponqmdpowqikdpoqwjdpnqmwdponqmdpowqikdpoqwjdpnqmwdponqmdpowqikdpoqwjdpnqmwdponqmd",
            imageId = R.drawable.maxresdefault,
            year = 2021
        )
    )
}
