package cristache.georgian.cristian.androidcleanexample.alarmDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs

import cristache.georgian.cristian.androidcleanexample.R


class AlarmDetailFragment : Fragment() {

    val args : AlarmDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val alarmId = args.alarmId
        return inflater.inflate(R.layout.alarm_detail_fragment, container, false)
    }

}
