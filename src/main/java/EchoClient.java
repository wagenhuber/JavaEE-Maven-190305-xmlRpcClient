import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;





public class EchoClient {

    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        URL url = new URL(args [0]);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(url);
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Object[] params = {"Hello"};
        String s = (String) client.execute("echo.getEcho", params);
        System.out.println(s);

        String t = (String) client.execute("echo.getEchoWithDate", params);
        System.out.println(t);
    }
}
