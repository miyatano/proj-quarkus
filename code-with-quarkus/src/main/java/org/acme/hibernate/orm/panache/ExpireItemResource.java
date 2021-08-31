package org.acme.hibernate.orm.panache;

import java.net.URI;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import io.quarkus.hibernate.reactive.panache.Panache;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;

@Path("/expireitems")
@ApplicationScoped
public class ExpireItemResource {

    @GET
    public Uni<List<ExpireItem>> get() {
        return ExpireItem.listAll(Sort.by("id"));
    }

    @POST
    public Uni<Response> create(ExpireItem expireItem) {
        return Panache.<ExpireItem>withTransaction(expireItem::persist)
            .onItem().transform(inserted -> Response.created(URI.create("/expireitems/" + inserted.id)).build());
    }

}
