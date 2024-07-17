package tech.investia.stock.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;
import tech.investia.stock.models.Stock;

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
                .GET()
                .build();
        String response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString()).body();

//        System.out.println(response);

        String json = "[" +
                response
                + "]";
        Gson gson = new Gson();
        // Create a List<Stock> type token
        Type stockListType = new TypeToken<List<Stock>>() {
        }.getType();
        // Json array to List of objects
        List<Stock> list = gson.fromJson(json, stockListType);
        for (Stock stock : list) {
            System.out.println(stock.getChart().getResult().getFirst().getMeta().getFullExchangeName());
        }
    }

}
