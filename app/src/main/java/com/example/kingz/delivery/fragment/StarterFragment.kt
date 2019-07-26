import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Bundle
import android.provider.Settings
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.kingz.delivery.R
import com.example.kingz.delivery.fragment.RegisterFragment
import com.example.kingz.delivery.fragment.SiginFragment
import kotlinx.android.synthetic.main.fragment_starter.view.*

class StarterFragment : Fragment() {

    lateinit var sign_in_btn: Button
    lateinit var register_btn: Button


    companion object {
        fun newInstance(): StarterFragment {
            var fragment = StarterFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var rootView = inflater!!.inflate(R.layout.fragment_starter, container, false)
        initInstance(rootView)
        return rootView
    }

    fun initInstance(root: View) {

            sign_in_btn = root.sign_in_btn
            register_btn = root.register_btn



        register_btn.setOnClickListener {

            fragmentManager?.beginTransaction()
                    ?.replace(R.id.area_main,RegisterFragment.newInstance(),"register")
                    ?.addToBackStack("register")
                    ?.commit()

        }


        sign_in_btn.setOnClickListener {

            fragmentManager?.beginTransaction()
                    ?.replace(R.id.area_main,SiginFragment.newInstance(),"sign_in")
                    ?.addToBackStack("sign_in")
                    ?.commit()

        }






    }




}