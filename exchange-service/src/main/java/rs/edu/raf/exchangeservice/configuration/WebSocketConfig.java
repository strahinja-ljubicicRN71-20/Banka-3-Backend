package rs.edu.raf.exchangeservice.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Autowired
    private StockWebSocketHandler stockWebSocketHandler;


    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(stockWebSocketHandler, "/ws/stocks").setAllowedOrigins("*");
        registry.addHandler(stockWebSocketHandler, "/ws/futures").setAllowedOrigins("*");
        registry.addHandler(stockWebSocketHandler, "/ws/forex").setAllowedOrigins("*");
        registry.addHandler(stockWebSocketHandler, "/ws/contract").setAllowedOrigins("*");
        registry.addHandler(stockWebSocketHandler, "/ws/option").setAllowedOrigins("*");
    }
}
