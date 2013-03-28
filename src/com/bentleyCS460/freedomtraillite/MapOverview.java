package com.bentleyCS460.freedomtraillite;

import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import android.os.Bundle;
import android.widget.Toast;
import android.app.Activity;
import android.graphics.Color;

public class MapOverview extends Activity {

	private GoogleMap mMap;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_overview);
        mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
        //Toast.makeText(this, "Result: " + GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext()), Toast.LENGTH_LONG)
        //.show();
        setUpMapIfNeeded();
        
     // Instantiates a new Polyline object and adds points to define a path
        
        mMap.addMarker(new MarkerOptions()
        .position(new LatLng(42.356412,-71.062462))
        .title("Visitor Center - Trail Start"));
        mMap.addMarker(new MarkerOptions()
        .position(new LatLng(42.373827,-71.05559))
        .title("U.S.S. Constitution - Trail End"));
        
        PolylineOptions rectOptions = new PolylineOptions()
        		.color(Color.RED)
                .add(new LatLng(42.356412,-71.062462)) //Freedom trail visitor center @ Boston common               
        		.add(new LatLng(42.358067,-71.063653))  // Mass state house
                .add(new LatLng(42.35676,-71.061935))  // Park street church
                .add(new LatLng(42.357278,-71.061337)) // 4. Granary burying ground
                .add(new LatLng(42.358,-71.06)) // 5. Kings chapel
                .add(new LatLng(42.358373,-71.060152)) //5a. Kings chapel burying ground
                .add(new LatLng(42.357775,-71.059589)) //6. boston latin, old city hall
                .add(new LatLng(42.357458,-71.058371)) // 7. Old corner bookstore
                .add(new LatLng(42.357069,-71.058589)) // 8. Old South meeting house
                .add(new LatLng(42.358695,-71.057333)) // 9. Old state house
                .add(new LatLng(42.358778,-71.057226)) // 10. Site of Boston massacre
                .add(new LatLng(42.360099,-71.056147)) // Faneuil hall
                .add(new LatLng(42.363724,-71.053689)) // 12. Paul Revere house
                .add(new LatLng(42.366494,-71.054518)) // Old north church
                .add(new LatLng(42.366915,-71.055905)) // 14. Copp's hill burying ground
                //Ocean here
                .add(new LatLng(42.376348,-71.060858)) // Bunker hill monument
        		.add(new LatLng(42.373827,-71.05559)); // USS Constitution
        
        // Get back the mutable Polyline
        Polyline polyline = mMap.addPolyline(rectOptions);
    }

	private void setUpMapIfNeeded() {
	    // Do a null check to confirm that we have not already instantiated the map.
	    if (mMap == null) {
	        mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
	                            .getMap();
	        // Check if we were successful in obtaining the map.
	        if (mMap != null) {
	            // The Map is verified. It is now safe to manipulate the map.

	        }
	    }
	}
}
