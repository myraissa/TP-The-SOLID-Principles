package DIP;

import java.io.IOException;

public class DatabaseWriterImpl implements Writer {
    private final MyDatabase database;

    public DatabaseWriterImpl(MyDatabase database) {
        this.database = database;
    }

    @Override
    public int write(String inputString) throws IOException {
        return database.write(inputString);
    }
}