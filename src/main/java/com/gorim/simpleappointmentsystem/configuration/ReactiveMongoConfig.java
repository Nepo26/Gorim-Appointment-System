package com.gorim.simpleappointmentsystem.configuration;

import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.ReactiveMongoDatabaseFactory;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.SimpleReactiveMongoDatabaseFactory;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories("com.gorim.simpleappointmentsystem")
public class ReactiveMongoConfig {
    @Value("${spring.data.mongodb.uri}")
    private String mongoUri;

    @Value("${spring.data.mongodb.database}")
    private String mongoDatabase;


    public ReactiveMongoDatabaseFactory reactiveMongoDatabaseFactory() {
        return new SimpleReactiveMongoDatabaseFactory(MongoClients.create(mongoUri), mongoDatabase);
    }

    public ReactiveMongoTemplate reactiveMongoTemplate() {
        return new ReactiveMongoTemplate(reactiveMongoDatabaseFactory());
    }
}
