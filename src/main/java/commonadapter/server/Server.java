package commonadapter.server;


import adapter.Manager;
import com.zeroc.Ice.Communicator;
import com.zeroc.Ice.Identity;
import com.zeroc.Ice.ObjectAdapter;
import com.zeroc.Ice.Util;
import commonadapter.server.implementation.ManagerImpl;

public class Server {

    public void run(String[] args)
    {
        int status = 0;
        Communicator communicator = null;

        try
        {
            communicator = Util.initialize(args);

            ObjectAdapter adapter = communicator.createObjectAdapterWithEndpoints("Adapter1", "tcp -h localhost -p 10000:udp -h localhost -p 10000");

            Manager manager = new ManagerImpl();

            adapter.add(manager, new Identity("factory1", "factory"));

            adapter.activate();

            System.out.println("server ready");

            communicator.waitForShutdown();
        }
        catch (Exception e)
        {
            System.err.println(e);
            status = 1;
        }
        if (communicator != null)
        {
            // Clean up
            //
            try
            {
                communicator.destroy();
            }
            catch (Exception e)
            {
                System.err.println(e);
                status = 1;
            }
        }
        System.exit(status);
    }


    public static void main(String[] args)
    {
        new Server().run(args);
    }
}
