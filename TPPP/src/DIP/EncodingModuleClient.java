package DIP;

public class EncodingModuleClient {
	
	public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReaderImpl("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        Writer fileWriter = new FileWriterImpl("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");

        Reader networkReader = new NetworkReaderImpl("http://myfirstappwith.appspot.com/index.html");
        Writer databaseWriter = new DatabaseWriterImpl(new MyDatabase());

        EncodingModule encodingModuleFile = new EncodingModule(fileReader, fileWriter);
        EncodingModule encodingModuleNetworkAndDatabase = new EncodingModule(networkReader, databaseWriter);

        encodingModuleFile.encodeWithFiles();
        encodingModuleNetworkAndDatabase.encodeBasedOnNetworkAndDatabase();
    }

}
