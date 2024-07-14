package tech.investia.stock.services;

//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//import org.example.models.Quote;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@Service
public class HttpClientService {

    //    https://query1.finance.yahoo.com/v8/finance/chart/AAPL?symbol=AAPL&period1=0&period2=9999999999&interval=1d&includePrePost=true&events=div%7Csplit
    public static void httpClientService() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://query1.finance.yahoo.com/v8/finance/chart/AAPL?symbol=AAPL&period1=0&period2=9999999999&interval=1d&includePrePost=true&events=div%7Csplit")) //.formatted("AAPL")))
//                .header("X-Finnhub-Token", "cpokoq1r01qj9etv9pdgcpokoq1r01qj9etv9pe0")
                .GET()
                .build();
        String response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString()).body();

        System.out.println(response);

//        String json = "[" +
//                response
//                + "]";
//        Gson gson = new Gson();
//        // Create a List<Quote> type token
//        Type quoteListType = new TypeToken<List<Quote>>() {
//        }.getType();
//        // Json array to List of objects
//        List<Quote> list = gson.fromJson(json, quoteListType);
//        for (Quote quote : list) {
//            System.out.println(quote.getC() + " " + quote.getT());
//        }
    }

}
