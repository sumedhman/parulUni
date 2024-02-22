package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.net.InetAddresses;
import android.os.Bundle;
import android.webkit.
//import android.net.Uri;  give the demo on Uri class (web api) see the example webViewLab_14
import java.net.InetAddress;   //give the demo on InetAddress

public class NetworkingApiWithExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_networking_api_with_example);
        // Example usage of InetAddresses.isNumericAddress()
        String ipAddressString = "192.168.0.1";

        // Check if the string is a numeric IP address
        boolean isNumericAddress = InetAddresses.isNumericAddress(ipAddressString);
        //to remove error you need to change the min sdk to 29
        // Display the result
        if (isNumericAddress) {
            System.out.println("The string is a numeric IP address: " + ipAddressString);
        } else {
            System.out.println("The string is not a numeric IP address: " + ipAddressString);
        }

    }
}