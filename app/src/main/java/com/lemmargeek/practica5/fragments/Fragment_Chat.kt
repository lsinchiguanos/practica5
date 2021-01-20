package com.lemmargeek.practica5.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lemmargeek.practica5.R
import com.lemmargeek.practica5.models.Usuario

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment_Chat.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment_Chat : Fragment() {

    val usuarios: List<Usuario> = listOf(
        Usuario("Jose Delgado", "Where are you?", "https://www.eluniverso.com/sites/default/files/styles/powgallery_1024/public/fotos/2009/10/04/vye04hr041009%2Cphoto01_456_336.jpg?itok=6OLhfapF", "19:30"),
        Usuario("Presidente", "Good", "https://pbs.twimg.com/profile_images/1112915269243035648/T1CJxJPG_400x400.png", "19:30"),
        Usuario("Nine Kaviedes", "I'll give you a punch", "https://d22uy85tnpcynx.cloudfront.net/2020/06/Jaime-Iv%C3%A1n-Kaviedes.jpg", "19:30"),
        Usuario("Chucho", "always be humble boy!", "https://i1.wp.com/www.sopitas.com/wp-content/uploads/2018/07/5-mejores-momentos-christian-chucho-beitez-futbol.jpg", "19:30"),
        Usuario("Goat", "Come to play ball!", "https://www.hola.com/imagenes/actualidad/20200826174149/messi-se-quiere-ir-barcelona/0-858-838/messi1-t.jpg?filter=w600&filter=ds75", "19:30"),
        Usuario("Penaldo", "Come to play ball!", "https://s03.s3c.es/imag/_v0/770x420/f/a/6/cr-familia-juventus770.jpg", "19:30"),
        Usuario("Dinho", "Come to play ball!", "https://498930-1579140-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2016/09/Ronaldinho-Gaucho.jpg", "19:30"),
        Usuario("Erika Mamacita Velez", "Hi <3", "https://imagenes.extra.ec/files/image_full/files/fp/uploads/2020/07/27/5f1f1d20d5b1d.r_d.576-381-0.jpeg", "19:30"),
        Usuario("scarlett", "We're going to be parents <3", "https://m.guiadelocio.com/var/guiadelocio.com/storage/images/cine/personajes/scarlett-johansson/3775412-33-esl-ES/scarlett-johansson.jpg", "19:30"),
        Usuario("Anne", "We're going to be parents <3", "https://aws.glamour.es/prod/designs/v1/assets/620x620/636143.jpeg", "19:30")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__chat, container, false)
    }
}