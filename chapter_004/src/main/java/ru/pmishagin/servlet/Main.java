package ru.pmishagin.servlet;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.ServletContext;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 08.01.2018
 */
public class Main {

    public static void main(String[] args) throws Exception {

       Frontend frontend = new Frontend();

       Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);

        context.addServlet(new ServletHolder(frontend), "/authorm");

        server.setHandler(context);


            server.start();
            server.join();


    }
}
