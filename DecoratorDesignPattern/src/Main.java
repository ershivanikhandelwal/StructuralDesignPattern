// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IDataSource ds= new DataSource();
        IDataSource enc= new EncryptionDecorator(ds);
        IDataSource com= new CompressDecorator(enc);
        com.write("Data");
        System.out.println(com.read());
    }
}