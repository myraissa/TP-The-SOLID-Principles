
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReaderImpl implements Reader {
    private final String url;

    public NetworkReaderImpl(String url) {
        this.url = url;
    }

    @Override
    public String read() throws IOException {
        try (InputStream in = new URL(url).openStream();
             InputStreamReader reader = new InputStreamReader(in)) {
            StringBuilder inputString = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                inputString.append((char) c);
            }
            return inputString.toString();
        }
    }
}