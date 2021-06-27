package com.google.sps.servlets;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.Entity;
import com.google.cloud.datastore.FullEntity;
import com.google.cloud.datastore.KeyFactory;
import java.util.ArrayList;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
    // Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
    //     KeyFactory keyFactory = datastore.newKeyFactory().setKind("Visitor");
    //     FullEntity taskEntity =
    //         Entity.newBuilder(keyFactory.newKey())
    //             .set("title", title)
    //             .set("timestamp", timestamp)
    //             .build();
    //     datastore.put(taskEntity);

    ArrayList<String> facts = new ArrayList<String>();
    facts.add("I love fashion");
    facts.add("I aspire to be a fshion designer");
    facts.add("I have 6 siblings and I'm the 6th");
    String json = convertToJson(facts);

    response.setContentType("application/json;");
    response.getWriter().println(json);
  }

  private String convertToJson(ArrayList<String> facts) {
    Gson gson = new Gson();
    String json = gson.toJson(facts);
    return json;
  }
}
