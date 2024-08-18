package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component
public class ConversorJson {
    @Autowired
    private Gson gson;
    public ViaCep converter(String json){
        ViaCep response = gson.fromJson(json, ViaCep.class);
        return response;
    }

}
