public class DataSource implements IDataSource{
    @Override
    public String read() {
        return " Base class ";
    }

    @Override
    public void write(String value) {
        System.out.println(value);
    }
}
