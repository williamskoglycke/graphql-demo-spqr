package se.tre.lsd.graphqldemo.api.resolver;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLContext;
import io.leangen.graphql.annotations.GraphQLNonNull;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.annotations.GraphQLRootContext;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import io.leangen.graphql.spqr.spring.autoconfigure.DefaultGlobalContext;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import se.tre.lsd.graphqldemo.api.beans.Ball;
import se.tre.lsd.graphqldemo.api.beans.Stuff;

@GraphQLApi
public class StuffQueryService {

    public StuffQueryService() {
    }

    @GraphQLQuery(name = "getStuff")
    public Mono<Stuff> getStuff(@GraphQLRootContext final DefaultGlobalContext<ServerWebExchange> context) {
        return Mono.just(Stuff.of("Stuffy", "Green"));
    }

    @GraphQLQuery
    public Mono<Ball> getBall(@GraphQLContext final Stuff stuff,
                              @GraphQLNonNull @GraphQLArgument(name = "color") final String color,
                              @GraphQLNonNull @GraphQLArgument(name = "name") final String name) {

        return Mono.just(Ball.of(name, color));

    }

}
