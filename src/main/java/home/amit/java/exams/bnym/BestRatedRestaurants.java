package home.amit.java.exams.bnym;
/*
User :- AmitSingh
Date :- 9/11/2023
Time :- 11:36 AM
Year :- 2023
*/


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class BestRatedRestaurants {

    private static final String API_BASE_URL="https://jsonmock.hackerrank.com/api/food_outlets";


    public List<String> getTopRatedFoodOutlets(String city) throws IOException {

        List<String> highestRatedOutlets= new ArrayList<>();
        int currentPage=1;
        int totalPages=1;
        do{

            String apiUrl=API_BASE_URL+"?city="+city+"&page="+currentPage;
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            connection.addRequestProperty("Content-Type", "application/json");
            InputStream is = connection.getInputStream();
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {

                String jsonResponse=jsonResponse(connection);
                System.out.println("Object is "+jsonResponse);
                JSONObject response= new JSONObject(jsonResponse);
                JSONArray data=response.getJSONArray("data");
                totalPages=response.getInt("total_pages");
                highestRatedOutlets.addAll(findHighestRatedOutlets(data));
                currentPage++;

            }

        } while(currentPage <=totalPages);




    return highestRatedOutlets;


    }


    private String jsonResponse( HttpURLConnection connection) throws IOException
    {

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        // Read the response line by line
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Print the JSON response
        String jsonResponse = response.toString();
        return jsonResponse;

    }



    private List<String> findHighestRatedOutlets(JSONArray data) {

//        JSONObject o = (JSONObject)data.get(0);
//
//        double maxRating=data.stream().map(obj->(JSONObject) obj).mapToDouble(obj->obj.getJSONObject("user_rating").getDouble("average_rating"))
//                .max()
//                .orElse(Double.MIN_VALUE);
//
//        return data.stream().map(obj->(JSONObject) obj)
//                .filter(obj->obj.getJSONObject("user_rating").getDouble("average_rating") ==maxRating)
//                .map(obj->obj.getString("name"))
//                .collect(Collectors.toList());


    return new ArrayList<>();
    }



    public static void main(String[] args) {
        BestRatedRestaurants lBestRatedRestaurants= new BestRatedRestaurants();
        try {
            lBestRatedRestaurants.getTopRatedFoodOutlets("Houston");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
