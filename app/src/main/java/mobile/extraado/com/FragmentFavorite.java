package mobile.extraado.com;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.google.android.material.navigation.NavigationView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentFavorite.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentFavorite#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentFavorite extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    Spinner mySpinner;


    public FragmentFavorite() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentFavorite.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentFavorite newInstance(String param1, String param2) {
        FragmentFavorite fragment = new FragmentFavorite();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_favorite, container, false);


        mySpinner = v.findViewById(R.id.spinner_menu);
        String[] menu_item = {"All","Nail style", "Hair style"};

        ArrayAdapter<String> menuAdapter = new ArrayAdapter<String>(getContext(), R.layout.simple_spinner_text, R.id.tx, menu_item) ;
        mySpinner.setAdapter(menuAdapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                if (!country.getSelectedItem().toString().isEmpty()){
//                    laycountry.setImageResource(R.drawable.tick);
//                }
//                if (position != 0){
//                    laycountry.setImageResource(R.drawable.tick);
//                    code.setText(countriescode[position]);
//                }else{
//                    laycountry.setImageResource(R.drawable.whitedot);
//                    code.setText(countriescode[0]);
//                    layphonenum.setImageResource(R.drawable.whitedot);
//                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
