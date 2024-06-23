package ma.java11.httpClient;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.time.Duration;

public class HttpClientNew {
    // An enhanced HttpClient API was introduced in Java 9 preview as an experimental feature.
    // With Java 11, now HttpClient is a standard. It is recommended to use instead of other HTTP Client APIs
    // like Apache Http Client API.
    // It is quite feature rich and now Java based applications can make HTTP requests without using any external dependency.
    //Java 11 inclut un client HTTP standard (dans le module java.net.http) pour une communication HTTP asynchrone et réactive.

    HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .followRedirects(HttpClient.Redirect.NORMAL)
            .connectTimeout(Duration.ofSeconds(20))
            .proxy(ProxySelector.of(new InetSocketAddress("proxy.yourcompany.com", 80)))
            .authenticator(Authenticator.getDefault())
            .build();
}
