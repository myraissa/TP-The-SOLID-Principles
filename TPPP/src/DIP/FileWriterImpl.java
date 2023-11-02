package DIP;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterImpl implements Writer {
    private final String filePath;

    public FileWriterImpl(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public int write(String inputString) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(inputString);
        }
        return 0; // You may want to return something meaningful
    }
}ss