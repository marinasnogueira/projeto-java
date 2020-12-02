package loja.varejo.controller;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;

@Controller
public class ConnectionController {

	@GetMapping("/connectBD")
	public MongoClientSettings  conectDB(String collection) {
		ConnectionString mongoConnectionString = new ConnectionString("mongodb://127.0.0.1:27017/");
		CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
		CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
		MongoClientSettings clientSettings = MongoClientSettings.builder().applyConnectionString(mongoConnectionString)
				.codecRegistry(codecRegistry).build();
		
		
		return clientSettings;

	}
}
