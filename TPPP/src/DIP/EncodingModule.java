package DIP;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private final Reader reader;
    private final Writer writer;

    public EncodingModule(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void encodeWithFiles() throws IOException {
        String inputString = reader.read();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        writer.write(encodedString);
    }

    public void encodeBasedOnNetworkAndDatabase() throws IOException {
        String inputString = reader.read();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        writer.write(encodedString);
    }
}